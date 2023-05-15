package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte[] array = new byte[3];

        System.out.println("Введите 3 элемента массива");

        try{
            for (int i = 0; i < 3; i++){
                array[i] = in.nextByte();
            }
        }catch (InputMismatchException e){
            System.out.println("Ошибка ввода данных");
            System.exit (1);
        }
        int arrayNumbersSum = 0;
        for (int i = 0; i < 3; i++){

            arrayNumbersSum += array[i];

        }
        System.out.println(arrayNumbersSum);
    }
}
