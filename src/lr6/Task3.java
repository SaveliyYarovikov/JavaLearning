package lr6;

import java.util.Arrays;

public class Task3 {

    public static void Array(int[] a){
        int sum = 0;

        System.out.println("min: " + Arrays.stream(a).min());
        System.out.println("max: " + Arrays.stream(a).max());
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println("middle: " + sum / a.length);

    }
    public static void Numbers(Integer... numbers){

        int sum = 0;
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            arr[i] = numbers[i];
        }

        System.out.println("min: " + Arrays.stream(arr).min());
        System.out.println("max: " + Arrays.stream(arr).max());

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("middle: " + sum / numbers.length);
    }
}
