package bai_tap;

import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số nguyên dương n :");
        int number = scanner.nextInt();
        int count = 0;
        int countNT = 0;
        int i = 2;
        while (i <= 1000) {
            if (countNT < number) {
                int j = 1;
                while (j <= i) {
                    if (i % j == 0) {
                        count += 1;
                    }
                    j++;
                }
                if (count == 2) {
                    System.out.println(i);
                    countNT += 1;
                }
                count = 0;
                i++;
            } else {
                break;
            }
        }
    }
}
