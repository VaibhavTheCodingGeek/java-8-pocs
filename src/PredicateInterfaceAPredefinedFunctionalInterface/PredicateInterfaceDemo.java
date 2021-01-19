package PredicateInterfaceAPredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {

		// implementing the Preddefined functional interface predicate and its
		// definition
		Predicate<Integer> integerCheck = i -> i > 10;

		// calling its test() and passing 100 as an argument in it to see if 100
		// is greater than 10 or not

		System.out.println(integerCheck.test(100)); // true
		System.out.println(integerCheck.test(5)); // false

		// writing a predicate to check if the length of given string is greater
		// than 5 or not
		Predicate<String> strLenCheck = str -> str.length() > 5;
		System.out.println(strLenCheck.test("Vaibhav")); // true
		System.out.println(strLenCheck.test("abcd")); // false

		// predicate to check if the collection is empty or not
		Predicate<Collection> collectionEmptyCheck = c -> c.isEmpty();
		List<String> listWithOneStringELement = new ArrayList<String>();
		listWithOneStringELement.add("A");
		System.out.println(collectionEmptyCheck.test(listWithOneStringELement)); // false

		List<String> emptyList = new ArrayList<String>();

		System.out.println(collectionEmptyCheck.test(emptyList)); // true

	}

}
