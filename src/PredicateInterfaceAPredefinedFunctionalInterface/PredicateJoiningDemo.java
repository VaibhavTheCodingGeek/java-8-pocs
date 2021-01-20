package PredicateInterfaceAPredefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void main(String[] args) {
		int[] x = {0, 5, 10, 15, 20, 25, 30};

		// predicate to check if the given integer is greater than 10
		Predicate<Integer> p1 = I -> I > 10;

		// Predicate to check if the given integer is even or not
		Predicate<Integer> p2 = I -> I % 2 == 0;

		System.out.println("The numbers greater than 10 are:");
		m1(p1, x);

		System.out.println("Even numbers are:");
		m1(p2, x);
		
		System.out.println("The numbers NOT greater than 10 are:");
		m1(p1.negate(), x);
		
		System.out.println("Odd numbers are:");
		m1(p2.negate(), x);
		
		
		System.out.println("The numbers greater than 10 AND are Even are:");
		m1(p1.and(p2), x);
		
		System.out.println("The numbers greater than 10 OR are Even are:");
		m1(p1.or(p2), x);
		

	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
