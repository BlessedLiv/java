
public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("dicaprio", board);
		Thread th2 = new StudentThread("bread", board);
		
		th1.start();
		th2.start();
	}

}

class SharedBoard{
	private int sum = 0;
	synchronized public void add() { //synchronized ���� �ϸ� �ٸ� �� ���� �ȴ�.
		int n = sum;
		Thread.yield(); //���� ���� ���� ������ �纸
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	public int getSum() {return sum;}
}

class StudentThread extends Thread{
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name); // Thread name
		this.board = board;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			board.add();
		}
	}
}
