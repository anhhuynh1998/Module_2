package tt_search;

public class np_binarySearch {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo một mảng đã sắp xếp
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1; // Giá trị cần tìm
        // Bước 2: Gọi hàm binarySearch để tìm kiếm giá trị target trong mảng arr
        int result = binarySearch(arr, 0, arr.length - 1, target);

        // Bước 9: Kiểm tra kết quả trả về từ hàm
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        } else {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + result + " trong mảng.");
        }
    }

    // Hàm tìm kiếm nhị phân đệ quy
    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2; // Bước 4: Tính giá trị trung gian

            if (arr[middle] == value) { // Bước 5: Nếu giá trị trung gian bằng giá trị cần tìm, trả về vị trí
                return middle;
            } else if (arr[middle] < value) { // Bước 6: Nếu giá trị trung gian nhỏ hơn giá trị cần tìm, tiếp tục tìm kiếm bên phải
                return binarySearch(arr, middle + 1, right, value);
            } else { // Bước 7: Nếu giá trị trung gian lớn hơn giá trị cần tìm, tiếp tục tìm kiếm bên trái
                return binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1; // Bước 8: Nếu không tìm thấy giá trị, trả về -1
    }
}
