package model;

import java.util.Scanner;

public class BankApp {
    private BankAccount bankAccount;
    private int opcion;
    private Scanner sc;


    public BankApp(BankAccount bankAccount){
        this.bankAccount = bankAccount;
        sc = new Scanner(System.in);
        opcion = 0;
    }

    public void start(){
        boolean following = true;
        System.out.println("Welcome to the cashier: " + bankAccount.getOwner());

        while (following) {
        System.out.println(bankAccount.showBalance()
                        + "\n1. Deposit Money"
                        + "\n2. Withdraw Money"
                        + "\n3. Exit");

        opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    int moneyToDeposit = sc.nextInt();
                    if (bankAccount.depositMoney(moneyToDeposit)) {
                        System.out.println("transaction performed");
                    }else {
                        System.out.println("transaction declined");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    int moneyToWithdraw = sc.nextInt();
                    if (bankAccount.withdrawMoney(moneyToWithdraw)) {
                        System.out.println("transaction performed");
                    }else {
                        System.out.println("transaction declined");
                    }
                    break;
                case 3:
                    System.out.println("leaving");
                    following = false;
                    break;
                default: System.out.println("Only options 1 to 3");
                    break;
            }
        }

            


        
    }
    
}