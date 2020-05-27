
public class ThreadMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("Current Thread Name : " + name);
		System.out.println("Current Thread id : " + id);
		System.out.println("Current Thread priority : " + priority);
		System.out.println("Current Thread State : " + s);

	}

}
