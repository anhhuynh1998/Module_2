package bai_tap;

import java.util.Scanner;

public class b14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();
        scanner.close();

        long giaithua = giaithua(n);
        System.out.println("Giai thừa của " + n + " là: " + giaithua);
    }
    public static long giaithua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * giaithua(n - 1);
        }
    }
}
