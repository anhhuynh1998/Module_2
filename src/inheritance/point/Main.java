package inheritance.point;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(3, 4, 1, 2);
        System.out.println(mp.toString()); // Kết quả: (3,4), speed=(1,2)

        mp.move();
        System.out.println(mp.toString()); // Kết quả: (4,6), speed=(1,2)
    }
}
