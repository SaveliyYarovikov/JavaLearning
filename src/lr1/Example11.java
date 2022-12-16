package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name");
        String name = in.nextLine();

        System.out.println("Input your birth year");
        int birthDate = in.nextInt();

        int age = 2022 - birthDate;

        System.out.println("Your name is " + name + " and you are " + age);
    }
}