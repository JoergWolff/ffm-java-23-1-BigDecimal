package de.wolffclan;

public class Main {
    public static void main(String[] args) {

        BankService bank = new BankService();
        Client client1 = new Client("Horst", "Reiter", bank.generateClientNumber());
        Client client2 = new Client("Lisel", "Reiter", bank.generateClientNumber());
        Client client3 = new Client("Rudi", "Rüssel", bank.generateClientNumber());
        Client client4 = new Client("Bernd", "Hugel", bank.generateClientNumber());
        Account client1Account = bank.newAccount(client1);
        System.out.println(client1Account);
        Account client2Account = bank.newAccount(client2);
        System.out.println(client2Account);
        Account client3Account = bank.newAccount(client3);
        System.out.println(client3Account);
        Account client4Account = bank.newAccount(client4);
        System.out.println(client4Account);
        System.out.println(bank);
    }
}