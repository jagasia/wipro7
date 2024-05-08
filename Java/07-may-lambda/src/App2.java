import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(19,2,8,7,10,9,3,4,88);
		Collections.sort(list, (x,y)->y.compareTo(x));
		for(Integer i:list)
			System.out.println(i);
	}

}
