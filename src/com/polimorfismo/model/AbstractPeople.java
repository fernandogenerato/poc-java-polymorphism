package com.polimorfismo.model;

import java.util.Map;
/**
 * @author Fernando G.
 * @version 0.1
 */
public abstract class AbstractPeople {

    private int age;
    private String Name;
    private Map<String, String> Documents;
    private Account account = new Account();

    public abstract String getBalance();

    @Override
    public String toString() {
        return "\n{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                ", Documents=" + Documents +
                ", account=" + account +
                '}';
    }

    public Account getAccount() {
        return account;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Map<String, String> getDocuments() {
        return Documents;
    }

    public void setDocuments(Map<String, String> documents) {
        Documents = documents;
    }
}
