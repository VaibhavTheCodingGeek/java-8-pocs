package FunctionInterfaceAPreddefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {

		// function interface taking string as an input and return Integer as a
		// result

		// Writing a function which takes string as argument and returns it
		// length
		Function<String, Integer> f = str -> str.length();
		// invoking its apply() method(abstract method for Function
		// FunctionalInterface
		System.out.println(f.apply("vaibhav")); // o/p = 7

		// Writing a function which takes Integer as argument and returns it
		// square
		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println(f1.apply(5)); // o/p:-25

		// Writing a function which takes String as argument and returns it
		// without blank space
		String str = "vaibhav is a geeky coder from Aurangabad, Maharashtra";
		Function<String, String> f2 = s -> s.replaceAll(" ", "");
		System.out.println(f2.apply(str));

		// Writing a function which takes String as argument and returns number
		// of spaces present in given string

		// logic :- claculate length of string including spaces and then deduct
		// the length of string without any spaces
		Function<String, Integer> f3 = s -> s.length()
				- s.replaceAll(" ", "").length();
		System.out.println(f3.apply(str));
	}

}
