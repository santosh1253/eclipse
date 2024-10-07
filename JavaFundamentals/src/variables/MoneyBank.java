package variables;

public abstract class MoneyBank {
	protected int id=404;
	final void hello()
	{
		System.out.println("Hello...!");
	}
	 abstract void withdraw();
	 abstract void deposit();
	 public static void logout()
	 {
		 System.out.println("Logout Successful");
	 }
}
class IndianBank extends MoneyBank
{
	//private int id=405;

	@Override
	void withdraw() {
		System.out.println("Withdrawl success");
		
	}

	@Override
	void deposit() {
		System.out.println("Deposit success");
		
	}
	public static void main(String[] args) {
		MoneyBank ib=new IndianBank();
		System.out.println(ib.id);
	}
}
