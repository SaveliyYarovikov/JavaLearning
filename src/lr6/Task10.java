package lr6;

import java.util.Arrays;

public class Task10 {

    public static int[] Method(int... a){
        Arrays.sort(a);

        int min = a[0];
        int max = a[a.length - 1];

        int[] array = {min, max};

        return array;
    }
}
