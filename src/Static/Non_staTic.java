package Static;

public class Non_staTic {
    private double radius; // Định nghĩa một thành viên non-static là radius

    public Non_staTic(double radius) { // Định nghĩa constructor để khởi tạo radius
        this.radius = radius;
    }

    public double getRadius() { // Định nghĩa một phương thức non-static để lấy giá trị của radius
        return radius;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
