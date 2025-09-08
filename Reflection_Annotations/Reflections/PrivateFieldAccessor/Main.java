package Reflection_Annotations.Reflections.PrivateFieldAccessor;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person(30);

        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);

        int originalAge = (int) ageField.get(person);
        System.out.println("Original age: " + originalAge);

        ageField.set(person, 35);
        int newAge = (int) ageField.get(person);
        System.out.println("New age: " + newAge);
    }
}
