//  DBMS에 연결하기 - java.sql.Driver 구현체 자동 등록 II
package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test03 {
	public static void main(String[] args)  {

		try(Connection con = DriverManager.getConnection(
				"jdbc:mariadb://localhost/bitcampdb", "bitcamp", "1111")){
			System.out.println("DBMS에 연결 성공!");

		}catch(Exception e) {
			System.out.println("DBMS 연결 중 오류 발생");
			e.printStackTrace();
		}
	}
}
