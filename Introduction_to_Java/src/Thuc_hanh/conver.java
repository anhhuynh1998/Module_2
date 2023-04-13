package Thuc_hanh;

import java.util.Scanner;

public class conver {
    public static void main(String[] args) {
        float vnd = 23000 ;
        float usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số usd bạn muốn quy đổi :");
        usd = scanner.nextFloat();
        float quydoi = usd * vnd;
        System.out.println("số tiền bạn quy đổi được là :" + quydoi);
    }
}
