package lambdaExprOnCollections;

public class Employee {
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}




	// is invoke when we prints Employee object like System.out.println(emp);
	@Override
	public String toString() {
		return eno + " :" + ename;
	}

}
