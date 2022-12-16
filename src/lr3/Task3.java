package lr3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input numbers amount");
        int numbersAmount = in.nextInt();

        int[] arr = new int[numbersAmount];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
