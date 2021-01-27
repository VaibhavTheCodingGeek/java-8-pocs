package ConsumerAPredefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerChainingExample {

	public static void main(String[] args) {
		// writing multiple consumers to print some infformation about movie
		Consumer<Movie1> c1 = m -> System.out
				.println("Movie name " + m.name + " is ready to release");
		Consumer<Movie1> c2 = m -> System.out
				.println("Movie name " + m.name + " is " + m.result);
		Consumer<Movie1> c3 = m -> System.out
				.println("Movie name " + m.name + " information stored in db");

		// Chaining of consumer and then merging all the cnsumers together in a
		// single consumer using defualt methid andThen()
		Consumer<Movie1> chainedConsumer = c1.andThen(c2).andThen(c3);
		Movie1 m = new Movie1("bahubali", "hit");

		// creating movie and then passing it accept() abstract method of
		// comsumer
		chainedConsumer.accept(m);

	}

}
