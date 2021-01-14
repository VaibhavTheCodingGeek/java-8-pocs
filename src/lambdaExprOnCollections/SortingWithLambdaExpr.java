package lambdaExprOnCollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithLambdaExpr {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		// elements insertion order is preserved
		System.out.println("Before sorting:" + l);
		/*
		 * sort() method of collections expects the Comparator object i.e object
		 * of a class implementing Comparator Interface for which we have
		 * provided definition of its compare method using lambda expression
		 */
		Collections.sort(l, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		System.out.println(
				"After descending order sorting using lambda expr.:" + l);
	}

}
