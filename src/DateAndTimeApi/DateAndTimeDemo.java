package DateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateAndTimeDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println("current system's date is:" + date);
		System.out.println("current system's day " + date.getDayOfMonth());
		System.out.println("current system's month " + date.getMonthValue());
		System.out.println("current system's year " + date.getYear());

		// printing in standard format
		System.out.print("date in standard format ");
		System.out.printf("%d-%d-%d", date.getDayOfMonth(),
				date.getMonthValue(), date.getYear());
		System.out.println();

		LocalTime time = LocalTime.now();
		System.out.println("current system's time is:" + time);
		System.out.println("current system's hr " + time.getHour());
		System.out.println("current system's min " + time.getMinute());
		System.out.println("current system's sec " + time.getSecond());
		System.out.println("current system's nano sec " + time.getNano());

		// printing in standard format
		System.out.print("time in standard format ");
		System.out.printf("%d:%d:%d:%d", time.getHour(), time.getMinute(),
				time.getSecond(), time.getNano());
		System.out.println();

		// combining date and time together
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("system's local date and time " + dt);
		System.out.println("current system's day " + dt.getDayOfMonth());
		System.out.println("current system's month " + dt.getMonthValue());
		System.out.println("current system's year " + dt.getYear());
		System.out.println("current system's hr " + dt.getHour());
		System.out.println("current system's min " + dt.getMinute());
		System.out.println("current system's sec " + dt.getSecond());
		System.out.println("current system's nano sec " + dt.getNano());

		// for reporesenting a specific date and time
		LocalDateTime dt1 = LocalDateTime.of(1995, 05, 28, 12, 45, 55);
		// after six months
		System.out.println(
				"after 6 months date and time is " + dt1.plusMonths(6));

		// before six months
		System.out.println(
				"before 6 months date and time is " + dt1.minusMonths(6));

		// period in bettween current day and your birthday
		LocalDate birthDay = LocalDate.of(1992, 6, 1);
		LocalDate currentDay = LocalDate.now();
		Period p = Period.between(birthDay, currentDay);
		System.out.println();
		System.out.printf("your age is %d years %d months %d days",
				p.getYears(), p.getMonths(), p.getDays());
		System.out.println();

		System.out.println("enter a year");
		Scanner s = new Scanner(System.in);
		Year y = Year.of(s.nextInt());
		if (y.isLeap()) {
			System.out.println(y.getValue() + " is a leap year");

		} else {
			System.out.println(y.getValue() + " is NOT a leap year");
		}

		ZoneId zone = ZoneId.systemDefault();
		System.out.println("system's zone " + zone);

		ZoneId zoneOfAmericaLA = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(zoneOfAmericaLA);
		System.out.println("America los angeles date and time is " + zdt);

	}

}
