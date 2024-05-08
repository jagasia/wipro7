import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollegeBo {

	public List<College> findCollege(List<College> collegeList,List<String> nameList)
	{
		List<College> result=new ArrayList<>();
		for(String name : nameList)
		{
			for(College c:collegeList)
			{
				if(c.getName().equals(name))
				{
					result.add(c);
				}
			}
		}
		return result;
	}
	public List<College> findCollege(List<College> collegeList,Date startingDate)
	{
		List<College> result=new ArrayList<>();
		for(College c : collegeList)
		{
			if(c.getStartingDate().equals(startingDate))
			{
				result.add(c);
			}
		}
		return result;
	}
	public List<College> findCollege(List<College> collegeList, String location)
	{
		List<College> result=new ArrayList<>();
		for(College c : collegeList)
		{
			if(c.getLocation().equals(location))
			{
				result.add(c);
			}
		}
		return result;
	}
}
