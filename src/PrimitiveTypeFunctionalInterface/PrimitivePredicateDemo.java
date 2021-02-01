package PrimitiveTypeFunctionalInterface;

import java.util.function.IntPredicate;

public class PrimitivePredicateDemo {

	public static void main(String[] args) {

		// writing a Primitive type(int) predicate for perfomance improvement
		// and avoiding Autoboxing and Autounboxing.
		IntPredicate p = i -> i % 2 == 0;

		int[] x = {0, 5, 10, 15, 20, 25};
		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
