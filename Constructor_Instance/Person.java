public class Person {
    // Attributes
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    
    public static void main(String[] args) {
        // Create original person
        Person person1 = new Person("Alice", 28);
        person1.displayInfo();

        System.out.println();

        // using copy constructor
        Person person2 = new Person(person1);
        person2.displayInfo();
    }
}
