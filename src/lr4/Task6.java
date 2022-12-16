package lr4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] array = new int[4][6];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 6; j++){
                array[i][j] = random.nextInt(200);
            }
        }

        int rowIndex = random.nextInt(4);
        int columnIndex = random.nextInt(6);

        int [][] newArray = new int[3][5];
        int k = -1;
        int l = -1;

        for (int i = 0; i < 4; i++){
            if (i == rowIndex){
                continue;
            }
            k++;
            for (int j = 0; j < 6; j++){
                if (j == columnIndex) {
                    continue;
                }
                l++;
                newArray[k][l] = array[i][j];
                if (j == 5){
                    l = -1;
                }
            }
        }
    }
}
