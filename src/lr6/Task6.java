package lr6;

public class Task6 {

    public static int[] Method(int[] a, int b){
        if (a.length >= b){

            int[] array = new int[b];
            for (int i = 0; i < array.length; i++){

                array[i] = a[i];

            }
            return array;
        }
        else {
            int[] arr = new int[a.length];

            for (int i = 0; i < arr.length; i++){

                arr[i] = a[i];

            }
            return arr;
        }
    }
}
