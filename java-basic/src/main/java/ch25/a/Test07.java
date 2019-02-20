//  java.sql.ResultSet 객체 - 서버에서 select 의 결과를 가져오기
package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test07 {
	public static void main(String[] args)  {

		try(Connection con = DriverManager.getConnection(
				"jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")){
			System.out.println("디비엠에스 연결됨!");

			try(Statement stmt = con.createStatement()){
				try(	ResultSet rs = stmt.executeQuery
						("select * from x_board order by board_id desc")){

					while(rs.next()) {
						System.out.printf("%d, %s, %s, %s, %d\n",
								rs.getInt(1), rs.getString(2),rs.getString(3),
								rs.getDate(4),
								rs.getInt(5));
					}
				}

			}
		}catch(Exception e) {
			System.out.println("DBMS 연결 중 오류 발생");
			e.printStackTrace();
		}
	}
}
