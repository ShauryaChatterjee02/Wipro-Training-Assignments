package Day9_Class_Assignment;
import java.util.LinkedList;
import java.util.Scanner;
class PatientData {
    String name;
    int age;

    PatientData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class HospitalQueue {

    LinkedList<PatientData> list = new LinkedList<>();

    public void addPatient(String name, int age) {
        list.add(new PatientData(name, age));
        System.out.println("Patient added.");
    }

    public void addEmergencyPatient(String name, int age) {
        list.add(0, new PatientData(name, age));
        System.out.println("Emergency patient added.");
    }

    public void removePatient() {
        if (list.isEmpty()) {
            System.out.println("No patients in queue.");
        } else {
        	PatientData p = list.remove(0);
            System.out.println(p.name + " (Age: " + p.age + ") treated.");
        }
    }

    public void viewPatients() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Patients:");
            for (PatientData p : list) {
                System.out.println("Name: " + p.name + ", Age: " + p.age);
            }
        }
    }

    public void firstPatient() {
        if (!list.isEmpty()) {
        	PatientData p = list.get(0);
            System.out.println("First: " + p.name + " (Age: " + p.age + ")");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void lastPatient() {
        if (!list.isEmpty()) {
        	PatientData p = list.get(list.size() - 1);
            System.out.println("Last: " + p.name + " (Age: " + p.age + ")");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalQueue hq = new HospitalQueue();
        int choice;

        do {
            System.out.println("\n--- Hospital Queue Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Remove Patient");
            System.out.println("4. View Patients");
            System.out.println("5. Check First Patient");
            System.out.println("6. Check Last Patient");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                hq.addPatient(name, age);
            }
            else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                hq.addEmergencyPatient(name, age);
            }
            else if (choice == 3) {
                hq.removePatient();
            }
            else if (choice == 4) {
                hq.viewPatients();
            }
            else if (choice == 5) {
                hq.firstPatient();
            }
            else if (choice == 6) {
                hq.lastPatient();
            }
            else if (choice == 7) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}