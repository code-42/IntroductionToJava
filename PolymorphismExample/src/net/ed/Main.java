package net.ed;

/**
 * Assignment: Describe an OOP Concept
 * Pick one of the OOP concepts: Inheritance, Encapsulation, Polymorphism etc... and write up one paragraph on a google document.
 *
 * For this assignment, I chose to describe Polymorphism because it’s not easy to explain.  Also, I like the way the Lego video explained it in Section 4 Lecture 9 in this video →   https://www.udemy.com/master-object-orientation-with-lego-illustrations/learn/v4/t/lecture/4038000?start=0
 *
 * Basically, polymorphism allows the program to do one thing for one type of object, and do a different thing for a different type of object.
 */

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




