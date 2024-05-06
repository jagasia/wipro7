import java.util.Date;

public class App1 {

	public static void main(String[] args) {
		Object []arr=new Object[10];
		arr[0]=10;		//10 is primitive, it is auto-boxed into Integer type. Integer is sub class of Object class
		arr[1]="India";
		arr[2]=1.2f;
		arr[3]=new Date();
		//Dheeraj says, he is able to store different type of data in an array
		//Jag says, all these are cast to Object type and stored in the array
		//hence, this array contains only Object type only.
		Integer i=(Integer) arr[0];
		//Shape s=new Circle();		//same way Object o=new Integer(10);
		
		
	}

}
