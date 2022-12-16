package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week");
        String day = in.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("Monday is the first day of the week");
                break;
            case "Tuesday":
                System.out.println("Tuesday is the second day of the week");
                break;
            case "Wednesday":
                System.out.println("Wednesday is the third day of the week");
                break;
            case "Thursday":
                System.out.println("Thursday is the fourth day of the week");
                break;
            case "Friday":
                System.out.println("Friday is the fifth day of the week");
                break;
            case "Saturday":
                System.out.println("Saturday is the sixth day of the week");
                break;
            case "Sunday":
                System.out.println("Sunday is the seventh day of the week");
                break;
            default:
                System.out.println("There is no " + day + " in the week");
        }

    }
}
