package ultramain.com.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import ultramain.com.util.Scan;
import ultramain.db.connection.ConnectionDB;
public class EmployeeDao {

	public void viewEmployees() throws SQLException {
		Scanner scan = Scan.getScannerInstance();
		Connection con = ConnectionDB.getDbConnection();
		String WhichEmployee;
		System.out.println("enter the first name of employee: ");
		WhichEmployee = scan.nextLine();
		String sqlQuery = "select *from employees where first_name='" + WhichEmployee + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		int employeeID;
		String employeeFirstName;
		String employeeLastName;
		String employeeEmail;

		while (rs.next())
		{
			employeeID = rs.getInt(1); 
			employeeFirstName = rs.getString(2);
			employeeLastName = rs.getString(3);
			employeeEmail = rs.getString(4);

			System.out.println("employeeID : " + employeeID);
			System.out.println("employeeFirstName : " + employeeFirstName);
			System.out.println("employeeLastName : " + employeeLastName);
			System.out.println("employeeEmail : " + employeeEmail);

			System.out.println("_____________");
		}

	}

}
