package org.example;

import org.example.service.PaymentService;

import java.util.Scanner;

import static org.example.service.PaymentService.generateCards;
import static org.example.util.OrderGenerator.placeOrder;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        generateCards();
        String value = "pay";
        while (!value.equals("DONE")) {
            System.out.println("Enter one of those choices:\n1-PAY\n2-CARDS\n3-DONE");
            value = scanner.next();
            switch (value) {
                case "PAY": placeOrder(); break;
                case "CARDS": System.out.println(PaymentService.cards); break;
                default: break;
            }
        }
    }
}