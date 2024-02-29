package serviceImpl;

import builder.AccountBuilder;
import lombok.Getter;
import model.AccountDTO;
import service.AccountService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountServiceImpl implements AccountService {
    Map<String, AccountDTO> accounts;

    @Getter
    private static final AccountService instance = new AccountServiceImpl();

    private AccountServiceImpl(){
        this.accounts = new HashMap<>();
    }

    @Override
    public String createAccount(AccountDTO account) {
        accounts.put(account.getAccountNumber(), account);
        return "계좌가 생성되었습니다.";
    }

    @Override
    public String deposit(String accountNum, double balance) {
        AccountDTO acc = accounts.get(accountNum);
        String deposit;
        if(acc == null) {
            deposit = "안에 계좌가 없습니다.";
        } else {
            accounts.put(accountNum,
                    new AccountBuilder()
                            .id(acc.getId())
                            .accountNumber(accountNum)
                            .accountHolder(acc.getAccountHolder())
                            .balance(acc.getBalance() + balance)
                            .transactionDate()
                            .build());
            deposit = acc.getAccountHolder() + "님의 계좌에 돈이 " + balance + "만큼 입금되었습니다.";
        }
        return deposit;
    }

    @Override
    public String withdraw(String accountNum, double balance) {
        AccountDTO acc = accounts.get(accountNum);
        String deposit;
        if(acc == null) {
            deposit = "안에 계좌가 없습니다.";
        } else {
            accounts.put(accountNum,
                    new AccountBuilder()
                            .id(acc.getId())
                            .accountNumber(accountNum)
                            .accountHolder(acc.getAccountHolder())
                            .balance(acc.getBalance() - balance)
                            .transactionDate()
                            .build());
            deposit = acc.getAccountHolder() + "님의 계좌에 돈이 " + balance + "만큼 출금되었습니다.";
        }
        return deposit;
    }

    @Override
    public String getBalance(String accountNumber) {
        return accounts.get(accountNumber).getBalance() + "";
    }

    @Override
    public List<String> getAccounts() {
        List<String> accountList = new ArrayList<>();
        if(accounts.isEmpty()) {
            accountList.add("계좌가 아무것도 없습니다.");
        } else {
            accounts.forEach((k, v) -> accountList.add("{" + k + ", " + v + "}"));
        }
        return accountList;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        AccountDTO acc = accounts.get(accountNumber);
        String deposit;
        if(acc == null) {
            deposit = "안에 계좌가 없습니다.";
        } else {
            accounts.remove(accountNumber);
            deposit = acc.getAccountHolder() + "님이 계좌를 해지하였습니다..";
        }
        return deposit;
    }
}
