package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            }catch (LimitException e){
                bankAccount.setAmount(0);
                System.out.println(bankAccount.getAmount());
                break;
            }
        }
    }
}