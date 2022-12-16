package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number");
        int number = in.nextInt();

        int a = (number-1) + (number) + (number+1);

        System.out.println("Less number is " + (number - 1));
        System.out.println("Number is " + number);
        System.out.println("More number is " + (number + 1));
        System.out.println("Square of printed numbers is " + (a * a));
    }
}
