package for_do_while;

import java.util.Scanner;

public class ht_snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số nguyên dương n :");
        int number = scanner.nextInt();
        int count = 0;
        int countNT = 0;
        for (int i = 0; i <= 1000; i++) {
            if (countNT < number) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count += 1;
                }
                if (count == 2) {
                    System.out.println(i);
                    countNT += 1;
                }
                count = 0;
            } else
                break;
        }
    }
}
