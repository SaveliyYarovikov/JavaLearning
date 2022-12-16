package lr1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number");
        int firstNumber = in.nextInt();

        System.out.println("Input second number");
        int secondNumber = in.nextInt();

        System.out.println("Number`s sum is " + (firstNumber + secondNumber));
        System.out.println("Number`s difference is " + (firstNumber - secondNumber));
    }
}
