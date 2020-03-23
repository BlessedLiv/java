package sub1;

public class ClassTest {
	public static void main(String[] args) {
		Account kb = new Account("KB bank", "123-12-1111", "Hong", 10000);
		Account sh = new Account("SH bank", "123-12-2222", "Kim", 50000);
		kb.deposit(10000);
		kb.withdraw(5000);
		kb.show();
		
		sh.deposit(35000);
		sh.withdraw(7000);
		sh.show();
		
		
		
	}
}
