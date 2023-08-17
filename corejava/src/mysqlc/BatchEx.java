package mysqlc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BatchEx {

	
		public  static void insert(List<PersonEntity> personEntities) throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dbstudent";
			Connection c=DriverManager.getConnection(url,"root","1312");
			String query="INSERT INTO emp3(id,name) values(?,?)";
			PreparedStatement ps1=c.prepareStatement(query);
			for(PersonEntity pe : personEntities) {
				ps1.setInt(1, pe.getId());
				ps1.setString(2, pe.getName());
				ps1.addBatch();
			
			ps1.executeBatch();
			}
		}
		
		public static void main(String[] args)throws  SQLException, ClassNotFoundException {
		List<PersonEntity> l=new ArrayList<>();
		l.add(new PersonEntity(3,"nisha"));
		l.add(new PersonEntity(4,"isha"));
		
System.out.println(" record inserted ");
		
		}
}
