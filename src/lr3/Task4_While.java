package lr3;

import java.util.Scanner;

public class Task4_While {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number");
        int firstNumber = in.nextInt();

        System.out.println("Input second number");
        int secondNumber = in.nextInt();

        int result = firstNumber;
        int difference = Math.abs(secondNumber - firstNumber);

        System.out.println();

        int i = 0;
        int j = 0;

        if (firstNumber < secondNumber) {
            while (i <= difference){
                System.out.println(result);
                result++;
                i++;
            }
        }

        if (firstNumber > secondNumber) {
            while (j <= difference){
                System.out.println(secondNumber);
                secondNumber++;
                j++;
            }
        }

    }
}
