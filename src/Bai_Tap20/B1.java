package Bai_Tap20;

import java.util.ArrayList;

public class B1 {
    public static void main(String[] args) {
        int[] arr = {123, 456, 789, 135, 246};
        ArrayList<Integer> result = oddDigitsArray(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> oddDigitsArray(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String strNum = Integer.toString(arr[i]);
            boolean allOdd = true;
            for (int j = 0; j < strNum.length(); j++) {
                if (Integer.parseInt(Character.toString(strNum.charAt(j))) % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) {
                result.add(arr[i]);
            }
        }
        return result;
    }

}
