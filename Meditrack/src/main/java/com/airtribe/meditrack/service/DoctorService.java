package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.exception.InvalidDataException;
import com.airtribe.meditrack.interfaces.Searchable;
import com.airtribe.meditrack.util.DataStore;

import java.util.List;

public class DoctorService implements Searchable<Doctor> {
    private final DataStore<Doctor> doctorStore = new DataStore<>(Doctor::getId);

    public Doctor addDoctor(String name, int age, String gender, String contact, String specialization) throws InvalidDataException {
        return null;
    }

    public boolean removeDoctor(String id) {
        return false;
    }

    public List<Doctor> getAllDoctors() {
        return null;
    }

    public Doctor getDoctorById(String id) {
        return null;
    }

    @Override
    public List<Doctor> search(String keyword) {
        return null;
    }

    public List<Doctor> getBySpecialization(String specialization) {
        return null;
    }
}
