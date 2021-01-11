package java8POCs;

public class ThreadsDemo1 {

	public static void main(String[] args) {

		// creating runnable instance of MyRunnable class
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		// here now there are 2 threads one is main thread and now another
		// thread child thread= t is also there
		
		// order of execution of thread is machine dependent
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
