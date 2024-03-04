package controller;

import model.Account;
import service.AccountService;
import service.UtilService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    private final AccountService account;
    private final UtilService util;

    public AccountController() {
        this.util = UtilServiceImpl.getInstance();
        this.account = AccountServiceImpl.getInstance();
    }

    public String createAccount(Scanner sc) {
        int id = util.createRandomInteger(0, 9999);
        return account.createAccount(
                Account.builder()
                        .id(id)
                        .accountNumber(sc.next())
                        .accountHolder(sc.next())
                        .balance(sc.nextDouble())
                        .build());
    }
    public String deposit(Scanner sc){
        String accountNum = sc.next();
        double balance = sc.nextDouble();
        return account.deposit(accountNum, balance);
    }
    public String withdraw(Scanner sc){
        String accountNum = sc.next();
        double balance = sc.nextDouble();
        return account.withdraw(accountNum, balance);
    }
    public String getBalance(Scanner sc){
        String accountNumber = sc.next();
        return account.getBalance(accountNumber);
    }

    public List<String> getAccounts() {
        return account.getAccounts();
    }
    public String cancelAccount(Scanner sc){
        String accountNumber = sc.next();
        return account.cancelAccount(accountNumber);
    }
}
