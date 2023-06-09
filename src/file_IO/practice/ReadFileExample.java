package file_IO.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum  = 0 ;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("tổng : " + sum);
        }catch (Exception e){
            System.out.println("file không tồn tại");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file : ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
