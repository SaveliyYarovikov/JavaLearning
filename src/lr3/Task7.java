package lr3;

public class Task7 {
    public static void main(String[] args) {

        int arraySize = 10;
        char[] array = new char[arraySize];
        array[0] = 'a';
        array[1] = 'c';
        array[2] = 'e';
        array[3] = 'g';
        array[4] = 'i';
        array[5] = 'k';
        array[6] = 'm';
        array[7] = 'o';
        array[8] = 'q';
        array[9] = 's';

        System.out.println("Array elements in straight order");

        for(int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Array elements in reverse order");

        for(int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
