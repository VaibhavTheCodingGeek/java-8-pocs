package FunctionInterfaceAPreddefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionToClacGradeOfStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		populate(students);
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Distinction]";
			} else if (marks >= 60) {
				return "B[First class]";
			} else if (marks >= 50) {
				return "c[Second class]";
			} else if (marks >= 40) {
				return "D[Third class]";
			} else {
				return "F[Fail]";
			}
		};
		Predicate<Student> p = s -> s.marks > 50;

		for (Student s : students) {
			// print the student only when the marks of a student is greater
			// than 50
			if (p.test(s)) {
				System.out.println("Student => " + s.name + " with marks=> "
						+ s.marks + " has grade => " + f.apply(s));
			}
		}
	}

	private static void populate(List<Student> students) {
		students.add(new Student("sunny", 100));
		students.add(new Student("bunny", 60));
		students.add(new Student("chunny", 30));
		students.add(new Student("pinny", 40));
	}

}
