package inheritance.Gemetry;

public class CircleText {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle("red",true,3.5);
        System.out.println(circle);
    }
}
