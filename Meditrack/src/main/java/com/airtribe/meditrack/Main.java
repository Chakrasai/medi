package com.airtribe.meditrack;

import com.airtribe.meditrack.exception.AppointmentNotFoundException;
import com.airtribe.meditrack.exception.InvalidDataException;
import com.airtribe.meditrack.service.AppointmentService;
import com.airtribe.meditrack.service.DoctorService;
import com.airtribe.meditrack.service.PatientService;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DoctorService doctorService = new DoctorService();
    private static final PatientService patientService = new PatientService();
    private static final AppointmentService appointmentService = new AppointmentService(doctorService, patientService);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            try {
                switch (choice) {
                    case "1": addDoctor(); break;
                    case "2": addPatient(); break;
                    case "3": bookAppointment(); break;
                    case "4": cancelAppointment(); break;
                    case "5": generateBill(); break;
                    case "6": listDoctors(); break;
                    case "7": listPatients(); break;
                    case "8": listAppointments(); break;
                    case "9": searchDoctors(); break;
                    case "0":
                        running = false;
                        System.out.println("Thank you for using Meditrack!");
                        break;
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            } catch (InvalidDataException | AppointmentNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: please enter a proper option.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n===== MediTrack Menu =====");
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        System.out.println("3. Book Appointment");
        System.out.println("4. Cancel Appointment");
        System.out.println("5. Generate Bill");
        System.out.println("6. List All Doctors");
        System.out.println("7. List All Patients");
        System.out.println("8. List Appointments");
        System.out.println("9. Search for Doctors");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addDoctor() throws InvalidDataException {
    }

    private static void addPatient() throws InvalidDataException {
    }

    private static void bookAppointment() throws InvalidDataException {
    }

    private static void cancelAppointment() throws AppointmentNotFoundException {
    }

    private static void generateBill() throws AppointmentNotFoundException {
    }

    private static void listDoctors() {
    }

    private static void listPatients() {
    }

    private static void listAppointments() {
    }

    private static void searchDoctors() {
    }
}
