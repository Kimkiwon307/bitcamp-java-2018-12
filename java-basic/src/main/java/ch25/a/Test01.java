// JDBC 드라이버 준비 및 DBMS 에 연결하기
package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test01 {
	public static void main(String[] args)  {

		try {
			DriverManager.registerDriver(new org.mariadb.jdbc.Driver());

		} catch (Exception e) {
			System.out.println("MariaDB의 java.sql.Driver 구현체를 등록하는 중에 오류~!!~!~!~!~!~!~!~");
			e.printStackTrace();
		}

		try(Connection con = DriverManager.getConnection(
				"jdbc:mariadb://localhost/bitcampdb", "bitcamp", "1111")){
			System.out.println("DBMS에 연결 성공!");

		}catch(Exception e) {
			System.out.println("DBMS 연결 중 오류 발생");
			e.printStackTrace();
		}



	}
}
