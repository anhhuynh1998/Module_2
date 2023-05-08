package arrayList_ctdl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionExample {
    public static void main(String[] args) {

        // sử dụng HashSet để lưu trữ danh sách các quốc gia không có thứ tự
        Set<String> countries = new HashSet<String>();

        // thêm các quốc gia vào set
        countries.add("Vietnam");
        countries.add("Japan");
        countries.add("China");
        countries.add("Thailand");
        countries.add("Japan"); // thêm phần tử trùng lặp

        System.out.println("Danh sách các quốc gia: " + countries);

        // sử dụng ArrayList để lưu trữ danh sách sinh viên
        ArrayList<String> students = new ArrayList<String>();

        // thêm sinh viên vào danh sách
        students.add("Nguyen Van A");
        students.add("Tran Thi B");
        students.add("Le Van C");
        students.add("Hoang Thi D");

        System.out.println("Danh sách sinh viên: " + students);

        // sử dụng LinkedList để lưu trữ danh sách các số nguyên
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        // thêm các số vào danh sách
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.addFirst(5); // thêm phần tử vào đầu danh sách
        numbers.addLast(50); // thêm phần tử vào cuối danh sách

        System.out.println("Danh sách các số: " + numbers);

    }
}
