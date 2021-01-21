package PredicateInterfaceAPredefinedFunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForUserAuthDemo {

	public static void main(String[] args) {
		Predicate<User> p = User -> User.userName.equals("vaibhav")
				&& User.pwd.equals("java");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = sc.next();

		System.out.println("Enter password");
		String pwd = sc.next();

		User user = new User(userName, pwd);
		if (p.test(user)) {
			System.out.println("Valid user");
		} else {
			System.out.println("Invalid user");
		}
	}

}
