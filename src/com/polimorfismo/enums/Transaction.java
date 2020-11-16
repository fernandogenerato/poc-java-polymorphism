package com.polimorfismo.enums;

public enum Transaction {

    OK("Transaction has been completed with success"),
    ERROR("Insufficient Money to complete transaction");

    private String message;

    public String getValue() {
        return this.message;
    }

    Transaction(String message) {
        this.message = message;
    }
}
