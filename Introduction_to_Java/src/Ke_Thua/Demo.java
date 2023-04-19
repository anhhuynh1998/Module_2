package Ke_Thua;

    //lớp cha(supperclass)
    class Animal {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("tiếng kêu của động vật");
        }
    }

    // lớp con (subclass) kế thừa từ lớp cha
     class Dog extends Animal {
        String breed;

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        // ghi đè phương tức makeSound của lớp cha
        public void makeSound() {
            System.out.println("tiếng sủa");
        }

        //phương thức riêng của lớp con
        public void fetch() {
            System.out.println("Dog fetches");
        }


    }
