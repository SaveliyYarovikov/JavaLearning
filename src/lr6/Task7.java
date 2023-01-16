package lr6;

public class Task7 {
    public static int[] Method(char[] a){

        int[] array = new int[a.length];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)a[i];
        }
        return array;
    }
}
