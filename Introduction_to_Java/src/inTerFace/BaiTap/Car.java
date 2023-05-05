package inTerFace.BaiTap;

public class Car extends Animal implements Runnable{
    public Car(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("ăn xăng, uống dầu");
    }

    @Override
    public void run() {
        System.out.println("chạy bằng động cơ");
    }
}
