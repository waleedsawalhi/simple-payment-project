package org.example.util;

import org.example.entity.PaymentExpireDate;
import org.example.entity.PaymentInformation;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class CardsUtil {

    public static void checkCardValidity(final PaymentInformation paymentInformation) {
        //check card number validity
        checkCardNumberLength(paymentInformation.getCardNumber() + "");

        //check card expiration date
        checkDateValidity(paymentInformation.getExpireDate());
    }


    private static void checkDateValidity(final PaymentExpireDate paymentExpireDate) {
        final LocalDate now = LocalDate.now();
        final LocalDate date = LocalDate.of(paymentExpireDate.getYear(), paymentExpireDate.getMonth(), 1);
        if (date.isBefore(now)) {
            System.out.println("This Card is expired.");
        }
    }

    private static void checkCardNumberLength(final String cardNumber) {
        if (cardNumber.length() != 16) {
            throw new IllegalStateException("Card Number isn't valid.");
        }
    }


}
