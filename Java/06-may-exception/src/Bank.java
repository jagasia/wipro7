
public class Bank {
	
	public void withdraw(int amount)   
	{
		if(amount>30000)
		{
			//we create this code. we know that amount >30k is invalid
			//but in that case, what to do? is not our role.
			throw new NumberFormatException("amount is invalid");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
