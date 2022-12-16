package lr3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input summarize numbers amount");
        int summarizeNumbersAmount = in.nextInt();

        int result = 0;
        int j = 0;
        int i = 0;

        System.out.println("Summarize numbers:");

        while (i < summarizeNumbersAmount){
            if (j % 5 == 2 || j % 3 == 1) {
                System.out.print(j + "  ");
                result += j;
                i++;
            }
            j++;
        }

        System.out.println();
        System.out.println("Summarizing result: " + result);
    }
}