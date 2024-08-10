package jdbchub;
import java.sql.*;
import java.sql.DriverManager;

public class CollableProcedure {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
//		com.mysql.cj.jdbc.Driver d=new com .mysql.cj.jdbc.Driver();
//		DriverManager.registerDriver(d);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection n=DriverManager.getConnection("jdbc:mySql://localhost:3306/demo","root","root");
		
		if(n!=null)
		{
			System.out.println("connection created");
			
			
			CallableStatement c = n.prepareCall("{call pro(?,?,?)}");
			c.setInt(1,1);
			c.setString(2, "anil");
			c.setString(3, "32312");
			
			 c.execute();
			
			
			
			
			
			
		}else
		{
			System.out.println("Some problem at connection");
		}
		
		
	}

}
