package FunctionalInterface.UnitConversionDemo;

import java.util.*;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter distance in km: ");
	        double km = sc.nextDouble();
	        System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");

	        System.out.print("Enter weight in kg: ");
	        double kg = sc.nextDouble();
	        System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");

	        sc.close();
	    }
}
