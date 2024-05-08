import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter the number of colleges:");		
		List<College> collegeList=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
			College college=new College();
			college.setName(arr[0]);
			college.setWebsite(arr[1]);
			college.setMobile(arr[2]);
			college.setFounder(arr[3]);
			college.setNumberOfDept(Integer.valueOf(arr[4]));
			college.setLocation(arr[5]);			
			college.setStartingDate(sdf.parse(arr[6]));
			collegeList.add(college);
		}
		
		List<College> result=new ArrayList<>();
		CollegeBo cbo=new CollegeBo();
		System.out.println("Enter a search type:\r\n"
				+ "1.By name\r\n"
				+ "2.By starting date\r\n"
				+ "3.By location\r\n"
				+ "");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: //by name
			System.out.println("Enter the number of names:");
			int noOfNames=sc.nextInt();
			List<String> nameList=new ArrayList<>();
			for(int i=0;i<noOfNames;i++)
			{
				String name=sc.nextLine();
				if(name.equals(""))
					name=sc.nextLine();
				nameList.add(name);
			}
			result=cbo.findCollege(collegeList, nameList);
			break;
		case 2: //by starting date
			System.out.println("Enter the starting date:");
			String temp=sc.next();
			Date startingDate=sdf.parse(temp);
			result=cbo.findCollege(collegeList, startingDate);
			break;
		case 3: //by location
			System.out.println("Enter the location:");
			String location=sc.nextLine();
			if(location.equals(""))
				location=sc.nextLine();
			result=cbo.findCollege(collegeList, location);
			break;
		default:
			System.out.println("Invalid Choice");
			System.exit(0);
		}
		
		if(result.isEmpty())
		{
			System.out.println("No such college is present");
		}else
		{
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
			for(College c: result)
			{
				System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));
			}
		}
	}

}
