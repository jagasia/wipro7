import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Date dob=sdf.parse("08-May-2024");
		
		Employee emp=new Employee();
		
		try
		{
			emp.setId(-1);
		}catch(NumberFormatException ex)
		{
			System.out.println("Id is invalid");
		}
		try
		{
			emp.setName("Raja");
		}
		catch(InvalidNameException ex)
		{
			System.out.println("Name is invalid");
		}
		try
		{
			emp.setDateOfBirth(dob);
		}catch(InvalidDateException ex)
		{
			System.out.println("Date is invalid");
		}
		finally
		{
			System.out.println("This is finally block");
		}
		emp.setSalary(12121212.0);

		System.out.println("No problems");
		System.out.println(emp);
	}

}
