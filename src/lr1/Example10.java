package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input birth year");
        int birthDate = in.nextInt();

        int age = 2022 - birthDate;

        System.out.println("You are " + age);
    }
}
