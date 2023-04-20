package inheritance.New_Circle;

public class TextCircle {
    public static void main(String[] args) {
        Circle circle = new Circle()
                .setColor("red")
                .setRadius(2.0);
        System.out.println(circle);
    }
}
