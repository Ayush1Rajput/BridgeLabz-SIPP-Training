package Reflection_Annotations.Reflections.PrivateMethodInvoker;

import java.lang.reflect.Method;

public class Main {
     public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        int result = (int) multiplyMethod.invoke(calculator, 5, 10);
        System.out.println("Result of private multiply method: " + result);
    }
}
