package DefaultMethodsAndStaticMethodsInInterfaces;

public class DefaultMetthodInvokeTest implements Interf {

	public void m1() {
		// we can also override the default method in implemeting class

		System.out.println("My own overriden m1() method");
	}

	public static void main(String[] args) {
		DefaultMetthodInvokeTest t = new DefaultMetthodInvokeTest();

		// invoking default method, default methods are directly available to
		// implementing class

		t.m1();

	}

}
