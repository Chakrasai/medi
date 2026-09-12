package com.airtribe.meditrack.entity;

import com.airtribe.meditrack.interfaces.Payable;

import java.io.Serializable;

public class Bill implements Payable, Serializable {
    private static final long serialVersionUID = 1L;

    private String billId;
    private String appointmentId;
    private double totalAmount;
    private double amountPaid;
    private boolean paid;

    public Bill(String billId, String appointmentId, double totalAmount) {
        this.billId = billId;
        this.appointmentId = appointmentId;
        this.totalAmount = totalAmount;
        this.amountPaid = 0;
        this.paid = false;
    }

    public String getBillId() { return billId; }
    public String getAppointmentId() { return appointmentId; }

    @Override
    public double getAmount() {
        return totalAmount;
    }

    @Override
    public void pay(double amount) {
    }

    @Override
    public boolean isPaid() {
        return paid;
    }

    public double getBalance() {
        return 0;
    }

    @Override
    public String toString() {
        return billId + " " + totalAmount;
    }
}
