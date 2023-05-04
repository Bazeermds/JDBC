package Continer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Scanner;

public class CRUD_operation {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/aim";
		String user="root";
		String pass="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id no :");
		int id=sc.nextInt();
		
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		
	    sc.nextLine();
		System.out.println("Enter the date of birth");
		String dob=sc.nextLine();
		System.out.println("enter the gender ");
		String gender=sc.nextLine();
		System.out.println("enter the course :");
		String course=sc.nextLine();
		System.out.println("Enter the fees");
		int fees=sc.nextInt();
		
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			
			String q="insert into student values(?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(q);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, dob);
		pst.setString(4,gender);
		pst.setString(5,course);
		pst.setInt(6,fees);
		 
		int n=pst.executeUpdate();
		System.out.println((n>=1)?"inserted":"no inserted");
	con.close();
	
		
		}catch(Exception e)
		{
			System.out.println("Resion :"+e);
		}

	}

}
