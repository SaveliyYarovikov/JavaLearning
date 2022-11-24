package lr2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number");
        int number = in.nextInt();

        if (number % 3 == 0) {
            System.out.println("Entered number is divided by 3");
        }
        else {
            System.out.println("Entered number isn`t divided by 3");
        }
    }

}