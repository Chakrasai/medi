package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.exception.InvalidDataException;
import com.airtribe.meditrack.interfaces.Searchable;
import com.airtribe.meditrack.util.DataStore;

import java.util.List;

public class PatientService implements Searchable<Patient> {
    private final DataStore<Patient> patientStore = new DataStore<>(Patient::getId);

    public Patient addPatient(String name, int age, String gender, String contact, String medicalHistory) throws InvalidDataException {
        return null;
    }

    public boolean removePatient(String id) {
        return false;
    }

    public List<Patient> getAllPatients() {
        return null;
    }

    public Patient getPatientById(String id) {
        return null;
    }

    @Override
    public List<Patient> search(String keyword) {
        return null;
    }
}
