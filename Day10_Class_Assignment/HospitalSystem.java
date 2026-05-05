package Day10_Class_Assignment;
import java.util.TreeSet;
class Patient implements Comparable<Patient> {
    int id;
    String name;
    int age;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Patient p) {
        if (this.id == p.id) {
            return 0;   // duplicate
        } else if (this.id > p.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Patient name:" + name + " age:" + age + " id:" + id;
    }
}

public class HospitalSystem {

    public static void main(String[] args) {
        TreeSet<Patient> patients = new TreeSet<>();
        addPatient(patients, new Patient(101, "Rahul", 25));
        addPatient(patients, new Patient(102, "Amit", 30));
        addPatient(patients, new Patient(101, "Duplicate", 40)); // duplicate
        System.out.println("\nList of unique registered patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
    public static void addPatient(TreeSet<Patient> patients, Patient p) {
        if (!patients.add(p)) {
            System.out.println("Already registered (ID: " + p.id + ")");
        } else {
            System.out.println("Patient added (ID: " + p.id + ")");
        }
    }
}