package lr11.ToBinaryNumberSystem;

import java.util.Arrays;
import java.util.Scanner;

public class ToBinaryNumberSystem {

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = toBinary(n, string);

        for (int i = str.length() - 1;i >= 0; i--){
            System.out.print(str.toCharArray()[i]);
        }

    }
    public static String toBinary(int n, StringBuilder string){
        int binaryN = n % 2;
        int nextN = n / 2;
        string.append(binaryN);
        if (nextN > 0){
            toBinary(nextN, string);
            return string.toString();
        }else {
            return string.toString();
        }
    }


}
