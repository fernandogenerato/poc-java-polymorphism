package com.polimorfismo.service.Impl;

import com.polimorfismo.model.Account;
import com.polimorfismo.service.MoneyService;

public class MoneyServiceImpl implements MoneyService {

    @Override
    public void moneyTransfer(Account origin, Account destiny, double value) {
        if (origin.getMoney() > value) {
            origin.debitMoney(value);
            destiny.setMoney(value);
            System.out.println("\nTransaction has been completed with success\n");

        } else {
            System.out.println("\nInsufficient Money to complete transaction\n");
        }
    }
}
