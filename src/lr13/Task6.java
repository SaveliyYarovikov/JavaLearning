package lr13;
import java.util.Random;
public class Task6 {
    private static int sum1 = 0;
    private static int sum2 = 0;
    private static int sum3 = 0;
    private static int sum4 = 0;
    public static int FindSum(int [] array) throws InterruptedException{

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < array.length / 4; i++){
                sum1 += array[i];
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = array.length / 4; i < array.length / 2; i++){
                sum2 += array[i];
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = array.length / 2; i < array.length - array.length / 4; i++){
                sum3 += array[i];
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = array.length - array.length / 4; i < array.length; i++){
                sum4 += array[i];
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
        return sum2 + sum1 + sum3 + sum4;
    }
    public static void main(String[] args) throws InterruptedException{
        Random random = new Random();
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(2);
        }
        System.out.println(FindSum(array));
    }
}
