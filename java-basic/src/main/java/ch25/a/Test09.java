//  java.sql.ResultSet 객체 - 서버에서 select 의 결과를 가져오기 III 
package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test09 {
	public static void main(String[] args)  {

		try(Connection con = DriverManager.getConnection(
				"jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")){
			System.out.println("디비엠에스 연결됨!");

			try(Statement stmt = con.createStatement()){
				try(ResultSet rs = stmt.executeQuery("select * from x_board order by board_id desc")){

					while(rs.next()) {
						System.out.printf("%s, %s, %s, %s, %s\n",
								rs.getString("board_id"), rs.getString("title"),rs.getString("contents"),
								rs.getString("Created_date"),
								rs.getString("view_count"));
					}
				}
			}
		}catch(Exception e) {
			System.out.println("DBMS 연결 중 오류 발생");
			e.printStackTrace();
		}
	}
}
