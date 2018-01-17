package stacks_and_queues;

import java.util.*;

public class AnimalShelter {
  List<Dog> dogList = new LinkedList<>();
  List<Cat> catList = new LinkedList<>();
  List<Animal> fullList = new LinkedList<>();
  
  public void enqueue(Animal animal) {
    if (animal instanceof Dog) {
      dogList.add(animal);
    }
    else if (animal instanceOf Cat) {
      catList.add(animal);
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
}
