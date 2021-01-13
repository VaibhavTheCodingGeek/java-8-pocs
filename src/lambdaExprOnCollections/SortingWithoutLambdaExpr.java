package lambdaExprOnCollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithoutLambdaExpr {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		// elements insertion order is preserved
		System.out.println("Before sorting:" + l);
		Collections.sort(l);
		// after using Collections.sort() the list l is sorted 
		// this will sort the elements using default sorting order that is
		// ascending order
		System.out.println("After sorting:" + l);
		// to sort elemnts in desecending order a comaprator named MyComparator
		// is created ans should bve passed in Collections.sort()
		Collections.sort(l, new MyComparator());
		System.out.println("After sorting in descending order:" + l);

	}

}
