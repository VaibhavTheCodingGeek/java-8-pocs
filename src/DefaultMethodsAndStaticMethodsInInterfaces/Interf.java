package DefaultMethodsAndStaticMethodsInInterfaces;

public interface Interf {
	default void m1() {
		System.out.println("Inside default method");
	}

}
