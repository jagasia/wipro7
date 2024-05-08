import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(12, "Alex", "ECE", 100000));
		employees.add(new Employee(10, "John", "EEE", 100000));
		employees.add(new Employee(11, "Zaheer", "ECE", 100000));
		employees.add(new Employee(22, "Babu", "EEE", 100000));
		employees.add(new Employee(18, "Kumar", "ECE", 100000));
		employees.add(new Employee(15, "Chandru", "ECE", 100000));
		employees.add(new Employee(16, "Muruga", "CSE", 100000));
		employees.add(new Employee(14, "Prasad", "ECE", 100000));
		employees.add(new Employee(21, "Sathish", "Mech", 100000));
		employees.add(new Employee(13, "Dinesh", "IT", 100000));
		
		System.out.println("1: Sort by Id\r\n"
				+ "2: Sort by Name\r\n"
				+ "3: Sort by Department\r\n"
				+ "4: Sort by Salary");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: //by id
			Collections.sort(employees);
			break;
		case 2: //by name
			Collections.sort(employees,new EmployeeNameComparator());
			break;
		case 3: //by department
			Collections.sort(employees,new EmployeeDepartmentComparator());
			break;
		case 4: //by salary
			Collections.sort(employees,new EmployeeSalaryComparator());
			break;
		}
		
		for(Employee e : employees)
		{
			System.out.println(e);
		}
	}

}
