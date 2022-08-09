package br.com.tino.service;

import java.util.concurrent.atomic.AtomicReference;

import br.com.tino.models.Payment;
import br.com.tino.models.PaymentBuilder;

public interface PaymentStrategy {

    Payment execute(Payment payment);

    default Payment applyDiscount(Payment payment) {

        AtomicReference<Double> priceWithDiscount
                = new AtomicReference<>(payment.getPrice());

        payment.getBonus()
               .stream().forEach(bonus -> {

                    System.out.println(String.format(" -> Applying discount: %s - %s", bonus.getType(), bonus.getName()));
                    priceWithDiscount.updateAndGet(v -> v - bonus.getDiscount());

                });

        return new PaymentBuilder().user(payment.getUserId())
                .price(priceWithDiscount.get())
                .bonus(payment.getBonus())
                .build();
    }

}
