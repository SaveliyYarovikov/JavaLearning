package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] array = {
                {5,6,8,55,7},
                {2,5,7,66,2},
                {7,9,3,77,4}};

        try {
            System.out.println("Введите номер столбца матрицы");
            int number = in.nextInt();

            for (int i = 0; i < 3; i++){
                System.out.println(array[i][number]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Номер столбца за границами массива");
        }catch (InputMismatchException e){
            System.out.println("Некорректный ввод номера столбца");
        }
    }
}
