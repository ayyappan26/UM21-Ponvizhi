package ultramain.com.business;
import java.util.Scanner;
import ultramain.com.dao.EmployeeDao;
import ultramain.com.util.Scan;
import ultramain.com.util.EmployeeMain;

public class EmployeeBo {
	EmployeeBo dao = new EmployeeBo();

	public void employeeSystem() {
		Scanner scan = Scan.getScannerInstance();
		int choice = 0;
		do {
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		} while (choice == 0);

		switch (choice) {
		case 1:
			viewEmployee(dao);
			break;
		case 2:
			registerEmployee();
			break;
		case 3:
			break;
		}
	}

	public void registerEmployee() {

	}

	public void viewEmployee(EmployeeBo dao) {
		try {
			dao.viewEmployee(dao);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}