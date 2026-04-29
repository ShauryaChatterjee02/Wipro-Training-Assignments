package Day2_Class_Assignments;

public class ATM_Withdrawl {
public static void main(String[] args) {
	double balance = 20000;
	double amount = 3000;
	if(amount<balance) {
		balance = balance-amount;
		System.out.println("Withdrawn Successfully");
		System.out.println("Remaining Balance:"+balance);
	}
	else {
        System.out.println("Insufficient Balance");
    }
}
}
