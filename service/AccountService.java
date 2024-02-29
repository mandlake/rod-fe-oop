package service;

import model.AccountDTO;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDTO account);
    String deposit(String accountNum, double balance);
    String withdraw(String accountNum, double balance);
    String getBalance(String accountNumber);
    List<String> getAccounts();
    String cancelAccount(String accountNumber);
}
