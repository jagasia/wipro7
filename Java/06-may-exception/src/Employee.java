import java.util.Date;

public class Employee {
	private Integer id;
	private String name;
	private Date dateOfBirth;
	private Double salary;
	
	public Employee() {}

	public Employee(Integer id, String name, Date dateOfBirth, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		if(id<=0)
			throw new NumberFormatException("Id is invalid");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		if(name.length()<=0)
			throw new InvalidNameException("Name cannot be empty");			
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) throws InvalidDateException {
		Date today=new Date();
		if(today.before(dateOfBirth))
			throw new InvalidDateException("Date of Birth cannot be future date");
		this.dateOfBirth = dateOfBirth;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}
	
}
