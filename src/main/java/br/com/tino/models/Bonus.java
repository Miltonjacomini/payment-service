package br.com.tino.models;

public class Bonus {

    private String type;
    private String name;
    private Double discount;

    public Bonus(String type, String name, Double discount) {
        this.type = type;
        this.name = name;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }
}
