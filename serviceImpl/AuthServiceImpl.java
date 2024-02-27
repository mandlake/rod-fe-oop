package serviceImpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.AuthService;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, MemberDTO> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }

    public static AuthService getInstance(){
        return instance;
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("id,비밀번호,비밀번호확인, 이름, 주민번호,전화번호,주소, 직업을 입력하십시오.");

        MemberDTO member = new MemberBuilder()
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
        Map<String, MemberDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        String newUsername = util.createRandomUserName();

        for(int i = 0 ; i<5 ; i++){
            map.put(newUsername,
                    new MemberBuilder()
                            .username(newUsername)
                            .pw("1")
                            .pwAgain("1")
                            .name(util.createRandomName())
                            .build());
        }
        return null;
    }

    @Override
    public MemberDTO findUser(String username) {
        MemberDTO user = new MemberBuilder().build();
        return user;
    }

    @Override
    public Map<String, MemberDTO> getUserMap() {
        users.forEach((k, v) -> System.out.print("{" + k + ", " + v + "}"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+"";
    }
}