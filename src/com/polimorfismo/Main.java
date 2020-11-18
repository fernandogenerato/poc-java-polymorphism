package com.polimorfismo;

import com.polimorfismo.service.Impl.MoneyServiceImpl;
import com.polimorfismo.model.Customer;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Fernando G.
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {
/**
 * Implementation example*
 */
        Customer customer1 = new Customer();
        customer1.setAge(27);
        customer1.setName("Fernando");
        customer1.getAccount().setMoney(5000);
        Map<String, String> documents = new HashMap<>();
        documents.put("RG", "123456789");
        documents.put("CPF", "987654321");
        customer1.setDocuments(documents);

        Customer customer2 = new Customer();
        customer2.setAge(27);
        customer2.setName("Generato");
        customer2.getAccount().setMoney(3500);
        Map<String, String> documents2 = new HashMap<>();
        documents2.put("RG", "0000000");
        documents2.put("CPF", "123133");
        customer2.setDocuments(documents2);


        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

        MoneyServiceImpl moneyService = new MoneyServiceImpl();
        moneyService.moneyTransfer(customer1.getAccount(), customer2.getAccount(), 2600);

        System.out.println("Customer 1 " + customer1.getBalance());
        System.out.println("Customer 2 " + customer2.getBalance());

    }
}
