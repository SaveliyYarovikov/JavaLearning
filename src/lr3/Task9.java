package lr3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Input array size");
        int arraySize = in.nextInt();

        int[] array = new int[arraySize];
        int minIndex = 0;
        int minNumber = 1000;

        for(int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(300);
            System.out.println(array[i]);
        }

        System.out.println();

        for(int i = 0; i < arraySize; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }

        System.out.println("The smallest element in array = " + minNumber);
        System.out.print("The smallest elements indexes: ");

        for(int i = 0; i < arraySize; i++) {
            if (array[i] == minNumber) {
                System.out.print(i + ",  ");
            }
        }

    }
}