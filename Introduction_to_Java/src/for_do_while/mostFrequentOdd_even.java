package for_do_while;

public class mostFrequentOdd_even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 2, 3, 6, 7, 7, 7, 8, 8, 8, 8};
        int mostFrequentOdd = findMostFrequentElement(arr, true); // Tìm phần tử có tần suất xuất hiện nhiều nhất ở vị trí lẻ
        int mostFrequentEven = findMostFrequentElement(arr, false); // Tìm phần tử có tần suất xuất hiện nhiều nhất ở vị trí chẵn
        System.out.println("Phần tử có tần suất xuất hiện nhiều nhất ở vị trí lẻ: " + mostFrequentOdd);
        System.out.println("Phần tử có tần suất xuất hiện nhiều nhất ở vị trí chẵn: " + mostFrequentEven);
    }

    public static int findMostFrequentElement(int[] arr, boolean isOddPosition) {
        int[] frequency = new int[1000001]; // Giả sử giá trị trong mảng không vượt quá 10^6
        int mostFrequentElement = arr[0];
        int maxFrequency = 0;

        // Duyệt qua các phần tử ở vị trí lẻ hoặc chẵn trong mảng
        for (int i = isOddPosition ? 1 : 0; i < arr.length; i += 2) {
            int num = arr[i];
            frequency[num]++;
            if (frequency[num] > maxFrequency) {
                maxFrequency = frequency[num];
                mostFrequentElement = num;
            }
        }

        return mostFrequentElement;
    }
}
