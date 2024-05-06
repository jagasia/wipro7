import java.util.ArrayList;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
		List<String> countries=new ArrayList<>();
		countries.add("India");
		countries.add("Japan");
		countries.add("China");
		countries.add("China");		//list allows duplicate
		
		//how many countries we have added to this list?
		System.out.println(countries);	//list is ordered
		
	}

}
