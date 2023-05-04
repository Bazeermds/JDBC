package Continer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class select_salary {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/aim";
		String user="root";
		String pass="";
		Scanner sc=new Scanner(System.in);
		try{System.out.println("Select the minimum salary");
		int min=sc.nextInt();
		System.out.println("Select the maximum salary");
		int max=sc.nextInt();
		
			Connection	con = DriverManager.getConnection(url,user,pass);
		
		String q="select*from employee where esalary between ? and ?";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setInt(1, min);
		pst.setInt(2, max);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt("eid")+" ");
			System.out.print((rs.getString("ename"))+" ");
			System.out.print(rs.getInt("esalary")+" ");
			System.out.print((rs.getString("edepartment"))+" ");
			System.out.println();
		}con.close();
		}catch(Exception e)
		{
			System.out.println("resion :"+e);
		}

	}

}
