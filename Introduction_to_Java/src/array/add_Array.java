package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class add_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr));

        // Tạo một mảng mới với kích thước là arr.length + 1
        int[] newArr = new int[arr.length + 1];

        // Sao chép các phần tử từ mảng cũ vào mảng mới
        System.arraycopy(arr, 0, newArr, 0, arr.length);

        // Thêm phần tử mới vào cuối mảng
        int newElement = 6;
        newArr[arr.length] = newElement;

        System.out.println("Mảng sau khi thêm phần tử mới:");
        System.out.println(Arrays.toString(newArr));
    }
}
