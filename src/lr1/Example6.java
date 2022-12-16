package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input lastname");
        String lastName = in.nextLine();

        System.out.println("Input firstName");
        String firstName = in.nextLine();

        System.out.println("Input patronymic");
        String patronymic = in.nextLine();

        System.out.println("Hello " + " " + lastName + " " + firstName + " " + patronymic);
    }
}
