package Day5_Class_Assignment;

public interface Payment {
void pay(double payment);
default void paymentStatus() {
	System.out.println("You payment is successful.");
}
}
