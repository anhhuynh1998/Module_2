package Static.Property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda","sky");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("BMW","t1");
        System.out.println(Car.numberOfCars);
    }
}
