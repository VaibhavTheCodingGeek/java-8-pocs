package PrimitiveTypeFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorAndPrimitiveVersionsDemo {

	public static void main(String[] args) {

		// When both inut parameters in BiFunction and the return type are same
		// then go for BinaryOperator
		BinaryOperator<String> b = (s1, s2) -> s1 + s2;
		// Abstract method is same as that of function
		System.out.println(b.apply("vaibhav", "pawar"));

		// for better perfomance we can go for Primitive Tyoe binary operator

		IntBinaryOperator ib = (i1, i2) -> i1 * i2;
		// abstract method is applyAsInt
		System.out.println(ib.applyAsInt(10, 20));
	}

}
