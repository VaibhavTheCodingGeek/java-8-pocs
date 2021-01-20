package PredicateInterfaceAPredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateToRemoveNullValuesAndEmptyStrings {

	public static void main(String[] args) {

		Predicate<String> notNullCheck = str -> str != null;
		Predicate<String> notEmptyStringCheck = str -> !str.isEmpty();

		// Combining two predicate in one
		Predicate<String> notNullCheckAndNotEmptyStringCheck = notNullCheck
				.and(notEmptyStringCheck);
		List<String> strings = new ArrayList<String>();
		strings.add("");
		strings.add(null);
		strings.add("vaibhav");
		strings.add("pawar");

		for (String str : strings) {
			if (notNullCheckAndNotEmptyStringCheck.test(str)) {
				System.out.println(str);
			}
		}
		
	}

}
