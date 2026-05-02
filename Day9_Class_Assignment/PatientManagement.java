package Day9_Class_Assignment;
import java.util.Scanner;
import java.util.ArrayList;
class Patient{
	String name;
	int age;
	Patient(String name,int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name of the patient:"+name+"\nAge:"+age);
	}
}
public class PatientManagement {
public static void main(String[] args) {
	ArrayList<Patient>list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("\n1.Add Patient:");
		System.out.println("2.View All Patients");
		System.out.println("3.Search Patient by Name");
		System.out.println("4.Exit");
		System.out.println("Enter choice:");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice==1) {
			System.out.println("Please enter patient name:");
			String name = sc.nextLine();
			
			System.out.println("Please enter age of the patient:");
			int age = sc.nextInt();
			
			list.add(new Patient(name,age));
			System.out.println("Patient added successfully..");
		}else if(choice==2) {
			if(list.isEmpty()) {
				System.out.println("No patient added yet.");
			}else {
				System.out.println("\nPatient List:");
                for (Patient p : list) {
                    p.display();
                }
			}
		}else if(choice==3) {
			System.out.print("Enter name to search: ");
			String search = sc.nextLine();
			boolean found = false;
			for (Patient p : list) {
                if (p.name.equalsIgnoreCase(search)) {
                    p.display();
                    found = true;
                }
            }
			if(!found) {
				System.out.print("Patient not found.");
			}

		}else if(choice==4) {
			System.out.println("Exiting...");
			sc.close();
			break;
		}
		else {
            System.out.println("Invalid choice! Please Try again.");
		}
	}
}
}
