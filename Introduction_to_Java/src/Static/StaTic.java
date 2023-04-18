package Static;

public class StaTic {
        private static double pi = 3.14; // Định nghĩa một thành viên static là pi

        public static double getPi() { // Định nghĩa một phương thức static để lấy giá trị của pi
            return pi;
        }

    public static void main(String[] args) {
        System.out.println(getPi());
    }
}
