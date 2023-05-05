package inTerFace.BaiTap;

public class Dog extends Animal{
    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {

    }
    public void run(){
        System.out.println("t biết chạy");
    }
}
