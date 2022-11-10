package org.example;

public class BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void deposit(Integer sum){
        amount = amount + sum;
    }
    public void withDraw(Integer sum) throws LimitException {
        if (amount < sum){
            throw new LimitException("Top up your account. Your amount: " + amount, amount );
        } else {
        amount = amount - sum;}
    }
}
