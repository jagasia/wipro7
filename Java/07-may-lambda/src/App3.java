import java.util.Arrays;

public class App3 {

	public static void main(String[] args) {
		Integer arr[]= {3,1,5,2,6,4,8,79,10};
		Arrays.sort(arr, (x,y)->y-x);
		
		for(Integer i:arr)
			System.out.println(i);
	}

}
