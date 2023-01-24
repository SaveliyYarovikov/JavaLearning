package lr8;

import java.io.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try{
            File f1 = new File("E:\\My\\numIsh.txt");
            f1.createNewFile();
            Scanner in = new Scanner(System.in, "cp1251");

            DataOutputStream write = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = in.nextInt();
            System.out.println("Введите числа:");

            for (int i = 0; i < count; i++){
                write.writeFloat(in.nextFloat());
            }
            write.flush();
            write.close();

            File f2 = new File("E:\\My\\numRez.txt");
            f2.createNewFile();

            DataInputStream read = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            write = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try {
                while (true){
                    float number = read.readFloat();
                    write.writeFloat(number);
                    System.out.println("Число " + number);
                }
            }catch (EOFException e){}
            write.flush();
            write.close();
            read.close();
        }catch (IOException e){
            System.out.println("End of file");
        }
    }
}
