import java.util.Scanner;
abstract class Shape
{
	  void calculateArea() {
		  System.out.println("This is shape class c.a. method");
	  }
}

class Triangle extends Shape{
	
	
	 void calculateArea() {
		 super.calculateArea();
		System.out.println("1/2 * b *h");
		
	}
}

class Rectangle extends Shape {
	
	public void calculateArea() {
		System.out.println("l*b");
	}
}

class Circle extends Shape {
	public void calculateArea() {
		System.out.println("22/7 * r * r");
	}
}

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Triangle\r\n"
				+ "2: Rectangle\r\n"
				+ "3: Circle\r\n"
				+ "4: Exit");
		
		int choice=sc.nextInt();
		Shape s=null;
		switch(choice)
		{
		case 1:	//triangle
			s=new Triangle();
			break;
		case 2:	//rectangle
			s=new Rectangle();
			break;
		case 3:	//circle
			s=new Circle();
			break;
		default:
				break;
		}
		
		s.calculateArea();
	}

}
