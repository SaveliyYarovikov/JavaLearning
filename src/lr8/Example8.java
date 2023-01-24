package lr8;

import java.io.*;
import java.net.URL;

public class Example8 {
    public static void readAllByByte(Reader in)throws IOException{
        while (true){
            int oneByte = in.read();
            if (oneByte != -1){
                System.out.print((char) oneByte);
            }else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("E:\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "cp1251");

            readAllByByte(rFile);
            System.out.println("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inURL = new URL("http://google.com").openStream();
            Reader rURL = new InputStreamReader(inURL, "cp1251");

            readAllByByte(rURL);
            System.out.println("\n\n\n");
            rURL.close();
            inURL.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{65,66,67,68});
            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByByte(rArray);
            inArray.close();
            rArray.close();

        }catch (IOException e){
            System.out.println("\n" + "Ошибка!!!");
        }
    }
}
