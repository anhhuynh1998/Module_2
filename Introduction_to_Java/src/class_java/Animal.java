package class_java;

public class Animal {
        private String species;
        private int age;

        // Constructor
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
