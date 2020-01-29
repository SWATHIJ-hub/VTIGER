package trainingclass;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.gjt.mm.mysql.Driver;
import org.testng.annotations.Test;

public class DemoJdbc
{
	@Test
	public void sampleTest() throws SQLException
	{
		//step1:Register the driver/database
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		//step 2:connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root", "admin");
		//step 3: issue/create sql statements
		Statement state = con.createStatement();
		String query="select * from students_info";
		//step 4: execute sql qurey
		ResultSet result = state.executeQuery(query);
		
		//process the result
		while(result.next())
		{
			System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getString(3)+"  "+result.getString(4));
		}
		// step 5: close the connection
		con.close();
		
	}


}
