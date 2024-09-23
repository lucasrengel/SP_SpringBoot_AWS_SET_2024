package excecoes.fixacao01.application;

import excecoes.fixacao01.model.entities.Account;
import excecoes.fixacao01.model.exception.BusinessException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(accountNumber, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.println("New balance: " + account.getBalance());
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
