// Superclass
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Subclass: Dog
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// Subclass: Cat
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// Subclass: Bird
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal myDog = new Dog("Bruno", 5);
        Animal myCat = new Cat("honey", 3);
        Animal myBird = new Bird("chichi", 2);

        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();
    }
}
