import java.util.HashSet;
import java.util.Set;

public class App2 {

	public static void main(String[] args) {
		Set<Employee> employees=new HashSet<>();
		employees.add(new Employee(12, "Alex", "ECE", 100000));
		employees.add(new Employee(10, "John", "EEE", 100000));
		employees.add(new Employee(11, "Zaheer", "ECE", 100000));
		employees.add(new Employee(10, "John", "EEE", 100000));
		employees.add(new Employee(18, "Kumar", "ECE", 100000));
		employees.add(new Employee(14, "John", "EEE", 100000));
		employees.add(new Employee(16, "Muruga", "CSE", 100000));
		employees.add(new Employee(10, "John", "EEE", 100000));
		employees.add(new Employee(19, "John", "EEE", 100000));
		employees.add(new Employee(17, "Dinesh", "IT", 100000));
		
		for(Employee e: employees)
		{
			System.out.println(e);
		}

	}

}
