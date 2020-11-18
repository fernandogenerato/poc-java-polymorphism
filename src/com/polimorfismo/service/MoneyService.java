package com.polimorfismo.service;

import com.polimorfismo.model.Account;
/**
 * @author Fernando G.
 * @version 0.1
 */
public interface MoneyService {

    /**
     * method used to transfer money between accounts
     *
     * @param origin
     * @param destiny
     * @param value
     */
    void moneyTransfer(Account origin, Account destiny, double value);
}
