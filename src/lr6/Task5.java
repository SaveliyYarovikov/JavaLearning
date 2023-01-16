package lr6;

public class Task5 {

    public static int Sum(int a){

        int result = 0;
        int count = 1;

        for (int i = 0; i < a; i++){
            result += count * count;
            count++;
        }
        return result;
    }
}