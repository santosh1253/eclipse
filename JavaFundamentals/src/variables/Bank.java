package variables;

public class Bank {
	private int accno;
	private String name;
	private double balance;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double withdraw(double withdrawAmount)
	{
		balance-=withdrawAmount;
		return balance;
	}
	public double deposit(double depositAmount)
	{
		balance+=depositAmount;
		return balance;
	}

}
class User
{
	public static void main(String[] args) {
		Bank indianBank=new Bank();
		indianBank.setAccno(100);
		indianBank.setName("Ravi");
		indianBank.setBalance(2000);
		System.out.println("Account Holder Name"+indianBank.getName());
		System.out.println("Balance currently.."+indianBank.getBalance());
		indianBank.deposit(50000);
		System.out.println("Balance currently.."+indianBank.getBalance());
		indianBank.withdraw(30000);
		System.out.println("Balance currently.."+indianBank.getBalance());
		
	}
}
