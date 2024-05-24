package com.echeverri.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
