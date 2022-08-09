package br.com.tino.service;

import br.com.tino.models.Payment;

public enum PaymentTypeExecutor implements PaymentStrategy {

    CREDICARD {

        @Override
        public Payment execute(Payment payment) {

            System.out.println(" -> Credcard implementation of payment");
            Payment paymentResult = this.applyDiscount(payment);

            return paymentResult;
        }
    },
    PIX {

        @Override
        public Payment execute(Payment payment) {

            System.out.println(" -> Pix implementation of payment");
            Payment paymentResult = this.applyDiscount(payment);

            return paymentResult;
        }
    };

}
