package inTerFace.BaiTap;

public class Agry extends Bird implements Flyable {
    public Agry(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("ăn Thịt Vói");
    }

    @Override
    public void fly() {
        System.out.println("t biết bay");
    }
}
