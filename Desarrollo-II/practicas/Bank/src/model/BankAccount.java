package model;
public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(){
        this("none", 0.0 );
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
    public boolean depositMoney(double money) {
        if (money > 0) {
            balance = balance + money;
            return true;
        }
        return false;
    }

    public boolean withdrawMoney(double money){
        if (money <= balance && money != 0) {
            balance = balance - money;
            return true;
        }
        return false;
    }

    public String showBalance() {
        return owner + " actual balance: $" + balance;
    }
}
