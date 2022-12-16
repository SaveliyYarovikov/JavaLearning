package lr4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input triangle height");
        int height = in.nextInt();

        System.out.println();

        for (int i = 0; i < height; i++){

            for (int j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
