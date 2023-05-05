package queue_And_stack;

public class DemoQueueAndStack {
    private int[] arr; // mảng lưu trữ các phần tử
    private int front; // con trỏ front theo dõi phần tử đầu tiên trong Queue

    public DemoQueueAndStack(int capacity) {
        arr = new int[capacity];
        front = 0;
    }

    public boolean offer(int value) {
        // Kiểm tra xem Queue đã đầy chưa
        if (front == arr.length) {
            return false;
        }

        arr[front] = value;
        front++;
        return true;
    }

    public int peek() {
        // Kiểm tra xem Queue có rỗng không
        if (front == 0) {
            return -1;
        }

        return arr[0];
    }
}
