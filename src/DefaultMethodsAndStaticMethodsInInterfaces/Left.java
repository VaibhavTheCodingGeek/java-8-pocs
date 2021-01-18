package DefaultMethodsAndStaticMethodsInInterfaces;

public interface Left {
	default void m1() {
		System.out.println("Inside left default method");
	}

}
