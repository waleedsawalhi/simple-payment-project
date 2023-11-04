package org.example.util;

import org.example.entity.PaymentExpireDate;
import org.example.entity.PaymentInformation;

import java.util.Random;

public class CardGeneratorUtil {

    public static PaymentInformation generateCard() {
        PaymentInformation paymentInformation = new PaymentInformation();
        paymentInformation.setCardNumber(generateCardNumber());
        paymentInformation.setCvv(generateCvvNumber());
        paymentInformation.setCardHolderName("Mohammad Abu");
        PaymentExpireDate date = new PaymentExpireDate();
        date.setMonth(generateMonthForExpireDate());
        date.setYear(generateYearForExpireDate());
        paymentInformation.setExpireDate(date);
        return paymentInformation;
    }

    private static short generateCvvNumber() {
        Random random = new Random();
        // Generate a random year between 2018 and 2026
        int min = 100;
        int max = 999;
        return (short) (random.nextInt(max - min + 1) + min);
    }

    private static long generateCardNumber() {
        Random random = new Random();
        long min = 1000000000000000L;
        long max = 9999999999999999L;

        return min + ((long) (random.nextDouble() * (max - min + 1)));
    }

    private static byte generateMonthForExpireDate() {
        Random random = new Random();
        return (byte) (random.nextInt(12) + 1);
    }

    private static short generateYearForExpireDate() {
        // Create a Random object
        Random random = new Random();
        // Generate a random year between 2018 and 2026
        int minYear = 2018;
        int maxYear = 2030;
        return (short) (random.nextInt(maxYear - minYear + 1) + minYear);
    }
}
