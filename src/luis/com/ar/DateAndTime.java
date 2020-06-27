package luis.com.ar;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

class Result {



	public static String findDay(int month, int day, int year) {

		Calendar c = Calendar.getInstance();
		c.set(Integer.valueOf(year), Integer.valueOf(month) - 1, Integer.valueOf(day));
		String dayOfWeek = "";

		switch (c.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
		case 7:
			dayOfWeek = "Saturday";
			break;
		}

		return dayOfWeek.toUpperCase();

	}

}

public class DateAndTime {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);

		int month = sc.nextInt();

		int day = sc.nextInt();

		int year = sc.nextInt();

		String res = Result.findDay(month, day, year);

		System.out.println(res);
		sc.close();
	}
}
