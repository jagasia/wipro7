import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App_Employee {

	public static void main(String[] args) {
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
		
		
		ListIterator<Employee> it=employees.listIterator(employees.size());
		while(it.hasPrevious())
		{
			Employee e = it.previous();
			System.out.println(e);
		}
	}

}
