package inheritance.New_Circle;

public class Circle {
    private double radius = 2.0;
    private String color = "red";
    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Circle setColor(String color) {
        this.color = color;
        return this;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "bán kính là :"
                + getRadius()
                +"và màu sắc"
                + getColor();
    }
}
