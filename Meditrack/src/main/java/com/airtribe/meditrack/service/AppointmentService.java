package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Appointment;
import com.airtribe.meditrack.entity.Bill;
import com.airtribe.meditrack.exception.AppointmentNotFoundException;
import com.airtribe.meditrack.exception.InvalidDataException;
import com.airtribe.meditrack.interfaces.Searchable;
import com.airtribe.meditrack.util.DataStore;

import java.time.LocalDateTime;
import java.util.List;

public class AppointmentService implements Searchable<Appointment> {
    private final DataStore<Appointment> appointmentStore = new DataStore<>(Appointment::getId);
    private final DataStore<Bill> billStore = new DataStore<>(Bill::getBillId);

    private final DoctorService doctorService;
    private final PatientService patientService;

    public AppointmentService(DoctorService doctorService, PatientService patientService) {
        this.doctorService = doctorService;
        this.patientService = patientService;
    }

    public Appointment bookAppointment(String patientId, String doctorId, LocalDateTime dateTime, String reason) throws InvalidDataException {
        return null;
    }

    public void cancelAppointment(String id) throws AppointmentNotFoundException {
    }

    public Bill generateBill(String appointmentId, double amount) throws AppointmentNotFoundException {
        return null;
    }

    public List<Appointment> getAllAppointments() {
        return null;
    }

    public List<Bill> getAllBills() {
        return null;
    }

    public List<Appointment> getAppointmentsForDoctor(String doctorId) {
        return null;
    }

    public List<Appointment> getAppointmentsForPatient(String patientId) {
        return null;
    }

    @Override
    public List<Appointment> search(String keyword) {
        return null;
    }
}
