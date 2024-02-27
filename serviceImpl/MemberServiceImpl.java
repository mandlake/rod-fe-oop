package serviceImpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.MemberService;
import service.UtilService;

import java.util.*;

public class MemberServiceImpl implements MemberService {

    private static final MemberService instance = new MemberServiceImpl();
    Map<String, MemberDTO> users;

    private MemberServiceImpl(){
        this.users = new HashMap<>();
    }

    public static MemberService getInstance() {
        return instance;
    }

    @Override
    public Map<String, MemberDTO> addMembers() {
        UtilService util = UtilServiceImpl.getInstance();
        for(int i = 0; i < 5; i++) {
            String username = util.createRandomUserName();
            String password = String.valueOf(util.createRandomInteger(1, 10));

            users.put(username,
                    new MemberBuilder()
                            .username(username)
                            .pw(password)
                            .pwAgain(password)
                            .name(util.createRandomName())
                            .build());
        }

        return users;
    }
    @Override
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력해주세요");
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
        users.put(member.getUsername(), member);
        return member.toString();
    }

    @Override
    public String login(MemberDTO member) {
        return null;
    }

    @Override
    public MemberDTO findMemberById(String username) {
        MemberDTO user = users.get(username);
        System.out.println(user.toString());
        return user;
    }

    @Override
    public String updatePassword(MemberDTO member) {
        return null;
    }

    @Override
    public String deleteMember(String username) {
        return null;
    }

    @Override
    public Map<String, MemberDTO> getMemberList() {
        users.forEach((k, v) -> System.out.println("{" + k + ", " + v + "}"));
        return users;
    }

    @Override
    public String findMembersByName(String name) {
        return null;
    }

    @Override
    public String findMembersByJob(String job) {
        return null;
    }

    @Override
    public String countMembers() {
        return users.size() + "";
    }
}
