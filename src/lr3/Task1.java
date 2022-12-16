package lr3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number from 1 to 7");
        switch (in.nextLine()) {
            case "1":
                System.out.println("First day is monday");
                break;
            case "2":
                System.out.println("Second day is tuesday");
                break;
            case "3":
                System.out.println("Third day is wednesday");
                break;
            case "4":
                System.out.println("Fourth day is thursday");
                break;
            case "5":
                System.out.println("Fifth day is friday");
                break;
            case "6":
                System.out.println("Sixth day is saturday");
                break;
            case "7":
                System.out.println("Seventh day is sunday");
                break;
            default:
                System.out.println("Incorrect input");
        }

    }
}
