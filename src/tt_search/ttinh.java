package tt_search;

public class ttinh {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { // Nếu tìm thấy giá trị cần tìm
                return i; // Trả về chỉ số của giá trị trong mảng
            }
        }
        return -1; // Nếu không tìm thấy giá trị cần tìm, trả về -1
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25, 30 };
        int target = 15;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại chỉ số " + result);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }
}
