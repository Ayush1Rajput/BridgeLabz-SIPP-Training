package Scenarios_Questions.PetAdoptionPortal;


public class Pet {
    private String type;     
    private int age;
    private boolean isAdopted;

    public Pet(String type, int age, boolean isAdopted) {
        this.type = type;
        this.age = age;
        this.isAdopted = isAdopted;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void adopt() {
        this.isAdopted = true;
    }    
}
