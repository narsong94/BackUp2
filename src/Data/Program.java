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
		
		System.out.println("ã���� �ϴ� �ܾ �Է��Ͻÿ�");
		s = scan.nextLine();
		
		DataBase(s);

	}
	
	public static void DataBase(String str) throws SQLException, ClassNotFoundException{

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%" + str + "%'";

		// Jdbc ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// ���� / ����
		Connection conn = DriverManager.getConnection(url, "c##sist", "dclass");

		// ����
		Statement st = conn.createStatement();

		// ��� ��������
		ResultSet rs = st.executeQuery(sql);

		while (rs.next())
			System.out.printf("ID : %s TITLE : %s\n", rs.getString("id"),rs.getString("title"));

		rs.close();
		st.close();
		conn.close();
	}

}
