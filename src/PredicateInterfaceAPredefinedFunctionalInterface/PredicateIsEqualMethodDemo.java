package PredicateInterfaceAPredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateIsEqualMethodDemo {

	public static void main(String[] args) {

		// creating predicate using static method isEqual()
		Predicate<String> p = Predicate.isEqual("vaibhav");

		System.out.println(p.test("vaibhav")); // returns true as predicate is
												// equal and has
												// string
												// representation="vaibhav"

		System.out.println(p.test("DurgaSoft")); // false as predicate created
													// has string representation
													// "vaibhav" in
													// it

		Predicate<Apple> pApple = Predicate.isEqual(new Apple("red", 10));

		// now creating another users to check their representation matches with
		// predicate representation of user object

		Apple apple1 = new Apple("red", 10);
		Apple apple2 = new Apple("green", 20);
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(apple1);
		apples.add(apple2);

		/*
		 * to get exact results we need to override equals() method of "Apple"
		 * class to check if the objects are equal, because whenever the
		 * precicate's static method isEqual() method is invoked it gives call to the
		 * equals() method of object whose evaaluation has to be done
		 */

		for (Apple apple : apples) {
			System.out.println(pApple.test(apple));
		}

	}

}
