package model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
    private String username;
    private String pw;
    private String pwAgain;
    private String name;
    private String personId;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;
}
