package lr8;
import java.io.*;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        try {
            File f1 = new File("E:\\MyFile1.txt");
            f1.createNewFile();
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();

            DataOutputStream write = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            BufferedReader read = new BufferedReader(new FileReader(f1.getAbsolutePath()));
            DataInputStream read2 = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));

            System.out.println("Введите числа:");
            for (int i = 0; i < 5; i++){
                write.writeDouble(sc.nextDouble());
            }
            write.writeChars("\n");
            sc.nextLine();
            System.out.println("Введите строки:");
            for (int i = 0; i < 2; i++){
                if (i == 1){
                    write.writeChars("\n");
                }
                write.writeUTF(sc.nextLine());
            }
            write.flush();
            write.close();
            write = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            for (int i = 0; i < 3; i++){
                String str = read.readLine();
                if (i == 2){
                    write.writeUTF(str);
                }
            }
            write.writeChars("\n");
            for (int i = 0; i < 5; i++){
                double number = read2.readDouble();
                if (number > 0){
                    write.writeDouble(number);
                }
            }
        }catch (Exception e){
            System.out.println("Ошибка!!!");
        }
    }
}
