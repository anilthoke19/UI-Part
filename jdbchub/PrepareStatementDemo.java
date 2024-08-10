package jdbchub;
import java.sql.*;

public class PrepareStatementDemo {

	public static void main(String[] args) throws SQLException {
		
	PreparedStatement ps;
	ResultSet rs;
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection nn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		if(nn!=null)
		{
		System.out.println("Connection created ");	
		

		ps=nn.prepareStatement("select*from book");
		
		ps=nn.prepareStatement("insert into id demo book(1)");
		rs=ps.executeQuery();
		
		if(rs.next())
		{
		int dd=rs.getInt("id");
		System.out.println(dd);
		
		}
	
		
		
		}else
		{
			System.out.println("Some problem at connection");
		}
		
		
		
		
		
	}
	
	
	
	
}
