package com.airtribe.meditrack.entity;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private static final long serialVersionUID = 1L;

    private String medicalHistory;
    private List<String> appointmentIds;

    public Patient(String id, String name, int age, String gender, String contactNumber, String medicalHistory) {
        super(id, name, age, gender, contactNumber);
        this.medicalHistory = medicalHistory;
        this.appointmentIds = new ArrayList<>();
    }

    public String getMedicalHistory() { return medicalHistory; }
    public void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }
    public List<String> getAppointmentIds() { return appointmentIds; }

    public void addAppointmentId(String id) {
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
