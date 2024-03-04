package model;

import java.time.LocalDateTime;
import java.time.ZoneId;

import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Account {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDateTime transactionDate;

    @Builder(builderMethodName = "builder")
    public Account(long id, String accountNumber, String accountHolder, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        transactionDate = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
    }
}
