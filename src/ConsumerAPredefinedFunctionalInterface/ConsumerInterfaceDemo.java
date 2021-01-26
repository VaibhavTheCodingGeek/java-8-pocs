package ConsumerAPredefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {

		// creating consumer interface and passing value to its abstract method
		// i.e accept

		Consumer<String> c = s -> System.out.println(s);

		// it wont return anything it will just consumed the passed parameter
		c.accept("hello from consumer");

	}

}
