package for_do_while;

import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số bạn muốn kiểm tra :");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + "không phải là số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        if (check)
            System.out.println(number + " là số nguyên tố");
        else
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
