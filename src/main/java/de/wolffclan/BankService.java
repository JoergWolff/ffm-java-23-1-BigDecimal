package de.wolffclan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankService {
    List<Account> accountList =new ArrayList<>();
    public Account newAccount(Client client){
        String accountNumber = generateAccountNumber();
        //accountList.add(new Account(accountNumber, new BigDecimal("0.00"), client));
        accountList.add(new Account(accountNumber, new BigDecimal("0.00"), client));
        return new Account(accountNumber, new BigDecimal("0.00"),client);
    }

    public void transfer(String from, BigDecimal amount, String to) {
        boolean existFrom = false;
        boolean existTo = false;
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(from)) {
                existFrom = true;
            }
            if (account.getAccountNumber().equals(to)) {
                existTo = true;
            }
        }
        if (existTo && existFrom) {
            for (Account account : accountList) {
                if (account.getAccountNumber().equals(to)) {
                    account.addToAccountBalance(amount);
                }
                if (account.getAccountNumber().equals(from)) {
                    account.subtractFromAccountBalance(amount);
                }
            }
        }
        if(existTo){
            for(Account account: accountList){
                if (account.getAccountNumber().equals(to)) {
                    account.addToAccountBalance(amount);
                }
            }
        }
    }

    private String generateAccountNumber(){
        return String.valueOf((int)(Math.random()*100000000));
    }
    public String generateClientNumber(){
        int a1 = (int)(Math.random()*999);
        int a2 = (int)(Math.random()*999);
        int a3 = (int)(Math.random()*999);
        return (a1) + "-" + (a2) + "-" + (a3);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankService that = (BankService) o;
        return Objects.equals(accountList, that.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountList);
    }

    @Override
    public String toString() {
        return "BankService{\n" +
                "AccountList=" + accountList +
                '}';
    }
}
