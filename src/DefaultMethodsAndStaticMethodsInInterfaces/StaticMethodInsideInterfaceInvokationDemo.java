package DefaultMethodsAndStaticMethodsInInterfaces;

public class StaticMethodInsideInterfaceInvokationDemo implements InterfaceWithStaticMethod{
	

	public static void main(String[] args) {
		// invoking static methods from the interface by using interface name
		InterfaceWithStaticMethod.m1();

	}

}
