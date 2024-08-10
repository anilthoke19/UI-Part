package jdbchub;
import java.sql.*;
import java.util.*;
public class JdbcOperation {
	
	public static void main(String[] args) throws SQLException {
		int choice,id;
		String name,contact,address,email;
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		if(c!=null) {
			System.out.println("Connection created");
		Statement s=c.createStatement();
		
		do {
			Scanner sc=new Scanner(System.in);
		System.out.println("1: create table ");
		System.out.println("2: Insert five record ");
		System.out.println("3: dipplay all record ");
		System.out.println("4: display all record using  all column values");
		System.out.println("5: Display only name ,email,and contact ");
		System.out.println("6: display distinct name ");
		System.out.println("7: delete query whose id is 1");
		System.out.println("8: delete query when id=4 and name=ram");
		System.out.println("9: update whose name =ram and id =1");
		System.out.println("10: change name,email and contact whose id =3");
		
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		
switch(choice) {
		
case 1:
		String T="create table studentt"+ "(sid int,sname varchar(10),smail varchar(20),scontact varchar(20),saddress varchar(20) )" ;
		s.executeUpdate(T);
		break;
		
		
case 2:
	System.out.println("enter Student id,name ,contact,email,address");
	id=sc.nextInt();
	name=sc.next();
	contact=sc.next();
	email=sc.next();
	address=sc.next();
	
	
	s.executeUpdate("insert into studentt values("+id+",'"+name+"',' "+email+"','"+contact+"',' "+address+" ')");
	System.out.println("Value inserted");
	
	break;
	
case 3:
	ResultSet r=s.executeQuery("select*from studentt");
	
	
	while(r.next())
	{
		name=r.getString("sname");
		id=r.getInt("sid");
		address=r.getString("saddress");
		contact=r.getString("scontact");
		email=r.getString("smail");
		System.out.println(id+" "+name+" "+address+" "+contact+" "+email);
		
		
	}
	
	break;
	
case 4:
ResultSet r2=s.executeQuery("select*from studentt");
{
	
	//System.out.println("Enter column name for get values");
	//String ss=sc.next();
	while(r2.next())
	{
System.out.println(r2.getNString("smail"));	}
	
}

	break;
	
case 5:
	r=s.executeQuery("select sname ,smail,scontact from studentt ");
	
	while(r.next())
	{
		name=r.getString("sname");
		email=r.getString("smail");
		contact=r.getString("scontact");
		
		System.out.println(name+" "+email+" "+contact);	
	}
	break;
	
case 6:
	r=s.executeQuery("select distinct sname from studentt");
	while(r.next())
	{
		
	System.out.println(r.getString("sname"));	
		
	}
	break;
	
case 7:
	System.out.println("Enter id for delete record ");
	id=sc.nextInt();
	s.executeUpdate("delete from studentt where sid= "+id+" ");
	
	System.out.println("record deleted");
	break;
	
case 8:
	System.out.println("Enter id and name for delete record ");
	id=sc.nextInt();
	name=sc.next();
	s.executeUpdate("delete from studentt where sid="+id+" and sname="+name+" ");
	System.out.println("record deleted");
	break;
	
case 9:
	System.out.println("Enter  name for update record on index 1");
	name=sc.next();
    
	//s.executeQuery("update stdentt set ")
	
	
	break;
	
	
	
	
	
	
	
	
		
      
}
		
		
		}while(true);
		
		
		
		
		
		}
		
		
		
		
		
		
	}

}
