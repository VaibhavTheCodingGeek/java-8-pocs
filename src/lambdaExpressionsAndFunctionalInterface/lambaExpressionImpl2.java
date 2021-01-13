package lambdaExpressionsAndFunctionalInterface;

public class lambaExpressionImpl2 {

	public static void main(String[] args) {

		// impkementing the only abstract method from the functional interface
		// Interface1
		// arguments's type is automatically detected as only one abstract
		// method in interface1
		Interface1 interf1 = (a, b) -> System.out
				.println("sum of a,b is " + (a + b));
		interf1.add(10, 20);
	}

}
