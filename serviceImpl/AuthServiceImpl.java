package serviceImpl;

import lombok.Getter;
import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    @Getter
    private static AuthService instance = new AuthServiceImpl();
    Map<String, Member> users;
    List<Member> memberList;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
        this.memberList = new ArrayList<>();
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("id,비밀번호,비밀번호확인, 이름, 주민번호,전화번호,주소, 직업을 입력하십시오.");

        Member member = Member.builder()
                .username(sc.next())
                .pw(sc.next())
                .pwAgain(sc.next())
                .name(sc.next())
                .personId(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        String newUsername = util.createRandomUserName();

        for(int i = 0 ; i<5 ; i++){
            map.put(newUsername,
                    Member.builder()
                            .username(newUsername)
                            .pw("1")
                            .pwAgain("1")
                            .name(util.createRandomName())
                            .build());
        }
        return null;
    }

    @Override
    public Member findUser(String username) {
        Member user = Member.builder().build();
        return user;
    }

    @Override
    public Map<String, Member> getUserMap() {
        users.forEach((k, v) -> System.out.print("{" + k + ", " + v + "}"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+"";
    }
}