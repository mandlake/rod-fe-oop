package model;

public class MemberDTO {
    private final String username;
    private final String pw;
    private final String pwAgain;
    private final String name;
    private final String personId;
    private final String phoneNumber;
    private final String address;
    private final String job;
    private final double height;
    private final double weight;

    public String getUsername() {
        return username;
    }

    public String getPw() {
        return pw;
    }

    public String getPwAgain() {
        return pwAgain;
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "username='" + username + '\'' +
                ", pw='" + pw + '\'' +
                ", pwAgain='" + pwAgain + '\'' +
                ", name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public MemberDTO(String username, String pw, String pwAgain, String name, String personId, String phoneNumber, String address, String job, double height, double weight) {
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
