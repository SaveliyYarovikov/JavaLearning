package lr13;
import java.util.Random;
public class Task5 {
    private static int max1 = 0;
    private static int max2 = 0;
    private static int max3 = 0;
    private static int max4 = 0;
    public static int FindTheHighestNumber(int [] array) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < array.length / 4; i++){
                if (array[i] > max1){max1 = array[i];}
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = array.length / 4; i < array.length / 2; i++){
                if (array[i] > max1){max2 = array[i];}
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = array.length / 2; i < array.length - array.length / 4; i++){
                if (array[i] > max1){max3 = array[i];}
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = array.length - array.length / 4; i < array.length; i++){
                if (array[i] > max1){max4 = array[i];}
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        int first = Math.max(max1, max2);
        int second = Math.max(max3, max4);
        return Math.max(first, second);
    }
    public static void main(String[] args) throws InterruptedException{

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(FindTheHighestNumber(array));

    }
}
