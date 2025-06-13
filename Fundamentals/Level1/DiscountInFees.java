package Fundamentals.Level1;


class DiscountInFees{
	public static void main (String [] args){
		//Create a variables to store charge fee of the course and discount percentage
		int fee = 125000 ;
		int discountPercent = 10 ;
		
		//Compute discount and assign it to discount variable and fee to pay
		int discount =  (fee*discountPercent)/100;
		int feeToPayAfterDiscount = fee - discount;
		
		//Display the discount and final fee to pay
		System.out.println("The discount amount is INR "+discount+
			" and final discounted fee is INR "+ feeToPayAfterDiscount);
	}
}	
