package array;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        final int size = 5;
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập" + size + "giá trị mảng :");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("giá trị nhỏ nhất là :" + min);
    }
}
