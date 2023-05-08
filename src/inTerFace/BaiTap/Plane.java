package inTerFace.BaiTap;

import inTerFace.BaiTap.Bird;

public class Plane extends Bird implements Flyable{
    public Plane(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println(" ăn xăng,uống dầu");
    }

    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
