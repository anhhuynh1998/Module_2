package Static.Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("Radius" + circle.getRadius());
        System.out.println("area " + circle.getArea());
    }
}
