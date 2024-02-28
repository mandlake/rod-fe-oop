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
    public void addMembers() {
        UtilService util = UtilServiceImpl.getInstance();
        for(int i = 0; i < 5; i++) {
            String username = util.createRandomUserName();
            String password = String.valueOf(util.createRandomInteger(1, 10));
            String personID = String.valueOf(util.createRandomInteger(1, 10));
            String phoneNum = String.valueOf(util.createRandomInteger(1, 10));
            String address = String.valueOf(util.createRandomInteger(1, 10));
            String job = String.valueOf(util.createRandomInteger(1, 10));

            users.put(username,
                    new MemberBuilder()
                            .username(username)
                            .pw(password)
                            .name(util.createRandomName())
                            .personId(personID)
                            .phoneNumber(phoneNum)
                            .address(address)
                            .job(job)
                            .build());
        }
        System.out.println(users.size() + "명의 회원이 생성되었습니다.");
    }
    @Override
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 이름, 주민번호," +
                " 전화번호, 주소, 직업을 입력해주세요");
        MemberDTO member = new MemberBuilder()
                .username(sc.next())
                .pw(sc.next())
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
    public String login(Scanner sc) {
        System.out.println("아이디를 입력하세요.");
        String username = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String pw = sc.next();
        if(users.get(username) == null) {
            System.out.println("로그인에 실패했습니다.");
        } else if(Objects.equals(users.get(username).getPw(), pw)) {
            System.out.println(users.get(username).getName() + "님께서 로그인하셨습니다.");
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
        return username;
    }

    @Override
    public void findMemberById(Scanner sc) {
        System.out.println("찾고 싶은 ID를 입력하세요.");
        String username = sc.next();
        MemberDTO user = users.get(username);
        if(user == null) {
            System.out.println(username + "에 해당하는 정보가 없습니다.");
        } else {
            System.out.println(user);
        }
    }

    @Override
    public void updatePassword(String username, Scanner sc) {
        MemberDTO userWillChanged = users.get(username);
        String name = userWillChanged.getName();
        String personID = userWillChanged.getPersonId();
        String phoneNum = userWillChanged.getPhoneNumber();
        String address = userWillChanged.getAddress();
        String job = userWillChanged.getJob();
        users.put(username,
                new MemberBuilder()
                        .username(username)
                        .pw(sc.next())
                        .name(name)
                        .personId(personID)
                        .phoneNumber(phoneNum)
                        .address(address)
                        .job(job)
                        .build());
        System.out.println("비밀번호 변경이 완료되었습니다.");
    }

    @Override
    public void deleteMember(Scanner sc) {
        System.out.println("탈퇴를 원하는 ID를 입력하세요.");
        String username = sc.next();
        if(users.get(username) == null) {
            System.out.println(username + "에 해당하는 정보가 없습니다.");
        } else {
            users.remove(username);
            System.out.println(username + "이 탈퇴하였습니다.");
        }
    }

    @Override
    public void getMemberList() {
        if (users.isEmpty()) {
            System.out.println("안에 아무 정보도 없습니다.");
        } else {
            users.forEach((k, v) -> System.out.println("{" + k + ", " + v + "}"));
        }
    }

    @Override
    public void findMembersByName(Scanner sc) {
        if (users.isEmpty()) {
            System.out.println("안에 아무 정보도 없습니다.");
        } else {
            System.out.println("찾고 싶은 이름을 입력하세요.");
            String name = sc.next();
            users.forEach((k, v) -> {
                if(Objects.equals(v.getName(), name)) {
                    System.out.println("{" + k + ", " + v + "}");
                }
            });
        }
    }

    @Override
    public void findMembersByJob(Scanner sc) {
        if (users.isEmpty()) {
            System.out.println("해당 직업에 해당하는 정보가 없습니다.");
        } else {
            System.out.println("찾고 싶은 직업을 입력하세요.");
            String job = sc.next();
            users.forEach((k, v) -> {
                if(Objects.equals(v.getJob(), job)) {
                    System.out.println("{" + k + ", " + v + "}");
                }
            });
        }
    }

    @Override
    public void countMembers() {
        System.out.println("회원 수는 " + users.size() + "명 입니다.");
    }
}
