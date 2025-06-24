public class ShoppingCart {
    // class for cart item
    public static class CartItem {
    
        // Attributes
        String itemName[] ;
        int price[];
        int quantity[];

        public CartItem(String itemName[], int price[], int quantity[]){
            this.itemName = itemName;
            this.price=price;
            this.quantity=quantity;
        }

        public void totalPrice() {
            int total = 0;
            for(int i=0;i<price.length;i++){
                total += price[i]*quantity[i];
            }
            System.out.println("The total price of the items is "+ total );
        }

       
        
    }
     public static void main(String[] args) {
        String[] itemname = {"Bag","Laptop"};
        int[] price = {600, 54000};
        int[] quantity = {2,1};

        CartItem cartitem = new CartItem(itemname, price,quantity);
        cartitem.totalPrice();

    }
}
