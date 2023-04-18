package oop.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return  a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a :");
        double a = scanner.nextDouble();
        System.out.print("nhập b :");
        double b = scanner.nextDouble();
        System.out.print("nhập c :");
        double c = scanner.nextDouble();
        double delta = b*2 - 4*a*c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta) / (2 * a));
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm: " + root1 + ", " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Phương trình có 1 nghiệm: " + root);
        } else {
            System.out.println("Phương trình không có nghiệm thực");
        }
    }


    
}
