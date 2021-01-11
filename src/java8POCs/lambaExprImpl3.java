package java8POCs;

public class lambaExprImpl3 {

	public static void main(String[] args) {

		// Interface2 abstract method implemntation using lambda expr
		Interface2 interface2 = (s) -> s.length();
		System.out.println("length of string using lambda expr"
				+ interface2.getLength("hello"));
	}

}
