package org.example.util;

import org.example.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderGenerator {
    private static int orderId = 1;
    private static int itemId = 1;
    private static final Scanner scanner = new Scanner(System.in);

    public static Order placeOrder() {
        final Order order = new Order();
        final PaymentInformation paymentInformation = new PaymentInformation();
        final PaymentExpireDate date = new PaymentExpireDate();
        final List<Item> items = new ArrayList<>();

        paymentInformation.setExpireDate(date);
        order.setPaymentInformation(paymentInformation);

        order.setId(orderId++);
        System.out.println("Enter you're Payment Method(VISA, MASTERCARD):");
        order.setPaymentMethod(PaymentMethod.valueOf(scanner.next()));
        System.out.println("Enter you're card number:");
        paymentInformation.setCardNumber(scanner.nextLong());
        System.out.println("Enter you're cvv:");
        paymentInformation.setCvv(scanner.nextShort());
        System.out.println("Enter you're name:");
        paymentInformation.setCardHolderName(scanner.next());
        System.out.println("Enter You're expire Date (mm/yyyy)");
        date.setMonth(scanner.nextByte());
        date.setYear(scanner.nextShort());

        String value = "Add";
        while (!value.equals("Done")) {
            final Item item = new Item();
            item.setId(itemId++);
            System.out.println("Enter Item name");
            item.setName(scanner.next());
            System.out.println("Enter Item Price");
            item.setPrice(scanner.nextInt());
            items.add(item);
            System.out.println("Enter one of those choices: \n1-Add\n2-Done");
            value = scanner.next();
        }
        PaymentServiceInit.init(order.getPaymentMethod()).pay(order);
        System.out.println("This is your items" + items);
        return order;
    }
}
