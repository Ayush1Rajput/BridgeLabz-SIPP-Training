package LambdaExpressions.SmartHomeLightingAutomation;

import java.util.function.Consumer;

public class SmartHomeLighting {

    public static void main(String[] args) {
        
        Consumer<String> motionDetected = (room) -> {
            System.out.println("Motion detected in " + room + ": Turning on the lights.");
        };
        
        Consumer<String> timeOfDay = (time) -> {
            System.out.println("Time of day is " + time + ": Adjusting light intensity.");
        };
        
        Consumer<String> voiceCommand = (command) -> {
            System.out.println("Voice command received: " + command + " - Activating lights.");
        };

       
        triggerLightBehavior(motionDetected, "Living Room");
        triggerLightBehavior(timeOfDay, "Evening");
        triggerLightBehavior(voiceCommand, "Turn on kitchen lights");
    }
    public static void triggerLightBehavior(Consumer<String> lightBehavior, String condition) {
        lightBehavior.accept(condition);  
    }
}
