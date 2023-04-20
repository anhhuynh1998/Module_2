package inheritance.New_Circle;

public class Cylinder extends Circle{
    private double height = 3.0;
    public Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public Cylinder setHeight(double height) {
        this.height = height;
        return this;
    }
    public double getArea(){
        return this.height * super.getArea();
    }
    @Override
    public String toString(){
        return "chiều cao là :"
                +getHeight()
                +"và thể tích là"
                + getArea();
    }
}
