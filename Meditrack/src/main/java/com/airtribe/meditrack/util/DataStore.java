package com.airtribe.meditrack.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

// generic in-memory store, reused by DoctorService/PatientService/AppointmentService
// so we're not writing the same CRUD code three times
public class DataStore<T> {
    private final Map<String, T> store = new LinkedHashMap<>();
    private final Function<T, String> idExtractor;

    public DataStore(Function<T, String> idExtractor) {
        this.idExtractor = idExtractor;
    }

    public void add(T item) {
    }

    public Optional<T> getById(String id) {
        return Optional.empty();
    }

    public boolean remove(String id) {
        return false;
    }

    public List<T> getAll() {
        return null;
    }

    public boolean exists(String id) {
        return false;
    }

    public int count() {
        return 0;
    }

    public List<T> filter(Predicate<T> predicate) {
        return null;
    }
}
