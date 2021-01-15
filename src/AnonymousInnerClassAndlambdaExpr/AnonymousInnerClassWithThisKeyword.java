package AnonymousInnerClassAndlambdaExpr;

public class AnonymousInnerClassWithThisKeyword {
	int x = 888;
	public void m2() {
		Interf i = new Interf() {
			// start of anonymous inner class

			// instance variable
			int x = 999;
			public void m1() {
				// inside anonymous inner class this always points to current
				// instance variable of anonymous class

				// so the value of x =999 is printed
				System.out.println("x=" + this.x);
			}
		};
		// just to invoke the method from Interf interface
		i.m1();
	}
	public static void main(String[] args) {
		AnonymousInnerClassWithThisKeyword t = new AnonymousInnerClassWithThisKeyword();
		t.m2();

	}

}
