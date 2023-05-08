package file_IO;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\do.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            System.out.println(bufferedReader.read()); //--> đọc từng kí tự và trả về dưới dạng số thập phân
//            int c ;
//            while ((c = bufferedReader.read()) != -1){
//                System.out.println((char) c);
//            }
//            String temp ;
//            while ((temp = bufferedReader.readLine()) != null){
//                System.out.println(temp);
//            }
//            char[] items = {'c' , 'o' , 'd' , 'e' , 'g' , 'y' , 'm'};
            char[] items = new char[3];
            String string = "" ;
            int count = -1 ;
            while ((count = bufferedReader.read(items)) != -1 ){
//                System.out.println(Arrays.toString(items));
                for (int i = 0; i < count; i++) {
                    string += items[i];
                }
            }
            System.out.println(string);
        } catch (FileNotFoundException fileNotFoundException){
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void basicBufferFileWriter(){
        try {
            FileWriter fileWriter = new FileWriter("D:\\exception\\input-file1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // --> tính đa hình
            bufferedWriter.write(65); //--> viết nhưng chưa ghi ra
            bufferedWriter.flush(); //--> ghi ra file trước khi bộ nhớ đầy
        } catch (IOException ioException){
        }
    }
    public static void basicText(){
        File file = new File("D:\\exception\\input-file.txt");
        System.out.println("Tên file: " + file.getName()); //--> Lấy tên file
        System.out.println("Thư mục: " + file.getParent());// --> Lấy tên thư mục chưa tên file
        System.out.println("Thư mục: " + file.getPath());// --> Lấy toàn bộ thư mục + tên file
        file.exists(); //--> Kiểm tra file có tồn tại k --> trả về boolean
        char[] items = {'c' , 'o' , 'd' , 'e' , 'g' , 'y' , 'm'};
        try {
            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("Hello");
//            fileWriter.write(items , 4 , 3);
            fileWriter.write(53);
            fileWriter.close(); // --> Dùng để giải phóng tài nguyên --> và ghi nội dung xuống file đo
        } catch (IOException o){
        }
    }

}
