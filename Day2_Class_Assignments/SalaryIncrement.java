package Day2_Class_Assignments;

public class SalaryIncrement {
public static void main(String[] args) {
	int employees = 4;
	int i=1;
	while(i<=employees) {
		double salary;
		if(i==1) {
			salary=30000;
		}else if(i==2) {
			salary=40000;
		}else {
			salary=50000;
		}
		salary = salary+(salary*0.10);
		System.out.println("Updated salary of employee " + i + ": " +salary);
		i++;
	}
}
}
