//public class Main {
//}

import java.util.Scanner;
import java.time.LocalDate;

import java.time.format.TextStyle;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a short date in the format YYYY-MM-DD : ");
        String date = scanner.nextLine();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        LocalDate date1 = LocalDate.of(year, month, day);
        String monthName = date1.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(monthName + " " + day + ", " + year);
    }
}