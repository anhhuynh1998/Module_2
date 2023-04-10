package bai_tap;
// interger.parseint(scanner.nextint())
// %s -> string
// %d -> integer
// %f -> float

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (i != 2)
                continue;
            System.out.println(i);
        }
    }
}

