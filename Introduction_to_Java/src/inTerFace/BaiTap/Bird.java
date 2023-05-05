package inTerFace.BaiTap;

import inTerFace.BaiTap.Animal;

public abstract class Bird extends Animal{


    public Bird(String name, double weight) {
        super(name, weight);
    }

    public void  Bark() {
        System.out.println("Gâu Gâu");;
    }
}
