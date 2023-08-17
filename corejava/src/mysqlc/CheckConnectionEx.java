package mysqlc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckConnectionEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dbstudent";
		Connection c = DriverManager.getConnection(url, "root", "1312");
		System.out.println(c);
		System.out.println("Database dbstudent connection sucessfully established.");
		Statement stmt;
		stmt = c.createStatement();
		String query1 = "INSERT INTO college values(7,'VGKM',9)";

		stmt.execute(query1);
		System.out.println("record inserted in the table");
		ResultSet rs = null;
		rs = stmt.executeQuery("select * from college");

		System.out.println("No of Records:");
		while (rs.next()) {
			// Display values
			System.out.print(",CID: " + rs.getInt("cid"));
			System.out.print(", Email Id: " + rs.getString("email_address"));
			System.out.println(", college Name: " + rs.getString("cname"));
			System.out.println(", last Name: " + rs.getString("last_name"));
			System.out.print("CRANK: " + rs.getInt("crank"));

		}
	}

}
