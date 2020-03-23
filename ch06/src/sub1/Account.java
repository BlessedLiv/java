package sub1;

public class Account {
	//Ư��(�������)
	private String bank;
	private String id;
	private String name;
	private int money; // private �ϸ� ������ ������ �־���Ѵ�.
	
	public Account(String bank, String id, String name, int money){
		this.bank  = bank;
		this.id	   = id;
		this.name  = name;
		this.money = money;
	}
	
	//���<����޼���>
	public void deposit(int money) {
		this.money += money;
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void show() {
		System.out.println("=======================");
		System.out.println("Bank    : " + bank);
		System.out.println("Account : " + id);
		System.out.println("Name    : " + name);
		System.out.println("Balance : " + money);
		System.out.println("=======================");
	}
}
