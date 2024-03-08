package Base.FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class BufferReader {
    public static void main(String[] args) {


        try(BufferedReader in = new BufferedReader(new FileReader("Hello.txt"))) {
          String Lines;
          while ((Lines=in.readLine()) != null){
              System.out.println(Lines);
          }
            in.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
