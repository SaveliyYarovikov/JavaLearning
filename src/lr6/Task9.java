package lr6;

public class Task9 {

    public static char[] Method(char[] a){

        int j = 1;
        char [] arr = new char[a.length];

        for (int i = 0; i < a.length; i++){

            arr[i] = a[a.length - j];
            j++;
        }
        return arr;
    }
}
