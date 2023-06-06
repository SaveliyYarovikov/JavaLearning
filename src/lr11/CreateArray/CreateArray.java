package lr11.CreateArray;

import java.util.Random;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array size");
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];

        fillArray(array, 0);

        printArray(array, 0);

    }
    public static void fillArray(int[] array, int i){
        Random random = new Random();
        array[i] = random.nextInt(300);
        i++;
        if (i < array.length){
            fillArray(array, i);
        }
    }
    public static void printArray(int[] array, int i){
        System.out.println(array[i]);
        i++;
        if (i < array.length){
            printArray(array, i);
        }
    }
}
