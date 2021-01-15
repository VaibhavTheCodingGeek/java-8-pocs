package AnonymousInnerClassAndlambdaExpr;

public class VariableAccessDemoInLambdaExpression {
	int x = 10;
	public void m2() {
		int y = 20;
		Interf i = () -> {
			// inside lambda expression we can access outer class variable and
			// local method variable directly
			System.out.println("x=" + x);
			System.out.println("y=" + y);
			// allowed because it is class level
			x = 40;
			System.out.println("new x=" + x);
			
			
			// y=40;
			// not allowed because all the local variabvles accessed inside
			// lambda expressions are final and cant be changed inside lambda
			// expression

		};
		i.m1();
	}
	public static void main(String[] args) {
		VariableAccessDemoInLambdaExpression t = new VariableAccessDemoInLambdaExpression();
		t.m2();

	}

}
