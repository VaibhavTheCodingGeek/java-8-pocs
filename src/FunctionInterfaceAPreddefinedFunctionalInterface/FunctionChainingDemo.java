package FunctionInterfaceAPreddefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {

		Function<String, String> f1 = str -> str.toUpperCase();
		Function<String, String> f2 = str -> str.substring(0, 9);

		// apply f1 and then f2 will be applied

		// Convert string to upper case and then consider only first 9 chars to
		// print
		System.out.println("Result of  f1.andThen(f2)"
				+ f1.andThen(f2).apply("aishwaryaabhi")); // AISHWARYA

		// apply f2 and then f1 will be applied
		// consider first 9 chars and then convert thiose 9 chars to upper case
		System.out.println("Result of f1.compose(f2)"
				+ f1.compose(f2).apply("aishwaryaabhi")); // AISHWARYA

		// now taking an example to see the order change

		Function<Integer, Integer> f3 = i -> i + i;
		Function<Integer, Integer> f4 = i -> i * i * i;

		// here first f3 will be applied which add i+i 10+10=20 and then f4 will
		// be
		// applied which cube the added result 20*20*20
		System.out.println(
				"Result of f3.andThen(f4) " + f3.andThen(f4).apply(10));

		// here first i's cube will be calculated and then it will be added
		// twice(i*i*i) =1000 and the add 1000 + 1000 and
		System.out.println(
				"Result of f3.compose(f4) " + f3.compose(f4).apply(10));

		// static method for Function interface
		Function<String, String> f5 = Function.identity();
		// whatever input we going to provide same is going to returned as a
		// output by using static method identity()

		System.out.println(f5.apply("vaibhav"));

	}

}
