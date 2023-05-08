package tt_sapXep;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // So sánh cặp phần tử liên tiếp
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi chúng nếu chúng không đúng thứ tự
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Mảng ban đầu:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
