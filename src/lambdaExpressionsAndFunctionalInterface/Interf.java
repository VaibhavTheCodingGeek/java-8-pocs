package lambdaExpressionsAndFunctionalInterface;

@FunctionalInterface
public interface Interf {
	// abstract method
	public void m1();

	// if we add another abstract method that then it give error"Invalid
	// '@FunctionalInterface' annotation; Interf is not a functional interface"

	// public void m4();

	// however if there is no abstract method available in this interface then
	// also the annotation @FunctionalInterface will give error saying "Invalid
	// '@FunctionalInterface' annotation; Interf is not a functional interface"

//	default void m2() {
//
//	}
//
//	public static void m3() {
//
//	}

}
