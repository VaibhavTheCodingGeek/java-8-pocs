package lambdaExpressionsAndFunctionalInterface;

public class LambaExpressionImplementation {

	public static void main(String[] args) {
		
		// implemnting the only abstract method i.e m1() from Interface Interf
		//Writing the implementation for that method using Lambda Expression

		Interf i = ()-> System.out.println("Lambda expression implementation");
		
		
		//Invoking the method m1() from InterF i
		i.m1();
	}

}
