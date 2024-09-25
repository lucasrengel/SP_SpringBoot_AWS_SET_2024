package excecoes.fixacao01.model.entities;

import excecoes.fixacao01.model.exception.BusinessException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public double deposit(double amount) {
        return balance + amount;
    }

    public double withdraw(double amount) {
        if(amount > balance) {
            throw new BusinessException("Withdraw error: Not enough balance");
        }
        else if(amount > withdrawLimit) {
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit") ;
        }else{
            return balance - amount;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
