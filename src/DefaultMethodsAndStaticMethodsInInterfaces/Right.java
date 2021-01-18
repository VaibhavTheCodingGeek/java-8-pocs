package DefaultMethodsAndStaticMethodsInInterfaces;

public interface Right {
	default void m1() {
		System.out.println("Inside Right default method");
	}

}
