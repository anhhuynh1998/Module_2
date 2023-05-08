package bai_tap;

import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int fn_1 = 0;
        int fn_2 = 1;
        int fn;

        System.out.print("Dãy Fibonacci với " + n + " phần tử đầu tiên là: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(fn_1 + " ");

            fn = fn_1 + fn_2;
            fn_1 = fn_2;
            fn_2 = fn;
        }
    }
}
