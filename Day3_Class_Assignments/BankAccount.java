package Day3_Class_Assignments;

public class BankAccount {
private double balance;
public double getbalance() {
	return balance;
}
public void deposit(double amount) {
	if(amount>0) {
		balance+=amount;
		System.out.println("The amount deposited:"+amount);
	}else {
		System.out.println("Invalid");
	}
}
public void withdraw(double amount) {
	if(amount > 0 && amount <= balance) {
		balance-=amount;
		System.out.println("The amount withdrawn:"+amount);
	}else {
		System.out.println("Withdrawl Fail");
	}
}
public static void main(String[] args) {
	BankAccount account = new BankAccount();
	account.deposit(3000);
	account.withdraw(1000);
	System.out.print("Remaining Balance:"+account.getbalance());
}
}
