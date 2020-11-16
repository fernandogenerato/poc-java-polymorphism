package com.polimorfismo.service;

import com.polimorfismo.model.Account;

public interface MoneyService {

    void moneyTransfer(Account origin, Account destiny, double value);
}
