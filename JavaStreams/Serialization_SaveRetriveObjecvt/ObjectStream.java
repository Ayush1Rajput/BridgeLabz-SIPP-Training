package JavaStreams.Serialization_SaveRetriveObjecvt;

import java.io.*;

class Employee implements Serializable {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectStream {
    public static void main(String[] args) {
        Employee employee = new Employee("Ayush", 24);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.ser"))) {
            oos.writeObject(employee);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.ser"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Deserialized object: " + deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
