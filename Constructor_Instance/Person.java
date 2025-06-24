public class Person {
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Method for display the details about Person
    public void displayDetails() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Original person
        Person person1 = new Person("Ayush", 22);
        person1.displayDetails();

        System.out.println();

        // Clone using copy constructor
        Person person2 = new Person(person1);
        person2.displayDetails();
    }

}
