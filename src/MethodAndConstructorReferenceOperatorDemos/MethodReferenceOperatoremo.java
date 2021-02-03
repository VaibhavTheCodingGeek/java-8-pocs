package MethodAndConstructorReferenceOperatorDemos;

public class MethodReferenceOperatoremo {
	public static void m2() {
		System.out.println("implementation by method reference");
		// remaining lines whatever it may be
		;;;;;;;;;;;

	}

	public static void main(String[] args) {

		// referring m2() implementation to m1() as Interf i was expecting m1()
		// method implementation
		Interf i = MethodReferenceOperatoremo::m2;

		// calling m1() method from inter i instance which internally refers to
		// m2() implementation
		i.m1();

	}

}
