package lr4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input height");
        int height = in.nextInt();

        char[][] array = new char[height][];

        for (int i = 0; i < height; i++){
            array[i] = new char[i + 1];
        }

        for (int i = 0; i < height; i++){

            for (int j = 0; j <= i; j++){
                array[i][j] = '#';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
