
package ch26.d;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test05 {

	public static void main(String[] args) throws Exception {
		
		
		InputStream inputStream = Resources.getResourceAsStream("ch26/d/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		Map<?,?> map = sqlSession.selectOne("board.select6"); // OK!
		System.out.println(map);
		System.out.println(map.get("board_id"));
		System.out.println(map.get("title"));
		System.out.println(map.get("contents"));
		System.out.println("--------------------------------------");
//		sqlSeeion 만드는 과정이 복잡해서 팩토리 를 만들어야하는데 이것 또한 복잡하니 빌더를 이용
		
		List<Map<?,?>>list = sqlSession.selectList("board.select7");
		for(Map<?,?> m : list) {
			System.out.println(m);
		}
	
	
	}

}
