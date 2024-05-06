interface Person {
	void speak();

	static void walk() {

	}
}

class Student {
	public void talk() {
		System.out.println("Student talks");
	}

	public static void run() {
		System.out.println("Student runs");
	}
}

public class App2 {

	public static void main(String[] args) {
		Person raja; // interface
		Student suresh = new Student();
		raja = suresh::talk;
		raja = Student::run;
		raja.speak();

	}

}
