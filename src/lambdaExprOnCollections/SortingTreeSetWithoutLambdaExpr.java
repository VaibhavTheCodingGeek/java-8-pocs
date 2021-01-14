package lambdaExprOnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingTreeSetWithoutLambdaExpr {

	public static void main(String[] args) {
		// if no argument is passed the default sorting of elenents will be done
		// i.e ascending order
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		// elements in set are sorted in descending order
		System.out.println("Before sorting:" + t);

	}

}
