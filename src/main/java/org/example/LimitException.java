package org.example;

public class LimitException extends Exception{
   private int remainingAmount;

    public LimitException(String message, Integer remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Integer getRemainingAmount() {
        return remainingAmount;
    }
}
