package lr3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number");
        int firstNumber = in.nextInt();

        System.out.println("Input second number");
        int secondNumber = in.nextInt();

        int result = firstNumber;
        int difference = Math.abs(secondNumber - firstNumber);

        System.out.println();

        if (firstNumber < secondNumber) {
            for(int i = 0; i <= difference; i++) {
                System.out.println(result);
                ++result;
            }
        }

        if (firstNumber > secondNumber) {
            for(int i = 0; i <= difference; i++) {
                System.out.println(secondNumber);
                ++secondNumber;
            }
        }

    }
}
