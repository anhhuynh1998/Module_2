package inTerFace.BaiTap;

public class Dolphin extends Fish {
    public Dolphin(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("Ăn cá");
    }
}
