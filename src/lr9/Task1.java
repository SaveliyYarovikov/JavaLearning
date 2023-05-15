package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("Введите 3 элемента массива");

        try{
            for (int i = 0; i < 3; i++){
                array[i] = in.nextInt();
            }
        }catch (InputMismatchException e){
            System.out.println("Ошибка ввода данных");
            System.exit (1);
        }
        int arrayPositiveNumbers = 0;
        for (int i = 0; i < 3; i++){
            if (array[i] > 0){
                arrayPositiveNumbers += array[i];
            }
        }
        System.out.println("Сумма положительных элементов массива = " + arrayPositiveNumbers);
        try {
            if (arrayPositiveNumbers == 0){
                throw new ArithmeticException("");
            }
        }catch (ArithmeticException e){
            System.out.println("В массиве отсутствуют положительные элементы");
        }
    }
}
