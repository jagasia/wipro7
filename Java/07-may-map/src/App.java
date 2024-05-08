import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "India");
		map.put(2, "Australia");
		map.put(3, "Japan");	//new entry 
		map.put(3, "China");	//updated existing entry
		map.put(4, "Bangladesh");
		
		//how many entries are added in this map?
		System.out.println(map);
	}

}
