package org.example.entity;

import java.util.List;


public class Order {
    private int id;
    private List<Item> items;
    private PaymentMethod paymentMethod;
    private PaymentInformation paymentInformation;

    public Order() {}

    public Order(final int id,
                 final List<Item> items,
                 final PaymentMethod paymentMethod,
                 final PaymentInformation paymentInformation) {
        this.id = id;
        this.items = items;
        this.paymentMethod = paymentMethod;
        this.paymentInformation = paymentInformation;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setItems(final List<Item> items) {
        this.items = items;
    }

    public void setPaymentMethod(final PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return this.id;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items=" + items +
                ", paymentMethod=" + paymentMethod +
                ", paymentInformation=" + paymentInformation +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }

    public int getTotalPrice() {
        int result = 0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }

    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(final PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
}
