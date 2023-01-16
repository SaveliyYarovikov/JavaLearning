package lr6;

public class Task8 {

    public static double Method(int[] a){
        int result = 0;

        for (int i = 0; i < a.length; i++){
            result += a[i];
        }
        return result / a.length;
    }
}

