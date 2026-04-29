package Day5_Class_Assignment;

public class UPIPayment implements Payment{
String upiID;
public UPIPayment(String upiID) {
	this.upiID = upiID;
}
public void pay(double amount) {
	System.out.println("Paid " + amount + " using UPI: " + upiID);
}
}
