package MethodAndConstructorReferenceOperatorDemos;

public class DevelopingMultithreadedEnvUsingMethodReference {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {

		DevelopingMultithreadedEnvUsingMethodReference t = new DevelopingMultithreadedEnvUsingMethodReference();
		// copying/referring to m1() method to thread's run() method

		// here the intrerface Runnab,e was expectimg run() method
		// implementation whoch we provided by copying implementation of m1() to
		// it
		Runnable r = t::m1;

		// passing runnable instance to Thread class constructor
		Thread t1 = new Thread(r);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");

		}

	}

}
