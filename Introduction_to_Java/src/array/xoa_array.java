package array;

public class xoa_array {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToRemove = 2; // Giả sử muốn xóa phần tử có index là 2

        // Kiểm tra xem indexToRemove có hợp lệ hay không
        if (indexToRemove >= 0 && indexToRemove < myArray.length) {
            // Dịch chuyển các phần tử bên phải của phần tử cần xóa sang trái để ghi đè lên phần tử cần xóa
            for (int i = indexToRemove; i < myArray.length - 1; i++) {
                myArray[i] = myArray[i + 1];
            }

            // Đặt giá trị 0 cho phần tử cuối cùng, vì số phần tử trong mảng đã giảm đi 1
            myArray[myArray.length - 1] = 0;
        }

        System.out.println("Mảng sau khi xóa phần tử: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
