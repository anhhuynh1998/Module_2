package tt_search;

public class n_phan {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Tìm vị trí giữa của khoảng tìm kiếm

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu giá trị tại vị trí giữa trùng khớp với giá trị cần tìm
            } else if (arr[mid] < target) {
                left = mid + 1; // Nếu giá trị tại vị trí giữa nhỏ hơn giá trị cần tìm, chuyển sang phần bên phải
            } else {
                right = mid - 1; // Nếu giá trị tại vị trí giữa lớn hơn giá trị cần tìm, chuyển sang phần bên trái
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy giá trị cần tìm trong mảng
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // Mảng đã được sắp xếp
        int target = 17; // Giá trị cần tìm

        int result = binarySearch(arr, target); // Gọi phương thức binarySearch để tìm kiếm giá trị cần tìm trong mảng

        if (result != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Giá trị " + target + " không tồn tại trong mảng.");
        }
    }
}
