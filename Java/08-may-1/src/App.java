import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		Date dt=new Date();
//		System.out.println(dt.getYear()+1900);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		System.out.println(sdf.format(dt));
	}

}
