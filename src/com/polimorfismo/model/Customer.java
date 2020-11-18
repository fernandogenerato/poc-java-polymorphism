package com.polimorfismo.model;

/**
 * @author Fernando G.
 * @version 0.1
 */
public class Customer extends AbstractPeople {

    @Override
    public String getBalance() {
        return "{account money=$" + getAccount().getMoney() + "}";
    }

}
