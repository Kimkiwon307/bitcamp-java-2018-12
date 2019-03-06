
package ch26.e;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01 {

	public static void main(String[] args) throws Exception {
		
		
		InputStream inputStream = Resources.getResourceAsStream("ch26/e/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		// in-parameter 값을 넘기지 않고 SQL 실행하기
		List<Board> boards = sqlSession.selectList("board.select1"); // OK!
		for(Board b : boards) {
			System.out.println(b);
		}
		
		System.out.println("-----------------------------------------------------------------------------");
		
		
		Board board = sqlSession.selectOne("board.select2",6);
		System.out.println(board);

		System.out.println("----------------------------------------------------------------------------------");
		
		List<Board> boards2 = sqlSession.selectList("board.select3","aa"); // OK!
		for(Board b : boards2) {
			System.out.println(b);
		}
		
	
	
	
	}

}