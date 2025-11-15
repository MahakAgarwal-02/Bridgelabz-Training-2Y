package generics;
import java.util.*;

class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class animalHeirarchy {
	public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }

    public static void main(String[] args) {

        List<Dog> dogList = Arrays.asList(new Dog(), new Dog());
        List<Cat> catList = Arrays.asList(new Cat(), new Cat());

        System.out.println("Dog List:");
        printAnimals(dogList);   

        System.out.println("\nCat List:");
        printAnimals(catList);   
    }
}
