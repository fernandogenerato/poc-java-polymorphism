package com.polimorfismo.model;

public class Customer extends AbstractPeople {

    @Override
    public String getBalance() {
        return "{account money=$" + getAccount().getMoney() + "}";
    }

}
