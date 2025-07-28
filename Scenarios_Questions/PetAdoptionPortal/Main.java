package Scenarios_Questions.PetAdoptionPortal;

public class Main {
	public static void main(String[] args) {
		PetPortal<Pet> pet = new PetPortal();
		
		pet.addPet(new Pet("Dog",12,true));
		pet.addPet(new Pet("Cat",5,true));
		pet.addPet(new Pet("Parrot",2,false));
		pet.addPet(new Pet("Dog",6,false));
		pet.addPet(new Pet("Cat",2,true));
		pet.addPet(new Pet("Turtle",45,true));
		
		pet.displayDetails();
		
		pet.availablePets();
		
		pet.availablePets("Dog");
	}
}
