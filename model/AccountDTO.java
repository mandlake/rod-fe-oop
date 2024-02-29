package model;

import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AccountDTO {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDateTime transactionDate;
}
