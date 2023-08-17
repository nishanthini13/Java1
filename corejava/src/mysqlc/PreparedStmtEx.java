package mysqlc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dbstud";
		Connection c=null;
		//String url=null;
		c=DriverManager.getConnection(url,"root","1312");
	
		//PreparedStatement ps= c.prepareStatement(u);
		String u="insert into emp1 values (?,?,?)";
		PreparedStatement ps= c.prepareStatement(u);
		ps.setInt(8, 90);
		ps.setString(8, "ABCD");
		ps.setString(9, "u");
		ps.setInt(0, 10);
		int i=ps.executeUpdate();
		System.out.println(" record inserted :" +i);
		c.close();
		//ps.execute();
		//System.out.println(" table created");
	}

}
