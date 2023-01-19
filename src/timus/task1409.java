package timus;

import java.util.Scanner;

public class task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int cansAmount = a + b - 1;

        int harry1 = cansAmount - a;
        int larry1 = cansAmount - b;

        System.out.println(harry1 + " " + larry1);
    }
}
