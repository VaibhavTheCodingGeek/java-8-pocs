package lambdaExprOnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingTreeSetWithLambdaExpression {

	public static void main(String[] args) {
		// now we will pass the lambda expression as a definition to TreeSet()
		// interface
		// it expects Object of Comparator

		// we have passed lamba expression as a definition to compare() method
		// from Comparator Interface

		// as lambda expression are used to implements Functional interface so
		// Comparator being a functional interface its definition is given by
		// below lambda expression
		TreeSet<Integer> t = new TreeSet<Integer>(
				(I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		// elements in set are sorted
		System.out.println("Before sorting:" + t);

	}

}
