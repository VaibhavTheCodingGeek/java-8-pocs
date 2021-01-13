package lambdaExpressionsAndFunctionalInterface;

public class ThreadsDemoByLambdaExpr {
	public static void main(String[] args) {

		
		// no need for havong a implemeting class here
		// implemntation of run method from Runnable interface using lamda expression
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("lambda:child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("lambda:main thread");
		}

		// order of execution is machine dependent
	}
}
