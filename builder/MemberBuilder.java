package builder;

import model.MemberDTO;

public class MemberBuilder {
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

    public MemberBuilder username(String username) {
        this.username = username;
        return this;
    }

    public MemberBuilder pw(String pw) {
        this.pw = pw;
        return this;
    }

    public MemberBuilder pwAgain(String pwAgain) {
        this.pwAgain = pwAgain;
        return this;
    }

    public MemberBuilder name(String name) {
        this.name = name;
        return this;
    }

    public MemberBuilder personId(String personId) {
        this.personId = personId;
        return this;
    }

    public MemberBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MemberBuilder address(String address) {
        this.address = address;
        return this;
    }

    public MemberBuilder job(String job) {
        this.job = job;
        return this;
    }

    public MemberBuilder height(double height) {
        this.height = height;
        return this;
    }

    public MemberBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public MemberDTO build() {
        return new MemberDTO(username, pw, pwAgain, name, personId, phoneNumber, address, job, height, weight);
    }
}
