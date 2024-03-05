package service;

import model.Account;

import java.util.List;

public interface AccountService {
    String createAccount(Account account);
    String deposit(String accountNum, double balance);
    String withdraw(String accountNum, double balance);
    String getBalance(String accountNumber);
    List<?> getAccounts();
    String cancelAccount(String accountNumber);
}
