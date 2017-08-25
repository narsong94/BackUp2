package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("찾고자 하는 단어를 입력하시오");
		s = scan.nextLine();
		
		DataBase(s);

	}
	
	public static void DataBase(String str) throws SQLException, ClassNotFoundException{

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%" + str + "%'";

		// Jdbc 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 연결 / 인증
		Connection conn = DriverManager.getConnection(url, "c##sist", "dclass");

		// 실행
		Statement st = conn.createStatement();

		// 결과 가져오기
		ResultSet rs = st.executeQuery(sql);

		while (rs.next())
			System.out.printf("ID : %s TITLE : %s\n", rs.getString("id"),rs.getString("title"));

		rs.close();
		st.close();
		conn.close();
	}

}
