package lr4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] array1 = new int[3][5];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                array1[i][j] = random.nextInt(200);
            }
        }

        int [][] array2 = new int[5][3];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                array2[i][j] = array1[j][i];
            }
        }
    }
}
