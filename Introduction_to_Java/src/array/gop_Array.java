package array;

import java.util.Arrays;

public class gop_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6};
        int[] arr2 = {2, 3, 6, 8};
        int newArrLength = arr1.length + arr2.length;
        int[] newArr = new int[newArrLength];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
