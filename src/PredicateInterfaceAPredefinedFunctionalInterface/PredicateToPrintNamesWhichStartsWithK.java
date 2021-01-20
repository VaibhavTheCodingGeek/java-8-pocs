package PredicateInterfaceAPredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateToPrintNamesWhichStartsWithK {

	public static void main(String[] args) {

		Predicate<String> startsWithKPredicate = str -> str.startsWith("k");

		List<String> names = new ArrayList<String>();
		names.add("kajal");
		names.add("karrena");
		names.add("Sunny");
		names.add("karishma");
		System.out.println("names starting with k are:");
		for (String name : names) {
			if (startsWithKPredicate.test(name)) {
				System.out.println(name);
			}
		}
	}

}
