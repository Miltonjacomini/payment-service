package br.com.tino.service;

import java.security.InvalidParameterException;

import br.com.tino.models.Payment;

public class PaymentProcessor {

    public static Payment execute(Payment payment) {

        switch (payment.getType()) {
            case CREDICARD:
                return PaymentTypeExecutor.CREDICARD.execute(payment);
            case PIX:
                return PaymentTypeExecutor.PIX.execute(payment);
        }

        throw new InvalidParameterException("Invalid payment method");
    }
}
