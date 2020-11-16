package com.polimorfismo.model;

import java.util.UUID;

public class Account {

    private int Id;
    private double money;

    public Account() {
        this.Id = UUID.randomUUID().hashCode();
    }

    @Override
    public String toString() {
        return "{" +
                "Id=" + Id +
                ", money=$" + money +
                '}';
    }

    public double setMoney(double money) {
        return this.money += money;
    }

    public double debitMoney(double money) {
        return this.money -= money;
    }

    public int getId() {
        return Id;
    }

    public double getMoney() {
        return money;
    }
}
