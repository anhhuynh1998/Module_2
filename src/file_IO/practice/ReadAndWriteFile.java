package file_IO.practice;

import javafx.scene.shape.HLineTo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) !=null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("file không tồn tại or lỗi");
        }
        return numbers;
    }
    public static  int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    private void writeFile(String filePath, int max) {
        try {

            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Module_2\\Introduction_to_Java\\do.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Module_2\\Introduction_to_Java\\result.txt", maxValue);
    }
}
