package br.com.tino.models;

import java.util.List;

public class Payment {

    private String userId;
    private Double price;
    private PaymentType paymentType;
    private List<Bonus> bonus;

    public Payment(String userId, Double price, PaymentType paymentType, List<Bonus> bonus) {
        this.userId = userId;
        this.price = price;
        this.paymentType = paymentType;
        this.bonus = bonus;
    }

    public String getUserId() {
        return this.userId;
    }

    public Double getPrice() {
        return price;
    }

    public PaymentType getType() {
        return paymentType;
    }

    public List<Bonus> getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "userId='" + userId + '\'' +
                ", price=" + price +
                ", paymentType=" + paymentType +
                ", bonus=" + bonus.stream().toString() +
                '}';
    }
}


