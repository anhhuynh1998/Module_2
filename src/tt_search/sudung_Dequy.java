package tt_search;

import java.util.Arrays;
import java.util.Scanner;

public class sudung_Dequy {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
    int n = scanner.nextInt();
    int[] array = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
        System.out.print("array[" + i + "] = ");
        array[i] = scanner.nextInt();
    }

        Arrays.sort(array); // Sắp xếp mảng theo thứ tự tăng dần

        System.out.print("Nhập giá trị cần tìm: ");
    int value = scanner.nextInt();
    int result = binarySearch(array, 0, n - 1, value);
        if (result == -1) {
        System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
    } else {
        System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result + " trong mảng.");
    }
}

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle; // Nếu tìm thấy giá trị, trả về vị trí của giá trị trong mảng
            } else if (array[middle] < value) {
                left = middle + 1; // Nếu giá trị cần tìm lớn hơn giá trị ở vị trí middle, tìm trong nửa phải của mảng
            } else {
                right = middle - 1; // Nếu giá trị cần tìm nhỏ hơn giá trị ở vị trí middle, tìm trong nửa trái của mảng
            }
        }
        return -1; // Nếu không tìm thấy giá trị, trả về -1
    }
}
