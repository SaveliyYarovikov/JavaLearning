package lr12;

import java.util.Arrays;

public class Task1 {

    public static int[] ArraySorter(int [] a){
        return Arrays.stream(a).filter(x -> x % 2 == 0).toArray();
    }

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};

        int[] arr = ArraySorter(array);

        System.out.println(Arrays.toString(arr));

    }
}
