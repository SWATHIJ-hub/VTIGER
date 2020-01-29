package trainingclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.gjt.mm.mysql.Driver;
import org.testng.annotations.Test;

public class InsterData
{

	Connection con;
	@Test
	public void sampleTest() throws SQLException
	{
		
		try
		{
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root", "admin");
	    Statement state = con.createStatement();
		String query="insert into students_info(regno,firstname,middlename,lastname) values('9','abcd','fzx','zz')";
		
		int result = state.executeUpdate(query);
		if(result==1)
		{
			System.out.println("data is inserted");
		}
		ResultSet result1 = state.executeQuery("select * from students_info");
		while(result1.next())
		{
			System.out.println(result1.getInt(1)+"  "+result1.getString(2)+"  "+result1.getString(3)+"  "+result1.getString(4));
		}
		}
		catch (Exception e)
		{
			System.err.println("data is not instered");
			
		}
		finally 
		{
			con.close();
			
		}
			
		}
		
		
		
		
		
		
		

}
