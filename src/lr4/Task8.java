package lr4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();

        System.out.println("Введите ключ:");
        int value = in.nextInt();

        char[] charsArray = text.toCharArray();
        int[] intsArray = new int[charsArray.length];

        for (int i = 0; i < charsArray.length; i++){
            intsArray[i] = charsArray[i] + value;
        }
        System.out.println("Текст после преобразовния:");

        for (int i = 0; i < intsArray.length; i++){
            charsArray[i] = (char) intsArray[i];
            System.out.print(charsArray[i]);
        }
        System.out.println();
        in.nextLine();
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String yesOrNo = in.nextLine();

        switch (yesOrNo){
            case "y":
                System.out.println("Текст после обратного преобразовния:");
                for (int i = 0; i < intsArray.length; i++){
                    intsArray[i] = charsArray[i] - value;
                    charsArray[i] = (char)intsArray[i];
                    System.out.print(charsArray[i]);
                }
                System.out.println("До свидания");
                break;

            case "n":
                System.out.println("До свидания");
                break;

            default:
                System.out.println("Введите корректный ответ");
                break;
        }
    }
}
