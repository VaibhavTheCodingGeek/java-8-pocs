package PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionDemo {

	public static void main(String[] args) {
		// taking int as argument and returning its square

		IntFunction<Integer> f = i -> i * i;

		System.out.println(f.apply(5)); // 25

		// taking string and retrun its length

		// ToIntFunction will have return type as int always, we have to specify
		// input type here
		ToIntFunction<String> f1 = s -> s.length();

		System.out.println(f1.applyAsInt("durga")); // 5

		// Take int as argument and return its square root

		// We specified input type return type so no need to specified type
		// parameters
		IntToDoubleFunction f2 = i -> Math.sqrt(i);

		// applyAs* here * depends upon return type
		System.out.println(f2.applyAsDouble(5));

	}

}
