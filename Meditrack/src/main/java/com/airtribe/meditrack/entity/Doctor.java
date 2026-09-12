package com.airtribe.meditrack.entity;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private static final long serialVersionUID = 1L;

    private String specialization;
    private List<String> availableSlots;

    public Doctor(String id, String name, int age, String gender, String contactNumber, String specialization) {
        super(id, name, age, gender, contactNumber);
        this.specialization = specialization;
        this.availableSlots = new ArrayList<>();
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public List<String> getAvailableSlots() { return availableSlots; }

    public void addSlot(String slot) {
    }

    public boolean removeSlot(String slot) {
        return false;
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
