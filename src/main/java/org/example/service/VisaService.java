package org.example.service;

import org.example.entity.Order;

public class VisaService extends PaymentService {

    @Override
    public void pay(Order order) {
        super.paymentInfoValidity(order.getPaymentInformation());
        System.out.println("You've purchased the order with VISA card.");
        // Imagine you're hitting VISA apis right here.
        visaOrders.add(order);
        orders.add(order);
    }
}
