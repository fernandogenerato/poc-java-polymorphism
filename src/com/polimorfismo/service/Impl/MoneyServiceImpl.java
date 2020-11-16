package com.polimorfismo.service.Impl;

import com.polimorfismo.enums.Transaction;
import com.polimorfismo.model.Account;
import com.polimorfismo.service.MoneyService;

public class MoneyServiceImpl implements MoneyService {

    @Override
    public void moneyTransfer(Account origin, Account destiny, double value) {
        if (origin.getMoney() > value) {
            origin.debitMoney(value);
            destiny.setMoney(value);
            System.out.println(Transaction.OK.getValue());
        } else {
            System.out.println(Transaction.ERROR.getValue());
        }
    }
}
