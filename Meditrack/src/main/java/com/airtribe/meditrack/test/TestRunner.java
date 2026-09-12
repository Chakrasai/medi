package com.airtribe.meditrack.test;

import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.entity.Bill;
import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.entity.Person;
import com.airtribe.meditrack.interfaces.Payable;

// manual test harness, no JUnit - each teammate should add tests here
// for the piece they own once it's implemented
public class TestRunner {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        testInheritanceAndPolymorphism();
        testDoctorEntity();
        testPatientEntity();
        testBillPolymorphism();

        System.out.println("\n=== Test Summary ===");
        System.out.println("Passed: " + passed + " | Failed: " + failed);
    }

    private static void testInheritanceAndPolymorphism() {
        Person doctor = new Doctor("D001", "Dr. Rao", 45, "Male", "9000000001", "Cardiology");
        Person patient = new Patient("P001", "Anita", 32, "Female", "9000000002", "None");

        assertTrue("Doctor inherits from Person", doctor instanceof Person);
        assertTrue("Patient inherits from Person", patient instanceof Person);
        assertTrue("Doctor uses polymorphic getRole", "Doctor".equals(doctor.getRole()));
        assertTrue("Patient uses polymorphic getRole", "Patient".equals(patient.getRole()));
    }

    private static void testDoctorEntity() {
        Doctor doctor = new Doctor("D002", "Dr. Mehta", 50, "Male", "9000000003", "Neurology");

        assertTrue("Doctor stores inherited id", "D002".equals(doctor.getId()));
        assertTrue("Doctor stores inherited name", "Dr. Mehta".equals(doctor.getName()));
        assertTrue("Doctor stores specialization", "Neurology".equals(doctor.getSpecialization()));
        assertTrue("Doctor formats inherited toString", "D002 - Dr. Mehta".equals(doctor.toString()));
    }

    private static void testPatientEntity() {
        Patient patient = new Patient("P002", "Rahul", 28, "Male", "9000000004", "Asthma");

        assertTrue("Patient stores inherited id", "P002".equals(patient.getId()));
        assertTrue("Patient stores inherited name", "Rahul".equals(patient.getName()));
        assertTrue("Patient stores medical history", "Asthma".equals(patient.getMedicalHistory()));
        assertTrue("Patient formats inherited toString", "P002 - Rahul".equals(patient.toString()));
    }

    private static void testBillPolymorphism() {
        Payable payable = new Bill("B001", "A001", 1500.0);

        assertTrue("Bill implements Payable", payable instanceof Bill);
        assertTrue("Payable reference calls Bill getAmount", payable.getAmount() == 1500.0);
        assertTrue("New bill is unpaid", !payable.isPaid());
    }

    private static void assertTrue(String testName, boolean condition) {
        if (condition) {
            System.out.println("[PASS] " + testName);
            passed++;
        } else {
            System.out.println("[FAIL] " + testName);
            failed++;
        }
    }
}
