package bai_tap;

import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int fn_1 = 0;
        int fn_2 = 1;
        System.out.print(fn_1 + " ");
        System.out.println("Các phần tử đầu tiên của dãy Fibonacci từ 0 đến " + n + " là: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fn_2 + " ");
            int sum = fn_1 + fn_2;
            fn_1 = fn_2;
            fn_2 = sum;
        }
    }
}
