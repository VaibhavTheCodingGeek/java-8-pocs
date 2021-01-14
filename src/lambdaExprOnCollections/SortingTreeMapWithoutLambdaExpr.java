package lambdaExprOnCollections;

import java.util.TreeMap;

public class SortingTreeMapWithoutLambdaExpr {

	public static void main(String[] args) {
		// if no argument is passed the default sorting of elenents will be done
		// i.e ascending order
		TreeMap<Integer,String> t = new TreeMap<Integer,String>();
		t.put(10,"sunny");
		t.put(0,"bunny");
		t.put(15,"chinny");
		t.put(5,"bunny");
		t.put(20,"minny");
		// elements in set are sorted in descending order
		System.out.println("Before sorting:" + t);

	}

}
