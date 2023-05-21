package Bai_Tap20;

import java.util.ArrayList;
import java.util.Scanner;

public class B19 {
    //Dòng đầu tiên chứa số nguyên N (số phần tử ban đầu của L).
    // Dòng thứ hai chứa N số nguyên cách nhau bởi dấu cách mô tả L .
    // Dòng thứ ba chứa một số nguyên, Q (số truy vấn).
    // Các dòng tiếp theo của 2Q mô tả các truy vấn và mỗi truy vấn được mô tả trên hai dòng:
    // Nếu dòng đầu tiên của truy vấn chứa Chèn chuỗi, thì dòng thứ hai chứa hai số nguyên được phân tách bằng dấu cách x y
    // và giá trị y phải được chèn vào L tại chỉ số x .
    // Nếu dòng đầu tiên của truy vấn chứa Chuỗi Xóa, thì dòng thứ hai chứa chỉ mục x , phần tử của nó phải bị xóa khỏi L .
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số phần tử ban đầu của danh sách L
        int n = sc.nextInt();

        // Khởi tạo danh sách L và đọc các phần tử ban đầu của nó
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            L.add(x);
        }

        // Đọc số truy vấn Q
        int Q = sc.nextInt();

        // Xử lý các truy vấn
        for (int i = 0; i < Q; i++) {
            String query = sc.next();
            if (query.equals("Chèn")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x, y);
            } else if (query.equals("Xóa")) {
                int x = sc.nextInt();
                L.remove(x);
        }
    }

        // In danh sách L sau khi xử lý các truy vấn
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }
        System.out.println();
    }
}



