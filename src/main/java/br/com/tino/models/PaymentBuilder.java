package br.com.tino.models;

import java.util.ArrayList;
import java.util.List;

public class PaymentBuilder {

    private String userId;
    private Double price;
    private PaymentType paymentType;
    private List<Bonus> bonus = new ArrayList<>();

    public PaymentBuilder user(String userId) {
        this.userId = userId;
        return this;
    }

    public PaymentBuilder price(Double price) {
        this.price = price;
        return this;
    }

    public PaymentBuilder type(PaymentType type) {
        this.paymentType = type;
        return this;
    }

    public PaymentBuilder bonus(List<Bonus> bonus) {
        this.bonus.addAll(bonus);
        return this;
    }

    public Payment build(){
        return new Payment(this.userId, this.price, this.paymentType, this.bonus);
    }
}
