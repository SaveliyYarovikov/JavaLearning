package lr13;
import java.util.ArrayList;
import java.util.Random;
public class Task5 {
    private static final Object lock = new Object();
    private static int max = 0;
    private static int i = 0;

    public static int FindTheHighestNumber(int [] array) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            synchronized (lock){
                while (i < array.length){
                    if (array[i] > max){
                        max = array[i];
                        i++;
                    }else {
                        try {
                            lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock){
                while (i < array.length){
                    if (array[i] > max){
                        max = array[i];
                        i++;
                    }else {
                        try {
                            lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        t1.start();
        t2.start();
        return max;
    }


    public static void main(String[] args) throws InterruptedException{

        long start = System.nanoTime();

        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(5000);
        }

        System.out.println(FindTheHighestNumber(array));

        long finish = System.nanoTime();
        long result = finish - start;

        System.out.println("Time required: " + result);


    }
}
