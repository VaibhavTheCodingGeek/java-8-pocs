package DefaultMethodsAndStaticMethodsInInterfaces;

public class MultipleInheritanceProblemResolved implements Left, Right {

	public void m1() {
		// System.out.println("Inside Implementation overriden method");

		// another way can be as
		// Left.super.m1();
		// OR
		Right.super.m1();

	}
	public static void main(String[] args) {
		MultipleInheritanceProblemResolved m = new MultipleInheritanceProblemResolved();
		// after overriding the method in implementation calss the ambiguity
		// problem is resolved

		m.m1();

	}

}
