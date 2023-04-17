package oop;

public class Animal {
    private String species;
    private int age;

    // Constructor không tham số
    public Animal() {
        this.species = "Unknown";
        this.age = 0;
    }

    // Constructor có một tham số
    public Animal(String species) {
        this.species = species;
        this.age = 0;
    }

    // Constructor có hai tham số
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    // Getter và Setter cho thuộc tính species
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter và Setter cho thuộc tính age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức hiển thị thông tin đối tượng Animal
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }
}
