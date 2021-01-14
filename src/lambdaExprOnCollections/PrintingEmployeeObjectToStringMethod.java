package lambdaExprOnCollections;

public class PrintingEmployeeObjectToStringMethod {

	public static void main(String[] args) {

		Employee e = new Employee(10, "vaibhav");
		// here when we print Employee object e then internally toString()
		// method of Employee class is invoked and the returned string is
		// printed
		System.out.println(e);

	}

}
