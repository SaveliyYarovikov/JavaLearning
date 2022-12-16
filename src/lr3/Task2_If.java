package lr3;

import java.util.Scanner;

public class Task2_If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Input day of the week");
        String day = in.nextLine();

        if (day.equalsIgnoreCase(days[0])) {
            System.out.println("Monday is the first day of the week");
        } else if (day.equalsIgnoreCase(days[1])) {
            System.out.println("Tuesday is the second day of the week");
        } else if (day.equalsIgnoreCase(days[2])) {
            System.out.println("Wednesday is the third day of the week");
        } else if (day.equalsIgnoreCase(days[3])) {
            System.out.println("Thursday is the fourth day of the week");
        } else if (day.equalsIgnoreCase(days[4])) {
            System.out.println("Friday is the fifth day of the week");
        } else if (day.equalsIgnoreCase(days[5])) {
            System.out.println("Saturday is the sixth day of the week");
        } else if (day.equalsIgnoreCase(days[6])) {
            System.out.println("Sunday is the seventh day of the week");
        } else {
            System.out.println("There is no " + day + " in the week");
        }

    }
}
