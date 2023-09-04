package de.wolffclan;

import java.math.BigDecimal;

public class BankService {

    public Account newAccount(Client client){
        String accountNumber = createAccountNumber();
        return new Account(accountNumber, new BigDecimal("0.00"),client);
    }

    private String createAccountNumber(){
        String a = "";
        int a1 = (int)(Math.random()*999);
        int a2 = (int)(Math.random()*999);
        int a3 = (int)(Math.random()*999);
        a = String.valueOf(a1) + "-" + String.valueOf(a2) + "-" + String.valueOf(a3);
        return a;

    }
}
