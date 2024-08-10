package jdbchub;
import java.util.*;
import java.sql.*;
import java.security.*;


public class Empolyee21_2 {
public static void main(String[] args)throws SQLException{
	int choice,id;
	String name,email,sal,contact;
	String query;
	
	com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	
	Connection n=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	
	if(n!=null)
	{
		System.out.println("Connection created");
		//Statement s=n.createStatement();
		PreparedStatement s;
	
		
		do {
			Scanner sc=new Scanner(System.in);
		System.out.println("1: Create Table");
		System.out.println("2:insert 10 record ,id ,name,email,sal,contact");
		System.out.println("3: Display all record of table");
		System.out.println("4: show whose id=1 and name =ram and salary>10000 ");
		System.out.println("5;show whose name not ram and salary<1000 ");
		System.out.println("6;show whose name ram and salary not <10000 ");
		System.out.println("7: show whose email is shyam@gmail and salary is 20000 ");
		System.out.println("8:show whose salary<30000 and namee is ramesh");
		System.out.println("9: update employee whose id=1 amd name=shyam");
		System.out.println("10:show employee whose salary 10000,20000,30000 ");
		System.out.println("11:show employee whose salary not 10000,20000,30000 ");
		System.out.println("12:show employee whose salary between 10000,60000 ");
		System.out.println("13:show employee whose salary 10000,20000,30000 and name is ramesh ");
		System.out.println("14:show employee whose name is rm ,shyam and ganesh");
		System.out.println("15:show employee whose salary less than 10000 and name is shyam and dinesh ");
		
		System.out.println("Enter choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		//	query ="create table employees"+"(eid int,ename varchar(20),Eemail varchar(20),Esal varchar(20),Econtact varchar(20))";
			PreparedStatement pp=n.prepareStatement("create table employees2"+"(eid int,ename varchar(20),Eemail varchar(20),Esal varchar(20),Econtact varchar(20))");

			pp.executeUpdate();
			System.out.println("Table created ");
			break;
			
        case 2:
			s=n.prepareStatement("insert into employees values(?,?,?,?,?)");
        	System.out.println("Enter id ,name ,salary ,email,contact");
        	 id=sc.nextInt();
        	 name=sc.next();
        	 sal=sc.next();
        	 email=sc.next();
        	 contact=sc.next();
        	s.setInt(1, id);
        	s.setString(2, name);
        	s.setString(3, email);
        	s.setString(4, sal);
        	s.setString(5, contact);
       int a=s.executeUpdate();
       if(a==1)
        	System.out.println("Data inseretd into table ");
       else
    	   System.out.println("data not inserted");
			break;
			
        case 3:
        s=n.prepareStatement("select*from employees");
      ResultSet r=s.executeQuery();
      
      while(r.next())
      {
  System.out.print( r.getInt("Eid")+" ");
   System.out.print( r.getString("Ename")+" ");
   System.out.print(r.getString("Eemail")+" ");
   System.out.print( r.getString("Econtact")+" ");
    System.out.println(r.getString("Esal")+" ");	  
   
      }
 
        	break;
        	
        	
        case 4:
        	s=n.prepareStatement("select *from employees where eid=? and ename=? and esal>? ");
       s.setInt(1, 1);
       s.setString(2, "anil");
       s.setString(3,"40000");
      
        r=s.executeQuery();
        
        while(r.next())
        {
        	  System.out.print( r.getInt("Eid")+" ");
        	   System.out.print( r.getString("Ename")+" ");
        	   System.out.print(r.getString("Eemail")+" ");
        	   System.out.print( r.getString("Econtact")+" ");
        	    System.out.println(r.getString("Esal")+" ");
        }
        	
        	break;
        	
        case 5:
        	PreparedStatement p2=n.prepareStatement("select *from employees where ename!=? and esal<? ");
        	p2.setString(1, "ram");
        	p2.setInt(2,10000);
        	
        	ResultSet r2=p2.executeQuery();
        	 while(r2.next())
             {
             	  System.out.print( r2.getInt("Eid")+" ");
             	   System.out.print( r2.getString("Ename")+" ");
             	   System.out.print(r2.getString("Eemail")+" ");
             	   System.out.print( r2.getString("Econtact")+" ");
             	    System.out.println(r2.getString("Esal")+" ");
             }
        	
        	
        	
        	break;
        	
        case 6:
        	break;
        	
        case 7:
        	break;
        	
        case 8:
        	break;
        	
        case 9:
        	break;
        	
        case 10:
        	break;
        	
        case 11:
        	break;
        	
        case 12:
        	break;
        	
        case 13:
        	
        	break;
        	
        case 14:
        	
        	break;
        		
        case 15:
        	break;
        	
        	
        	
		
		
		
		}
		





       





			
			
		}while(true);
		
		
		
		
	}else
	{
		System.out.println("Some problem here");
		
		
	}
	
	
	
	
	
}
}
