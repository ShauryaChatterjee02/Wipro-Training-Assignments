package Day2_Class_Assignments;

public class ShoppingDiscount {
public static void main(String[] args) {
	double amount = 5000;
	double discount = 0;
	if(amount>=7000) {
		discount = 0.30*amount; //30% Discount
	}else if (amount >= 4000) {
        discount = 0.10*amount; //10% Discount 
    }else {
        discount = 0;
    }
	double finalAmount = amount - discount;
	System.out.println("The purchase Amount: " + amount);
    System.out.println("The discount: " + discount);
    System.out.println("Final Amount: " + finalAmount);
}
}
