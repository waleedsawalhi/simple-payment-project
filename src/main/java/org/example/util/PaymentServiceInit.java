package org.example.util;

import org.example.entity.PaymentMethod;
import org.example.service.MasterCardService;
import org.example.service.PaymentService;
import org.example.service.VisaService;

public class PaymentServiceInit {

    public static PaymentService init(final PaymentMethod paymentMethod) {
        switch (paymentMethod) {
            case VISA: return new VisaService();
            case MASTERCARD: return new MasterCardService();
            default: throw new IllegalStateException("This payment method isn't supported");
        }
    }
}
