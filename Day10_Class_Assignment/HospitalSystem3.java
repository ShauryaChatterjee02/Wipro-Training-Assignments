package Day10_Class_Assignment;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class PatientRecordSystem {
    int id;
    String name;
    int age;

    PatientRecordSystem(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class HospitalSystem3 {

    public static void main(String[] args) {

        TreeMap<Integer, Patient> patients = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. Retrieve Patient");
            System.out.println("4. Remove Patient");
            System.out.println("5. List All Patients (Sorted by ID)");
            System.out.println("6. Check Patient Exists");
            System.out.println("7. Count Patients");
            System.out.println("8. Clear System");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                if (patients.containsKey(id)) {
                    System.out.println("Patient already exists!");
                } else {
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    patients.put(id, new Patient(id, name, age));
                    System.out.println("Patient added successfully.");
                }
            }

            else if (choice == 2) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();

                if (!patients.containsKey(id)) {
                    System.out.println("Patient not found!");
                } else {
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new Age: ");
                    int age = sc.nextInt();

                    patients.put(id, new Patient(id, name, age));
                    System.out.println("Patient updated.");
                }
            }

            else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                if (patients.containsKey(id)) {
                    System.out.println(patients.get(id));
                } else {
                    System.out.println("Patient not found!");
                }
            }

            else if (choice == 4) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                if (patients.remove(id) != null) {
                    System.out.println("Patient removed.");
                } else {
                    System.out.println("Patient not found!");
                }
            }

            else if (choice == 5) {
                if (patients.isEmpty()) {
                    System.out.println("No patients available.");
                } else {
                    for (Map.Entry<Integer, Patient> entry : patients.entrySet()) {
                        System.out.println(entry.getValue());
                    }
                }
            }

            else if (choice == 6) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                if (patients.containsKey(id)) {
                    System.out.println("Patient exists.");
                } else {
                    System.out.println("Patient does not exist.");
                }
            }

            else if (choice == 7) {
                System.out.println("Total Patients: " + patients.size());
            }

            else if (choice == 8) {
                patients.clear();
                System.out.println("All records cleared.");
            }

            else if (choice == 9) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}