package BiFunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<String, String> b = (str1, str2) -> System.out
				.println(str1 + str2);
		b.accept("vaibhav", "pawar");
	}

}
