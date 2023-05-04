package Continer;
// qustion 1
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Insert {

	public static void main(String[] args) {
		 {
			String url="jdbc:mysql://localhost:3306/aim";
			String user="root";
			String pass="";
			try
			{
				Connection con=DriverManager.getConnection(url,user,pass);
				
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the  Employee id :");
				int eid=sc.nextInt();
				
			
				System.out.print("Enter the Employee department :");
				String edepartment=sc.nextLine();
				sc.nextLine();
				System.out.print("enter the Employee Name :");
				String ename=sc.nextLine();
				System.out.print("Enter the Employee salary  :");
				int  esalary=sc.nextInt();
				
				
				String q="insert into employee values(?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(q);
				
			
			
				pst.setInt(1,eid);
				pst.setString(2,ename);
				pst.setInt(3,esalary);

				pst.setString(4,edepartment);
			
						
				int n=pst.executeUpdate();
				System.out.println((n>=1)?"inserted":"not inserted");
				con.close();
				
			}
		    catch(SQLException e)
		    {
		    System.out.println("reason :"+e);
		    
		    }

	}
	}
}


