package lambdaExprOnCollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEmployeesUsinglambdaExpr {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1, "A"));
		l.add(new Employee(0, "B"));
		l.add(new Employee(3, "F"));
		l.add(new Employee(4, "Z"));
		System.out.println("before sorting employees are" + l);
		// here we are writing lamba expression to sort the employees from
		// employee class based on therir enos

		// as Collections.sort() method takes comparatoe object as an argum,ent
		// so we can replace this by lamba expression as below

		// we are sorting using ascending order w.r.t to eno
		Collections.sort(l,
				(e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);

		// here e1 and e2 are employee objects which we will pass as an argument
		// to lambda expression and the use their respective eno for comparing
		System.out.println(
				"After sorting employees in asecending order using lambda expression are"
						+ l);
	}

}
