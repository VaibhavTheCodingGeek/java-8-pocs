package AnonymousInnerClassAndlambdaExpr;

public class ReplacingAnonymousInnerClassWithLambdaExprAndUsingThisKeyword {
	int x = 888;
	public void m2() {
		Interf i = () -> {
			// start of lambda expression

			// not a instance variable
			// local variable to lamba expression
			int x = 999;
			// inside lambda expression this always points to outer class
			// variable
			// so the value of x =888 is printed
			System.out.println("x=" + this.x); 
		};
		// just to invoke the method from Interf interface
		i.m1();
	}
	public static void main(String[] args) {
		ReplacingAnonymousInnerClassWithLambdaExprAndUsingThisKeyword t = new ReplacingAnonymousInnerClassWithLambdaExprAndUsingThisKeyword();
		t.m2();

	}

}
