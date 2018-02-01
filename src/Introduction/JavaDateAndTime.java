package Introduction;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * You are given a date. You just need to write the method, ,
 * which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 */
public class JavaDateAndTime {
    public static String getDay(String day, String month, String year) {
        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return date.getDayOfWeek().toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}
