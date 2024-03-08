package Base.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter Input = new BufferedWriter(new FileWriter("Hello.txt"));
            Input.write("Hello Boyyyy\n");
            Input.write("I will love to tell you stories\n ");
            Input.write("Thats So Cooooooollllllllll");
            Input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
