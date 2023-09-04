package de.wolffclan;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Set<Client> clients = new HashSet<>();

    public Account() {
    }

    public Account(String accountNumber, BigDecimal accountBalance, Set<Client> clients) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.clients = clients;
    }

    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.clients.add(client);
    }

    public void addToAccountBalance(BigDecimal money){
        this.setAccountBalance(this.accountBalance.add(money));
    }

    public void subtractFromAccountBalance(BigDecimal money) {
        this.setAccountBalance(this.accountBalance.subtract(money));
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", client=" + clients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountBalance, account.accountBalance) && Objects.equals(clients, account.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, clients);
    }
}
