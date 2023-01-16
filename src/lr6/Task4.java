package lr6;

public class Task4 {

    public static int Factorial(int a){

        if (a % 2 == 0){
            int result = 1;
            int operationsAmount = a / 2;
            for (int i = 0; i < operationsAmount; i++){
                result *= a;
                a--;
                a--;
            }
            return result;
        }
        else {
            int result = 1;
            int operationsAmount = (a / 2) + 1;
            for (int i = 0; i < operationsAmount; i++){
                result *= a;
                a--;
                a--;
            }
            return result;
        }
    }
}

