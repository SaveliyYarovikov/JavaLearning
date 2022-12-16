package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Input array size");
        int arraySize = in.nextInt();

        Integer[] myArray = new Integer[arraySize];

        for(int i = 0; i < arraySize; i++) {
            myArray[i] = random.nextInt(300);
        }
        Arrays.sort(myArray, Collections.reverseOrder());
    }
}
