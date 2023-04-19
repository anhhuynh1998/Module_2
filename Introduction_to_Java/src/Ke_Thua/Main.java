package Ke_Thua;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Dog
       Dog dog = new Dog("Buddy", 3, "Labrador");

        // Truy cập vào các thuộc tính của lớp cha
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);

        // Gọi phương thức của lớp cha
        dog.makeSound();

        // Gọi phương thức riêng của lớp con
        dog.fetch();
    }
}
