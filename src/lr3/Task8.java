package lr3;

public class Task8 {
    public static void main(String[] args) {

        int arraySize = 10;
        char[] array = new char[arraySize];

        array[0] = 'B';
        array[1] = 'C';
        array[2] = 'D';
        array[3] = 'F';
        array[4] = 'G';
        array[5] = 'H';
        array[6] = 'J';
        array[7] = 'K';
        array[8] = 'L';
        array[9] = 'M';

        System.out.println("Array elements in straight order");

        for(int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }

    }
}
