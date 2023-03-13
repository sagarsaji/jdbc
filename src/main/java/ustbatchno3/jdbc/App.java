package ustbatchno3.jdbc;

import java.sql.*;

public class App {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sagar";
	    String username = "root";
	    String password = "pass@word1";
		try {
			Connection conn = DriverManager.getConnection(url, username, password);

		      // Create a statement object
		      Statement stmt = conn.createStatement();

		      // Execute the CREATE TABLE statement
//		      String sql = "CREATE TABLE employeee ("
//		                 + "id INT NOT NULL AUTO_INCREMENT,"
//		                 + "name VARCHAR(255),"
//		                 + "age INT,"
//		                 + "department VARCHAR(255),"
//		                 + "PRIMARY KEY (id)"
//		                 + ")";
//		      stmt.executeUpdate(sql);
		      
//		      String sql = "insert into employeee values(2,\"sasi\",21,\"fsd\");";
//		      stmt.executeUpdate(sql);
		      
//		      String sql = "insert into employeee values (2,\"abu\",22,\"fsd\");";
//		      stmt.executeUpdate(sql);
//
		     	String sql = "insert into employeee values (3,\"kodiyan\",23,\"fsd\");";
		     	stmt.executeQuery(sql);
//		      
		      //stmt.executeQuery("select * from employeee");
//		      ResultSet rs=stmt.executeQuery("select * from employeee");  
//		      while(rs.next())  
//		    	  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
		      
		      //System.out.println("Employee table created successfully!");

		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
	}
}
