package lr8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    public static void readAllByByte (InputStream in) throws IOException{
        while (true){
            int oneByte = in.read();
            if (oneByte != -1){
                System.out.print((char) oneByte);
            }else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args)throws IOException {
        try {
            InputStream inFile = new FileInputStream("E:\\MyFile2.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte [] {32,32,32,51,50,49});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        }
        catch (IOException e){
            System.out.println("Ошибка " + e);
        }
    }
}
