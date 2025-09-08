package Reflection_Annotations.Reflections.DynamicObjectCreator;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> studentClass = Class.forName("Student");

        Student student = (Student) studentClass.getDeclaredConstructor().newInstance();
    }
}
