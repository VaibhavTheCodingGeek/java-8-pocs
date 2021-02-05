package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(0);
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(5);
		numbersList.add(15);
		numbersList.add(25);

		// using streams to filter out even no.s from the list l

		List<Integer> l1 = numbersList.stream().filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> lPlus5 = numbersList.stream().map(i -> i + 5)
				.collect(Collectors.toList());
		System.out.println(lPlus5);

		List<String> actorsList = new ArrayList<String>();
		actorsList.add("chiranjeevi");
		actorsList.add("nagarjuna");
		actorsList.add("vyankatesh");
		actorsList.add("pavan");
		actorsList.add("raviteja");
		// filtering the list of heros with length() of string >=9

		List<String> actorsNameGreaterThan9 = actorsList.stream()
				.filter(s -> s.length() >= 9).collect(Collectors.toList());

		System.out.println(actorsNameGreaterThan9);
		// now mapping or converting each actor name to upercase
		List<String> actorsNamesInUpperCase = actorsList.stream()
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("actorsNamesInUpperCase " + actorsNamesInUpperCase);

		Long actorNameCountWithNameLengthGreaterThan9 = actorsList.stream()
				.filter(s -> s.length() >= 9).count();
		System.out.println("actorNameCountWithNameLengthGreaterThan9 "
				+ actorNameCountWithNameLengthGreaterThan9);

		// sorting the number list using default natural sorting
		List<Integer> sortedNumbers = numbersList.stream().sorted()
				.collect(Collectors.toList());
		System.out.println("sortedNumbers default " + sortedNumbers);

		// sorting the elements in descending order i.e custom ized sorting

		// -i1.compareTo(i2) is one way for descending order sorting

		// another way is reversing the args as, i2.compareTo(i1)
		List<Integer> sortedNumbersInDesc = numbersList.stream()
				.sorted((i1, i2) -> -i1.compareTo(i2))
				.collect(Collectors.toList());

		System.out.println("sortedNumbersInDesc " + sortedNumbersInDesc);

		Integer minValue = numbersList.stream().sorted()
				.min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("minValue " + minValue);

		Integer maxValue = numbersList.stream().sorted()
				.max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("maxValue " + maxValue);

		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("BB");
		l.add("CCC");
		l.stream().forEach(s -> System.out.println(s));

		// copying the element in the list to array using toArray() method
		Integer[] integerArray = numbersList.stream().toArray(Integer[]::new);
		System.out.println("elements from list copied into array");
		for (Integer i : integerArray) {
			System.out.println(i);
		}

		// creating a stream of integer
		Stream<Integer> s = Stream.of(9, 99, 999, 9999);

		// printing each element in stream
		System.out.println("elements from stream");
		s.forEach(i -> System.out.println(i));

		// another way for printing could be method reference like
		Stream<Integer> s1 = Stream.of(9, 99, 999, 9999);
		System.out.println("elements from stream using method reference");
		s1.forEach(System.out::println);

		System.out.println("elements from stream of arrays");
		Double[] d = {10.1, 10.2, 10.3, 10.4, 10.5};
		Stream<Double> sd = Stream.of(d);
		sd.forEach(System.out::println);

	}

}
