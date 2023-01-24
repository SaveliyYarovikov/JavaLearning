package lr8;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла => ");
        String fileName = in.nextLine();
        try {
            File f1 = new File(fileName);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл => ");
            int count = in.nextInt();

            DataOutputStream out = new DataOutputStream(new FileOutputStream(f1));
            in.nextLine();
            for (int i = 0; i < count; i++){
                System.out.println("Введите строку для записи в файл:");
                String  str = in.nextLine();
                out.writeUTF(str);
            }
            out.flush();
            out.close();
            DataInputStream input = new DataInputStream(new FileInputStream(f1));
            while (true){
                System.out.println(input.readUTF());
            }
        }catch (IOException e){
            System.out.println(""+e);
        }
    }
}
