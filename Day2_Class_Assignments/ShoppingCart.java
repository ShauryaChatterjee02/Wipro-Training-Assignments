package Day2_Class_Assignments;
import java.util.Scanner;
public class ShoppingCart {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double total = 0;
	double price;
	System.out.println("Enter item prices:");
	while(true) {
		price = sc.nextDouble();
		if(price==0) {
			break;
		}
		total = total + price;
	}
	System.out.println(total);
	sc.close();
}
}
