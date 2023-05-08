package exception.checked_Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo_IOException {
    public static void main(String[] args) {
        try {
            File file = new File("IOException.txt");
            FileReader fr = new FileReader(file);
        } catch (IOException e) {
            System.out.println("không đọc đuược file");
            e.printStackTrace();
        }
    }
}
