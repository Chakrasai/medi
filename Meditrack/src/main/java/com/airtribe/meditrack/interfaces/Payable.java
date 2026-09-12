package com.airtribe.meditrack.interfaces;

public interface Payable {
    double getAmount();
    void pay(double amount);
    boolean isPaid();
}
