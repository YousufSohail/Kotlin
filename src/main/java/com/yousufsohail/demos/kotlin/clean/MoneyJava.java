package com.yousufsohail.demos.kotlin.clean;

public class MoneyJava {

    public MoneyJava(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    private int amount;
    private String currency;

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "MoneyJava{" +
                "amount=" + amount +
                ", currency=" + currency +
                "}";
    }
}
