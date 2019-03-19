package ch29.g;

import java.beans.PropertyEditorSupport;

// 스프링 IoC 컨테이너에서 사용할 프로퍼티 에디터 만들기
// =>  java.beans.PropertyEditor 인터페이스를 구현하면 된다
//		문제는 인터페이스에 선언된 메서드가 너무 많아 클래스로 구현하기가 매우 번거롭다.
// =>  java.beans.property
public class MyCustomBlackBoxEditor extends PropertyEditorSupport{

	// 스프링 IoC컨테이너는 Stirng을 
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String[] a =text.split(",");
		
		BlackBox blackBox = new BlackBox();
		blackBox.setMaker(a[0]);
		blackBox.setModel(a[1]);
	
		this.setValue(blackBox);
	}
}
