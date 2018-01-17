package stacks_and_queues;

import java.util.*;

public class AnimalShelter {
    LinkedList<Dog> dogList = new LinkedList<>();
    LinkedList<Cat> catList = new LinkedList<>();
    LinkedList<Animal> fullList = new LinkedList<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dogList.add(dog);
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            catList.add(cat);
        }
        fullList.add(animal);
    }

    public Animal dequeueAny() {
        Animal animal = fullList.poll();
        if (animal instanceof Dog) {
            dogList.poll();
        } else {
            catList.poll();
        }
        return animal;
    }

    public Dog dequeueDog() {
        Dog dog = dogList.poll();
        fullList.remove(dog);
        return dog;
    }

    public Cat dequeueCat() {
        Cat cat = catList.poll();
        fullList.remove(cat);
        return cat;
    }

    private abstract class Animal {
    }

    private class Dog extends Animal {
    }

    private class Cat extends Animal {
    }
}
