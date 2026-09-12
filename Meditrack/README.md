# MediTrack — Clinic & Appointment Management System

## Project Structure

src/main/java/com/airtribe/meditrack/
├── Main.java
├── constants/Constants.java
├── entity/
│   ├── Person.java          (abstract)
│   ├── Doctor.java
│   ├── Patient.java
│   ├── Appointment.java
│   ├── Bill.java
│   └── BillSummary.java     (immutable)
├── service/
│   ├── DoctorService.java
│   ├── PatientService.java
│   └── AppointmentService.java
├── util/
│   ├── Validator.java
│   ├── DateUtil.java
│   ├── CSVUtil.java
│   ├── IdGenerator.java
│   ├── DataStore.java       (generic)
│   └── AIHelper.java        (optional)
├── exception/
│   ├── AppointmentNotFoundException.java
│   └── InvalidDataException.java
├── interfaces/               (was "interface" in the brief, but that's a
│   │                          reserved keyword in Java, so renamed)
│   ├── Searchable.java
│   └── Payable.java
└── test/
    └── TestRunner.java
docs/
├── JVM_Report.md
├── Setup_Instructions.md
└── Design_Decisions.md
