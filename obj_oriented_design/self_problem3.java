package obj_oriented_design;

import java.util.ArrayList;

class Patient {
 String name;
 ArrayList<Doctor> doctors; 

 Patient(String name) {
     this.name = name;
     this.doctors = new ArrayList<>();
 }

 void addDoctor(Doctor doctor) {
     if (!doctors.contains(doctor)) {
         doctors.add(doctor);
     }
 }

 void viewDoctors() {
     System.out.println("Patient " + name + " has consulted:");
     for (Doctor d : doctors) {
         System.out.println(" - Dr. " + d.name + " (" + d.specialization + ")");
     }
     System.out.println();
 }
}

class Doctor {
 String name;
 String specialization;
 ArrayList<Patient> patients; 

 Doctor(String name, String specialization) {
     this.name = name;
     this.specialization = specialization;
     this.patients = new ArrayList<>();
 }


 void consult(Patient patient) {
     System.out.println("Dr. " + name + " is consulting patient " + patient.name);

     if (!patients.contains(patient)) {
         patients.add(patient);
     }
     patient.addDoctor(this); 
 }

 void viewPatients() {
     System.out.println("Dr. " + name + " has consulted:");
     for (Patient p : patients) {
         System.out.println(" - " + p.name);
     }
     System.out.println();
 }
}

class Hospital {
 String hospitalName;
 ArrayList<Doctor> doctors;
 ArrayList<Patient> patients;

 Hospital(String hospitalName) {
     this.hospitalName = hospitalName;
     this.doctors = new ArrayList<>();
     this.patients = new ArrayList<>();
 }

 void addDoctor(Doctor doctor) {
     doctors.add(doctor);
 }

 void addPatient(Patient patient) {
     patients.add(patient);
 }

 void showHospital() {
     System.out.println("Hospital: " + hospitalName);
     System.out.println(" Doctors:");
     for (Doctor d : doctors) {
         System.out.println(" - " + d.name + " (" + d.specialization + ")");
     }
     System.out.println(" Patients:");
     for (Patient p : patients) {
         System.out.println(" - " + p.name);
     }
     System.out.println();
 }
}
public class self_problem3 {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Alice", "Cardiology");
        Doctor d2 = new Doctor("Bob", "Neurology");

        Patient p1 = new Patient("Charlie");
        Patient p2 = new Patient("Diana");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showHospital();

        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);

        d1.viewPatients();
        d2.viewPatients();

        p1.viewDoctors();
        p2.viewDoctors();

	}

}
