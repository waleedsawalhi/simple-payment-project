package org.example.service;

import org.example.entity.Order;
import org.example.entity.PaymentInformation;
import org.example.util.CardGeneratorUtil;
import org.example.util.CardsUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class PaymentService {
    public static final Map<Long, PaymentInformation> cards = new HashMap<>();
    protected static final List<Order> orders = new ArrayList<>();
    protected static final List<Order> visaOrders = new ArrayList<>();
    protected static final List<Order> mastercardOrders = new ArrayList<>();

    public static void generateCards() {
        for (int i = 0; i < 100; i++) {
            final PaymentInformation card = CardGeneratorUtil.generateCard();
            cards.put(card.getCardNumber(), card);
        }
    }

    public abstract void pay(Order order);


    public void paymentInfoValidity(final PaymentInformation paymentInformation) {
        CardsUtil.checkCardValidity(paymentInformation);
    }
}
