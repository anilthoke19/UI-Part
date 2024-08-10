package jdbchub;
import java.io.*;
import java.sql.*;



class DBconf
{
	 Connection n2;
 	protected PreparedStatement p;

	public DBconf() {

	try {
	com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	
	 n2=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	}catch(Exception e)
	
	{
		System.out.println(e);
	}
	
	}
	
}
public class DateDemo extends DBconf {
	

	public void FileRepo() throws IOException, SQLException
	{	
		
	
		DateDemo d3=new DateDemo();
		FileReader f2=new FileReader("C:\\java\\newjava\\2nd Test\\demofile.csv");
		
		BufferedReader br=new BufferedReader(f2);
		
		String s;
		while((s=br.readLine())!=null)
		{
			String fetch[]=s.split(",");
			
			d3.AddInData(fetch);
			
		}
		System.out.println(s);
	
		
//		String t="create table notIMP(name varchar(200),address varchar(200),id int(10))";
//		p=n.prepareStatement(t);
//	     int value= p.executeUpdate();
//	     if(value>0)
//	     System.out.println("Table created");
	     
	     
	    	    	 
	}
	
	public void AddInData(String s[])
	{
		

   	 try {
		p=n2.prepareStatement("insert into demoexam2 values(?,?,?)");

   	 
   	 p.setString(1, s[0]);
   	 p.setString(2, s[1]);
   	 p.setInt(3, Integer.parseInt(s[2]));
   	 System.out.println("Data inserted into table");
   	 
   	 p.executeUpdate();

 	} catch (SQLException e) {
		System.out.println(e+"jhb");
	}
		
	}
	
	
	public static void main(String[] args) throws SQLException {
	
	
DateDemo d2=new DateDemo();
try {
d2.FileRepo();
}catch(Exception e)
{
	System.out.println(e);
}

	}
	
	
	
}
