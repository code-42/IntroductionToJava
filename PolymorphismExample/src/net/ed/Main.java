package net.ed;



public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println(dog.MakeSound()); // Bow Wow
        System.out.println(cat.MakeSound()); // Meow
    }

    abstract static class Animal {
        public abstract String MakeSound();
    }

    static class Dog extends Animal {
        public String MakeSound() {
            return "Bow Wow";
        }
    }

    static class Cat extends Animal {
        public String MakeSound() {
            return "Meow";
        }
    }
}




