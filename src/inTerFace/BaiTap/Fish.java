package inTerFace.BaiTap;

import inTerFace.BaiTap.Animal;

public abstract class Fish extends Animal {


    public Fish(String name, double weight) {
        super(name, weight);
    }
    public void swim(){
        System.out.println("I can swimming");
    }
}
