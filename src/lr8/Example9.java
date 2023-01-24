package lr8;

import java.io.*;

public class Example9 {
    public static void main(String[] args)throws IOException {
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\MyFile1.txt"),"cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\MyFile1.txt"),"cp1251"));

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }

        }catch (IOException e){
            System.out.println("Ошибка!!!");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
