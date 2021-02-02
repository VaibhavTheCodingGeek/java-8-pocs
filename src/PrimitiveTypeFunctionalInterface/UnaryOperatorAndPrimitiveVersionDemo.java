package PrimitiveTypeFunctionalInterface;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorAndPrimitiveVersionDemo {

	public static void main(String[] args) {

		// UnaryOperator interface is similar to finction and can be used when
		// both input and return type are same

		UnaryOperator<Integer> o = i -> i * i;

		// abstract method is same as that of function
		System.out.println(o.apply(10));

		// primitive version of Unary Operator for performance improvement
		IntUnaryOperator unaryInt = i -> i * i;
		System.out.println(unaryInt.applyAsInt(10));

	}

}
