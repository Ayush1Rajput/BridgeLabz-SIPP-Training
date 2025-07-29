package Scenarios_Questions.PetAdoptionPortal;

import java.util.ArrayList;

public class PetPortal <T extends Pet>{
	private ArrayList<T> list;
	
	public PetPortal() {
		list = new ArrayList<>();
	}
	
	public void addPet(T pet) {
		list.add(pet);
	}
	
	public void displayDetails() {
		System.out.println("--- Pet Details ---");
		for(T p : list) {
			System.out.println("Pet Type : "+ p.getType());
			System.out.println("Pet Age : "+p.getAge());
			System.out.println("Pet Adopted : "+p.isAdopted());
			System.out.println();
		}
	}
	
	public void availablePets() {
		System.out.println("--- Available Pet Details ---");
		for(T p : list) {
			if(p.isAdopted()) {
				System.out.println("Pet Type : "+ p.getType());
				System.out.println("Pet Age : "+p.getAge());
//				System.out.println("Pet Adopted : "+p.isAdopted());
				System.out.println();
			}
		}
	}
	
	public void availablePets(String name) {
		System.out.println("--- Available Pet Details ---");
		for(T p : list) {
			if(!p.isAdopted() && 
				p.getType().toLowerCase().equals(name.toLowerCase())) {
				System.out.println("Pet Type : "+ p.getType());
				System.out.println("Pet Age : "+p.getAge());
//				System.out.println("Pet Adopted : "+p.isAdopted());
				System.out.println();
			}
		}
	}
}
