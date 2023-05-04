package Continer;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class delete_empoyeerow {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/aim";
		String user="root";
		String pass="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id  :");
		int eid=sc.nextInt();
		try {
		Connection con=DriverManager.getConnection(url,user,pass);
	
		String q="delete from employee where eid=?";
		PreparedStatement pst=con.prepareStatement(q);
		
		pst.setInt(1, eid);
		
		int n=pst.executeUpdate();
		
		System.out.println((n>=1)?"deleted ":"not deleted");
		
		}catch(Exception e)
		{
		System.out.println("Resion :"+e);
		}

}
}