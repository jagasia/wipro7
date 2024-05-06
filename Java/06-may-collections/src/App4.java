import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App4 {

	public static void main(String[] args) {
		List<String> countries=new ArrayList<>();
		countries.add("India");
		countries.add("Afganisthan");
		countries.add("Japan");
		countries.add("Zimbabwe");
		countries.add("Bhutan");
		countries.add("China");
		countries.add("Australia");
		
		//how to sort these countries?
		Collections.sort(countries);
		
		System.out.println(countries);
	}

}
