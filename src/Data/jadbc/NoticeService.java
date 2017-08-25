package Data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NoticeService {
	public List<Notice> getList() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		List<Notice> list = new ArrayList<>();
		
		while (rs.next()) {
			Notice n = new Notice();
			
			n.setId(rs.getString("id"));
			n.setTitle(rs.getString("title"));
			n.setContent(rs.getString("content"));
//			n.setRegDate(rs.getDate("date"));
			n.setHit(rs.getInt("hit"));
			
			list.add(n);
		}
		rs.close();
		st.close();
		conn.close();

		return list;
		
	}

	public void insert(String id, String title, String content) throws ClassNotFoundException, SQLException{
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "INSERT INTO NOTICE(ID, TITLE, CONTENT, HIT) VALUES('"+ id + "','" + title + "','" + content + "', 0)";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = conn.createStatement();
		
		st.executeUpdate(sql);

		st.close();
		conn.close();
	}
}
