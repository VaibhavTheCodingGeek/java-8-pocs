package ConsumerAPredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExampleToPrintMovieNames {

	public static void main(String[] args) {

		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		// writing a consumer who will take movie object as an argument and
		// print all the movie details
		Consumer<Movie> c = m -> {

			System.out.println("movie name => " + m.name);
			System.out.println("movie hero => " + m.hero);
			System.out.println("movie heroine => " + m.heroine);
		};
		for (Movie m : l) {
			c.accept(m);
		}
	}

	private static void populate(ArrayList<Movie> l) {

		l.add(new Movie("bahubali", "prabhas", "anushka"));
		l.add(new Movie("singham", "ajay", "kajal"));
		l.add(new Movie("dangal", "amir", "various"));
		l.add(new Movie("dabangg", "salman", "sonakshi"));

	}

}
