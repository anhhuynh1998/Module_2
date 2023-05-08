package arrayList_ctdl.ArrayList;

import java.util.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        // Khởi tạo một danh sách rỗng
        ArrayList<String> myList = new ArrayList<>();

        // Thêm các phần tử vào danh sách
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        System.out.println(myList);

        // Chèn một phần tử vào vị trí chỉ định trong danh sách
        myList.add(1, "grape");
        System.out.println(myList);

        // Xóa phần tử tại vị trí chỉ định trong danh sách
        myList.remove(2);
        System.out.println(myList);

        // Trả về số lượng phần tử trong danh sách
        int size = myList.size();

        // Tạo một bản sao của danh sách và in ra
        ArrayList<String> cloneList = (ArrayList<String>) myList.clone();
        System.out.println(cloneList);

        // Kiểm tra xem danh sách có chứa phần tử được chỉ định hay không
        boolean contains = myList.contains("banana");
        System.out.println(contains);


        // Trả về chỉ số đầu tiên của phần tử được chỉ định trong danh sách
        int index = myList.indexOf("apple");
        System.out.println(index);


        // Thêm một phần tử vào cuối danh sách
        boolean added = myList.add("kiwi");
        System.out.println(added);


        // Đảm bảo rằng danh sách có thể chứa ít nhất 10 phần tử
        myList.ensureCapacity(10);

        // Lấy phần tử tại vị trí chỉ định trong danh sách
        String element = myList.get(3);
        System.out.println(element);


        // Xóa tất cả các phần tử trong danh sách
        myList.clear();
    }
}
