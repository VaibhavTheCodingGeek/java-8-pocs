package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);

		// using streams to filter out even no.s from the list l

		List<Integer> l1 = l.stream().filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> lPlus5 = l.stream().map(i -> i + 5)
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
		System.out.println(actorsNamesInUpperCase);

		Long actorNameCountWithNameLengthGreaterThan9 = actorsList.stream()
				.filter(s -> s.length() >= 9).count();
		System.out.println(actorNameCountWithNameLengthGreaterThan9);

	}

}
