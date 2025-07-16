package Scenario_Based_Question.IceCreamRush;

class IceCreamFlavor {
    String name;
    int quantity;

    public IceCreamFlavor(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}


class Operation {

    public void bubbleSort(IceCreamFlavor[] icecream) {
        int len = icecream.length;

        for (int i = 0; i < len - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < len - i - 1; j++) {
                if (icecream[j].quantity < icecream[j + 1].quantity) {
                    IceCreamFlavor temp = icecream[j];
                    icecream[j] = icecream[j + 1];
                    icecream[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }


    public void displayItems(IceCreamFlavor[] icecream) {
    	System.out.println();
        for (IceCreamFlavor flavor : icecream) {
            System.out.println("Flavor: " + flavor.name + " | Quantity: " + flavor.quantity);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        IceCreamFlavor[] iceCreams = {
            new IceCreamFlavor("Vanilla", 16),
            new IceCreamFlavor("Chocolate", 32),
            new IceCreamFlavor("Strawberry", 12),
            new IceCreamFlavor("Cookies and Cream", 10),
            new IceCreamFlavor("Gelato", 21),
            new IceCreamFlavor("Mint Chocolate Chip", 19),
            new IceCreamFlavor("Kulfi", 25),
            new IceCreamFlavor("Sorbet", 28),
        };
        
        

        Operation op = new Operation();
        
        System.out.println("Before Sorting ");
        op.displayItems(iceCreams);
        
        op.bubbleSort(iceCreams);
        
        System.out.println("After Sorting ");
        op.displayItems(iceCreams);
    }
}

