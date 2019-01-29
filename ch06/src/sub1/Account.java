package sub1;

public class Account {
	//특성(멤버변수)
	private String bank;
	private String id;
	private String name;
	private int money; // private 하면 무조건 생성자 있어야한다.
	
	public Account(String bank, String id, String name, int money){
		this.bank  = bank;
		this.id	   = id;
		this.name  = name;
		this.money = money;
	}
	
	//기능<멤버메서드>
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
