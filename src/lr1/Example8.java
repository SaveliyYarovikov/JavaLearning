package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week");
        String dayOfTheWeek = in.nextLine();

        System.out.println("Input number");
        String number = in.nextLine();

        System.out.println("Input month");
        String month = in.nextLine();

        System.out.println("Day of the week is " + dayOfTheWeek);
        System.out.println("Number is " + number);
        System.out.println("Month is " + month);
    }
}
