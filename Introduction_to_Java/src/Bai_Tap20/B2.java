package Bai_Tap20;

import java.util.ArrayList;

public class B2 {
    public static ArrayList<Integer> findPrimePositions() {
        ArrayList<Integer> primePositions = new ArrayList<>();
        int[] arr = {1,43,2,4,6,8,9,43,2};
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primePositions.add(i);
            }
        }
        return primePositions;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(findPrimePositions());
    }

}
