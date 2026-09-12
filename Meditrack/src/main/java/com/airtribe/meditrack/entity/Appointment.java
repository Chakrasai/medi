package com.airtribe.meditrack.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Appointment implements Serializable {
    private static final long serialVersionUID = 1L;

    public enum Status { SCHEDULED, COMPLETED, CANCELLED }

    private String id;
    private String patientId;
    private String doctorId;
    private LocalDateTime dateTime;
    private Status status;
    private String reason;

    public Appointment(String id, String patientId, String doctorId, LocalDateTime dateTime, String reason) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
        this.reason = reason;
        this.status = Status.SCHEDULED;
    }

    public String getId() { return id; }
    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public LocalDateTime getDateTime() { return dateTime; }
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public String getReason() { return reason; }

    @Override
    public String toString() {
        return id + " " + status; 
    }
}
