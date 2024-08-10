package jdbchub;

import java.sql.*;
import java.util.*;

public class Demo1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		Demo1 d=new Demo1();
		int id,value=1;
		String name;
		String op1,op2,op3;
		Scanner sc=new Scanner(System.in);
//		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
//		DriverManager.registerDriver(d);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection n=DriverManager.getConnection("jdbc:mysql://localhost:3306/examproject","root","root");
		String op=null;
		if(n!=null)
		{
			System.out.println("Connection created ");
			
		PreparedStatement p=n.prepareStatement("select op1 from question");
			
		ResultSet r=p.executeQuery();
		int i=0;
		Object ob[]=new Object[6];
			while(r.next())
			{
				op=r.getString("op1");
				
				ob[i]=op;
				i++;
			}
			
			for(i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
			}
		}
		else
		{
			System.out.println("Connection not created ");
		}
		
	
	}
	

}
