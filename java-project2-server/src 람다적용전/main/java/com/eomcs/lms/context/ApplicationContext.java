package com.eomcs.lms.context;// Command 객체를 자동 생성하는 역할을 수행한다.

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;

import com.eomcs.lms.handler.Command;

public class ApplicationContext {

	ArrayList<Class<?>> classes = new ArrayList<>();
	
	public ApplicationContext(String packageName) throws Exception {


		// 1) 패키지명으로 디렉토리 경로를 알아낸다.
		File packageDir = Resources.getResourceAsFile(packageName.replace(".", "/"));

		// 2) 해당 패키지 폴더와 그 하위 폴더를 뒤져서 클래스 이름을 알아낸다.
		// => 인스턴스를 생성할 수 없는 인터페이스나 추상 클래스는 제외한다.
		// => 또한 중첩 클래스도 제외한다.
		findClasses(packageDir,packageName);

		//3)Command 인터페이스를 구현한 클래스만 찾아서 인스턴스를 생산한다.
		prepareCommand();

	}

	private void findClasses(File dir, String packageName) throws Exception{
		// 디렉토리를 뒤져서 클래스 파일(.class)이나 하위 디렉토리 목록을 알아낸다.

		//		File[] files = dir.listFiles(); <- 이러면 모든목록
		
		
		File[] files = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if(pathname.isDirectory())
					return true;
				if(pathname.getName().endsWith(".class") && !pathname.getName().contains("$"))
					return true;
				return false;
			}
		});
		
		
		for(File f : files) {
			if(f.isFile()) {
				// 클래스 파일일 경우, 클래스를 로딩한 후 인스턴스를 생성할 수 있는 일반 클래스인지 확인하여
				// 클래스 관리 목록에 추가한다.
				String filename = f.getName();
				String className = packageName + "." + filename.substring(0,filename.indexOf('.'));

				Class<?> clazz = Class.forName(className);

				if(clazz.isLocalClass() || clazz.isInterface() || clazz.isEnum())
					continue;
				if(Modifier.isAbstract(clazz.getModifiers()) ||
						!Modifier.isPublic(clazz.getModifiers()))
					continue;

				classes.add(clazz);

			}else {
				//디렉토리일 경우 그 하위 디렉토리에서 다시 클래스를 찾는다.

				findClasses(f,packageName + "." + f.getName());
			}
		}
	}
	
	private void prepareCommand() throws Exception{
		for(Class<?> clazz : classes) {
			//클래스가 구현한 인터페이스의 목록을 꺼낸다.
			List<Class<?>> interfaces = getAllInterfaces(clazz);
			
			for(Class<?> i : interfaces) {
				
				//Command 인터페이스의 구현체인 경우에만 클래스 이름을 출력한다.
				if(i == Command.class) {
					System.out.println(clazz.getName());
					break;
				}
			}
		}
	}
	
	private List<Class<?>> getAllInterfaces(Class<?>clazz){
		ArrayList<Class<?>> list = new ArrayList<>();
		
		while(clazz != Object.class) {
			Class<?>[] interfaces = clazz.getInterfaces();
			for(Class<?> i : interfaces)
				list.add(i);
			clazz = clazz.getSuperclass();
		
		}
		return list;
		
		
		
	}
}
