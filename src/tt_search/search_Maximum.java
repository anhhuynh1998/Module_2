package tt_search;

import java.util.LinkedList;
import java.util.Scanner;

public class search_Maximum {
    public static void main(String[] args) { //gọi hàm main
        Scanner input = new Scanner(System.in); // gọi thư viện Scanner
        LinkedList<Character> max = new LinkedList<>(); //gọi thư vịên linked<character cho max
        LinkedList<Character> list = new LinkedList<>(); // gọi thư viện cho list
        System.out.print("nhập chuỗi"); // gọi sout để nhập chuỗi từ người dùng
        String string = input.nextLine(); // gọi hàm String để lấy input từ người dùng
            // tìm chuỗi có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) { //sử dụng vòng lặp
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i)) ){ // nếu độ dài của list lớn hơn 1 và ký tự hiện tại của chỗi nhỏ hơn hoặc bằng ký tu cuoi cung
                list.clear();// thì thực hiện lệnh này .clear là xóa toàn bộ phần tử chọn
            }
            list.add(string.charAt(i));
            if ( list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();


    }
}
