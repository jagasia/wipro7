
public class App {

	public static void main(String[] args){
		Bank bank=new Bank();
		try
		{
			bank.withdraw(31000);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Continues");
	}

}
