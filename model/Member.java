package model;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Member {
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

    @Builder(builderMethodName = "builder")
    public Member(String username, String pw, String pwAgain, String name, String personId, String phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.pw = pw;
        this.pwAgain = pwAgain;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
}
