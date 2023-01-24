package lr8;

import java.io.*;

public class Example7 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            br = new BufferedReader(new FileReader("E:\\MyFile1.txt"),1024);
            out = new BufferedWriter(new FileWriter("E:\\MyFile2.txt"));

            int rowCount = 0;
            String str;

            while ((str = br.readLine()) != null){
                rowCount++;
                System.out.println(rowCount + ":" + str);
                out.write(str);
                out.newLine();
            }
        }catch (IOException e){
            System.out.println("Ошибка!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
