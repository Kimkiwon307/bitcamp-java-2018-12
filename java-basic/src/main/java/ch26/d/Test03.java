
package ch26.d;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test03 {

	public static void main(String[] args) throws Exception {
		
		
		InputStream inputStream = Resources.getResourceAsStream("ch26/d/mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		//
		Board2 board = sqlSession.selectOne("board.select4"); // OK!
		System.out.println(board);
//		sqlSeeion 만드는 과정이 복잡해서 팩토리 를 만들어야하는데 이것 또한 복잡하니 빌더를 이용
	}

}
