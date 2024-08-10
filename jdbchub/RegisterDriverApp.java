package jdbchub;
import java.sql.*;
import java.util.*;
public class RegisterDriverApp {
  
	public static void main(String[] args) throws SQLException{
	Scanner sc=new Scanner(System.in);
		int choice,id;
		String name,email,salary,contact;
		
		com.mysql.cj.jdbc.Driver d=new com .mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);

		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	  if(c!=null)
	  {
		  System.out.println("connection success");
		  Statement s=c.createStatement();
		  
		
		  
		  do {
		  System.out.println("1:Create Table ");
		  System.out.println("2: Insert value in table  ");
		  System.out.println("3: Display all record on table  ");
		  System.out.println("4: Update employee record ");
		  System.out.println("5: delete employee by name ");
		  System.out.println("Enter your choice ");
		  choice=sc.nextInt();

		 
		  switch(choice)
		  {
		  case 1:
		  String T="create table employee"+"(Eid int ,ename varchar(10),Eemail varchar(20),Esal varchar(20),Econtact varchar(20))";
		  s.executeUpdate(T);
		  break;
		  
		  case 2:
			  System.out.println("Enter id,name,email,salary and contact ");
			  id=sc.nextInt();
			  name=sc.next();
			  salary=sc.next();
			  email=sc.next();
			  contact=sc.next();
			  
			int value=  s.executeUpdate("insert into employee values("+id+",'"+name+"','"+email+"','"+salary+" ','"+contact+"')");
			  System.out.println("Recorde inserted");
			  
			  break;
			  
			  
		  case 3:
			  
			 ResultSet r= s.executeQuery("select*from employee");
			 
			 while(r.next())
			 {
				 id=r.getInt("Eid");
				 name=r.getString("Ename");
				 salary=r.getString("Esal");
				 email=r.getString("Eemail");
				 contact=r.getString("Econtact");
				 
				 System.out.println(id +" "+name+" "+salary+" "+email+" "+"contact "); 
			 }
			 
			  break;
		  
		  case 4:
			  System.out.println("Enter employee id for update name");
			  id=sc.nextInt();
			  
			  System.out.println("Enter  name");
			  name=sc.next();
			  
			  s.executeUpdate("update employee set Eid= 5 where Ename=' "+name+"' ");
			  
			  System.out.println("Update successfully");
			 
			  
			  break;
			  
		  case 5:
			  System.out.println("enter name for delete record ");
			  name =sc.next();
			  
			  s.executeUpdate("delete from employee where Ename= '"+name+"'");
			  System.out.println("deleted sucessfully");
			  
			  break;
			  
			  
			  
			  
			  
		  }
		  
			  
			  
		  }while(choice<6);
		  
		  
		  
		  
		  
		
		  
		  
	  }else
	  {
		  System.out.println("Connection failed");
	  }
		
	
	}

}
