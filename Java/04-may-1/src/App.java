import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String str=br.readLine();
//		System.out.println("You entered: "+str);
		File f=new File("jerome.txt");
		if(!f.exists())
			f.createNewFile();
		
		Scanner sc=new Scanner(f);
		System.out.println(sc.nextLine());
				
	}

}
