package lr3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;

        try {
            System.out.println("Input array size");
            size = in.nextInt();
        } catch (Exception e) {
            System.err.println("Incorrect input");
            System.exit(1);
        }

        int[] array = new int[size];
        int i = 0;

        for(int j = 0; array[array.length - 1] == 0; i++) {
            if (i % 5 == 2) {
                array[j] = i;
                j++;
            }
        }
    }
}
