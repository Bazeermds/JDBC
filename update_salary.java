package Continer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update_salary {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/aim";
		String user="root";
		String pass="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id  :");
		int eid=sc.nextInt();
		System.out.println("Enter the new salary for employee");
	int salary=sc.nextInt();
		try {
		Connection con=DriverManager.getConnection(url,user,pass);
	
		String q="update employee set esalary=? where eid=? and esalary>22000";
		PreparedStatement pst=con.prepareStatement(q);
		
		
		
		pst.setInt(2, eid);
		
			pst.setInt(1, salary);
		
		
		
		int n=pst.executeUpdate();
		
		System.out.println((n>=1)?"updated ":"not updated");
		
		}catch(Exception e)
		{
		System.out.println("Resion :"+e);
		}	
	
	}

}
