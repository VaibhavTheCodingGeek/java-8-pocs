package lambdaExprOnCollections;

import java.util.TreeMap;

public class SortingTreeMapWithLambdaExpr {

	public static void main(String[] args) {
		// now we will pass the lambda expression as a definition to TreeMap()
		// interface
		// it expects Object of Comparator

		// we have passed lamba expression as a definition to compare() method
		// from Comparator Interface

		// as lambda expression are used to implements Functional interface so
		// Comparator being a functional interface its definition is given by
		// below lambda expression
		TreeMap<Integer, String> t = new TreeMap<Integer, String>(
				(I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		t.put(10, "sunny");
		t.put(0, "bunny");
		t.put(15, "chinny");
		t.put(5, "bunny");
		t.put(20, "minny");
		// elements in set are sorted in descending order
		System.out.println("sorting keys using lambda expression:" + t);

	}

}
