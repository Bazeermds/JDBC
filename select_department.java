package Continer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public class select_department {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/aim";
		String user="root";
		String pass="";
		
		try {
			Connection	con = DriverManager.getConnection(url,user,pass);
		
		String q="select*from employee where edepartment='banking' ";
		PreparedStatement pst=con.prepareStatement(q);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("eid"));
			System.out.println((rs.getString("ename")));
			System.out.println(rs.getInt("esalary"));
			System.out.println((rs.getString("edepartment")));
			
		}con.close();
		}catch(Exception e)
		{
			System.out.println("resion :"+e);
		}
	}

}
