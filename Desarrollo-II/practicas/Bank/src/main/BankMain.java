package main;

import model.BankAccount;
import model.BankApp;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Diego", 1000);
        BankApp bankApp = new BankApp(account);
        bankApp.start();
    }
}
