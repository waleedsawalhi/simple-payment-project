package org.example.service;

import org.example.entity.Order;

public class MasterCardService extends PaymentService {
    @Override
    public void pay(Order order) {
        super.paymentInfoValidity(order.getPaymentInformation());
        System.out.println("You've purchased the order with MASTERCARD card.");
        //imagine you're hitting Mastercard apis right here.
        mastercardOrders.add(order);
        orders.add(order);
    }
}
