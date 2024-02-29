package builder;

import model.AccountDTO;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class AccountBuilder {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDateTime transactionDate;

    public AccountBuilder id(long id) {
        this.id = id;
        return this;
    }

    public AccountBuilder accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountBuilder accountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
        return this;
    }

    public AccountBuilder balance(double balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder transactionDate() {
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        this.transactionDate = LocalDateTime.now(seoulZone);
        return this;
    }

    public AccountDTO build() {
        return new AccountDTO(id, accountNumber, accountHolder, balance, transactionDate);
    }
}
