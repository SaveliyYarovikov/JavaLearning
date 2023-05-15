package lr12;

import java.util.Arrays;

public class Task2 {

    public static int[] ArraySorter(int [] a, int [] b){

        return Arrays.stream(a).filter(x -> Arrays.stream(b).anyMatch(y -> y == x)).toArray();

    }

    public static void main(String[] args) {

        int [] array1 = {1,2,3,4,5,6,7,8,9};
        int [] array2 = {56,22,3,9,444,1};

        int [] arr = ArraySorter(array1, array2);

        System.out.println(Arrays.toString(arr));

    }
}
