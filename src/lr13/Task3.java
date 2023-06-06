package lr13;

public class Task3 {

    private static final Object lock = new Object();

    private static int number = 1;

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(() -> {
            synchronized (lock){
                while (number <= 10){
                    if (number % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
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
                while (number <= 10){
                    if (number % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
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
        t1.setName("Even Thread");
        t2.setName("Odd thread");

        t1.start();
        t2.start();
    }
}
