package lr2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number");
        int number = in.nextInt();

        if ((number % 5 == 2) && (number % 7 == 1)) {
            System.out.println("The entered number is satisfies the conditions");
        }
        else {
            System.out.println("The entered number isn`t satisfies the conditions");
        }
    }
}