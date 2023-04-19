package oop.Rectangle_Main;

import oop.Rectangle_Main.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng :");
        double width = scanner.nextDouble();
        System.out.print("nhập chiều cao :");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("diện tích là :" + rectangle.getArea());
        System.out.println("chu vi là :" + rectangle.getPerimeter());
        System.out.println("Your Rectangle \n" + rectangle.display());
    }
}
