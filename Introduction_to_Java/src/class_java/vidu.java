package class_java;

public class vidu {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Animal với giá trị ban đầu
        Animal lion = new Animal("Lion", 5);

        // Sử dụng Getter để lấy giá trị của thuộc tính species và age
        System.out.println("Species: " + lion.getSpecies());
        System.out.println("Age: " + lion.getAge() + " years");

        // Sử dụng Setter để thiết lập giá trị mới cho thuộc tính species và age
        lion.setSpecies("Tiger");
        lion.setAge(6);

        // Gọi phương thức displayInfo() để hiển thị thông tin đối tượng Animal
        lion.displayInfo();
    }

}
