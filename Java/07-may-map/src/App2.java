import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Map<Character, Integer> map=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		for(Character c: input.toCharArray())
		{
//			Integer value = map.get(c);
//			if(value==null)
//				value=0;
//			value++;
//			map.put(c, value);
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
