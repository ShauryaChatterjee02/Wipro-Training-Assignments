package Day1_Class_Assignments;

public class Salary_Calculator {
public static void main(String[] args) {
	int basics = 60000;
	int bonus = 3000;
	int tax = 7000;
	int net_salary = basics+bonus-tax;
	System.out.println("The Net Salary:"+net_salary);
}
}
