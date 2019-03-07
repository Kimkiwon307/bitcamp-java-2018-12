//dynamic SQL다루기 - 조건문 
package ch26.g;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01 {

	public static void main(String[] args) throws Exception {


		InputStream inputStream = Resources.getResourceAsStream("ch26/g/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory =
				new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 조건문 사용하기

		Scanner keyboard = new Scanner(System.in);
		System.out.print("게시물 번호? ");
		String keyword = keyboard.nextLine();
		keyboard.close();

		Board board =	sqlSession.selectOne("board.select1",Integer.parseInt(keyword));
		System.out.println(board);
		System.out.println("-----------------------------------------------------------------------------");


	}

}
