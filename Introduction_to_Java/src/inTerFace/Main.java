package inTerFace;

import inTerFace.BaiTap.*;
import inTerFace.BaiTap.Runnable;

import java.util.function.BiConsumer;

import static com.sun.glass.ui.Application.run;

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("faker",20.0);
        Agry agry = new Agry("dodo",3.0);
        Dog dog = new Dog("đen",10.0);
        Plane plane = new Plane("phan luc",700.0);
        Car car = new Car("BMV",1500.0);
        catWalk(dolphin);
        catWalk(agry);
        catWalk(dog);
        catWalk(plane);
        catWalk(car);


    }
    public static void catWalk(Animal animal){
        animal.eat();
        if (animal instanceof Runnable)
            ((Runnable) animal).run();
        if (animal instanceof Flyable)
            ((Flyable) animal).fly();
    }
}
