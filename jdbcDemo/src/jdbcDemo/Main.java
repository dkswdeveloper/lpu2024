package jdbcDemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Connection connection = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu24", "root", "password");
			System.out.println(connection);
			
			// select * from student, select * from student where roll = r
			Statement statement = connection.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.print("enter the roll:");
			int r = sc.nextInt();
			ResultSet resultSet = statement.executeQuery("select * from student where roll = " + r);
			while(resultSet.next())
			{
				// I am on next row
				// get the data from the row what ever you want, then you will go to next row
				// get the data in 2 ways : tell me col number 1, 2,3,4 or column name 
				int rollInt = resultSet.getInt(1); //roll is 1st column
				int rollInt2 = resultSet.getInt("roll");
				String rollStr = resultSet.getString(1);
				String name = resultSet.getString("name");
				String branch = resultSet.getString("branch");
				Date dob = resultSet.getDate("dob");
				System.out.println(rollInt + ":" + name + "," + branch + "," + dob);
			}
			resultSet.close();
			statement.close();
			
			// insert into student values (roll, name , branch, numbooks, dob, pwd, email)
			System.out.println("Insert a student");
			System.out.println("Enter roll");
			int roll = sc.nextInt();
			System.out.println("enter name ");
			String name = sc.next();
			System.out.println("enter branch");
			String branch = sc.next();
			System.out.println("enter dob");
			//String -> Date 
			String dobStr = sc.next();
			Date dob = Date.valueOf(dobStr);
			System.out.println("enter pwd");
			String pwd = sc.next();
			System.out.println("enter email");
			String email = sc.next();
			// insert into student values (roll, name , branch, numbooks, dob, pwd, email)
			String sql = "insert into student values (?,?,?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, roll);
			pst.setString(2, name);
			pst.setString(3,branch);
			pst.setInt(4, 0);
			pst.setDate(5,dob);
			pst.setString(6, pwd);
			pst.setString(7, email);
			int rowsUpdated = pst.executeUpdate();
			System.out.println("no of rows updated = " + rowsUpdated);
			pst.close();
			System.out.println("student added ");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}