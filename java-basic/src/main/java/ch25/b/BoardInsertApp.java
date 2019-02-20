// 연습 - 게시물 등록
package ch25.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class BoardInsertApp {

	// 다음과 같이 게시물을 등록하는 프로그램을 작성하라
	//---------------------------------
	// 제목 ? aaaa
	// 내용?  bbbb
	// 등록하시겠습니까?(Y/n)
	// 등록하였습니다.
	//-----------------------------------
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);	
		try(Connection con = DriverManager.getConnection(
				"jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")){
			System.out.println("디비엠에스 연결됨!");
			try(Statement stmt = con.createStatement()){


				System.out.print("제목 :");
				String s =kb.nextLine();

				System.out.print("내용 :");
				String c = kb.nextLine();

				System.out.print("등록하시겠습니까?(Y/n)");
				String command = kb.nextLine();

				if(command.equalsIgnoreCase("y") || command.equals(" ")) {
					System.out.println("등록하였습니다");

					
					stmt.executeUpdate("insert into x_board(title,contents)" 
									+ " values( '"+s+"','"+c+"')");
				}

			}
		}catch(Exception e) {
			System.out.println("DBMS 연결 중 오류 발생");
			e.printStackTrace();
		}	






	}

}
