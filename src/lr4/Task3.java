package lr4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input height");
        int height = in.nextInt();

        System.out.println("Input width");
        int width = in.nextInt();

        int[][] array = new int[height][width];

        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){
                array[i][j] = 2;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
