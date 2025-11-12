import java.util.*;

public class AnimalDemo {
    static class Animal { String name; Animal(String n){name=n;} public String toString(){return name;} }
    static class Dog extends Animal { Dog(String n){super(n);} }
    static class Cat extends Animal { Cat(String n){super(n);} }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println("Animal: " + a);
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Buddy"));
        List<Cat> cats = Arrays.asList(new Cat("Mittens"), new Cat("Luna"));

        System.out.println("Dogs:");
        printAnimals(dogs);

        System.out.println("Cats:");
        printAnimals(cats);
    }
}
