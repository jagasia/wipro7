import java.util.Set;
import java.util.TreeSet;

class App3 {

	public static void main(String[] args) {
		Set<Employee> employees=new TreeSet<>(new EmployeeNameComparator());
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
		
		for(Employee e : employees)
			System.out.println(e);
	}

}
