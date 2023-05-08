package Thuc_hanh;

import java.util.Scanner;

public class toan_tu {
    public static void main(String[] args) {
        float width;
        float heigth;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập width :");
        width = scanner.nextFloat();
        System.out.println("Nhập height");
        heigth = scanner.nextFloat();
        float area = width * heigth;
        System.out.println("Area is :" + area);

    }
}
