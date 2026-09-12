package com.airtribe.meditrack.entity;

public final class BillSummary {
    private final String billId;
    private final String patientName;
    private final double totalAmount;
    private final boolean paid;

    public BillSummary(String billId, String patientName, double totalAmount, boolean paid) {
        this.billId = billId;
        this.patientName = patientName;
        this.totalAmount = totalAmount;
        this.paid = paid;
    }

    public String getBillId() { return billId; }
    public String getPatientName() { return patientName; }
    public double getTotalAmount() { return totalAmount; }
    public boolean isPaid() { return paid; }

    @Override
    public String toString() {
        return billId + " - " + patientName + " - " + totalAmount;
    }
}
