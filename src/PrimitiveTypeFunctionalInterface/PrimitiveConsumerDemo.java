package PrimitiveTypeFunctionalInterface;

import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

public class PrimitiveConsumerDemo {

	public static void main(String[] args) {

		// taking int value as input and printing its square
		// no autoboxing or unboxing is required
		IntConsumer c = i -> System.out.println(i * i);
		c.accept(10);

		Employee employee = new Employee("vaibhav", 100.0);
		ObjDoubleConsumer<Employee> c1 = (e, d) -> e.salary = e.salary + d;
		c1.accept(employee, 500.0);
		System.out.println("employee name =>" + employee.name);
		System.out.println("employee incremented salary =>" + employee.salary);

	}

}
