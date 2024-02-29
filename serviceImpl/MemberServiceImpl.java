package serviceImpl;

import builder.MemberBuilder;
import lombok.Getter;
import model.MemberDTO;
import service.MemberService;
import service.UtilService;

import java.util.*;

public class MemberServiceImpl implements MemberService {
    Map<String, MemberDTO> users;

    @Getter
    private static final MemberService instance = new MemberServiceImpl();
    private MemberServiceImpl(){
        this.users = new HashMap<>();
    }

    @Override
    public String addMembers() {
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
        return users.size() + "명의 회원이 생성되었습니다.";
    }
    @Override
    public Map<String, MemberDTO> join(MemberDTO member) {
        users.put(member.getUsername(), member);
        return users;
    }

    @Override
    public String[] login(String username, String pw) {
        String[] successLogin = new String[2];
        if(users.get(username) == null) {
            successLogin[1] = "로그인에 실패했습니다.";
        } else if(Objects.equals(users.get(username).getPw(), pw)) {
            successLogin[0] = username;
            successLogin[1] = users.get(username).getName() + "님께서 로그인하셨습니다.";
        } else {
            successLogin[1] = "비밀번호가 틀렸습니다.";
        }
        return successLogin;
    }

    @Override
    public String findMemberById(String username) {
        MemberDTO user = users.get(username);
        String Mem;
        if(user == null) {
            Mem = username + "에 해당하는 정보가 없습니다.";
        } else {
            Mem = user.toString();
        }
        return Mem;
    }

    @Override
    public void updatePassword(String username, String pw) {
        MemberDTO userWillChanged = users.get(username);
        String name = userWillChanged.getName();
        String personID = userWillChanged.getPersonId();
        String phoneNum = userWillChanged.getPhoneNumber();
        String address = userWillChanged.getAddress();
        String job = userWillChanged.getJob();
        users.put(username,
                new MemberBuilder()
                        .username(username)
                        .pw(pw)
                        .name(name)
                        .personId(personID)
                        .phoneNumber(phoneNum)
                        .address(address)
                        .job(job)
                        .build());
    }

    @Override
    public String deleteMember(String username) {
        users.remove(username);
        return username + "이 탈퇴하였습니다.\n안녕히가세요.";
    }

    @Override
    public List<String> getMemberList() {
        List<String> mem = new ArrayList<>();
        if (users.isEmpty()) {
            mem.add("안에 아무 정보도 없습니다.");
        } else {
            // List<MemberDTO> mem = new ArrayList<>(users.values());처럼 써도 됨.
            users.forEach((k, v) -> mem.add("{" + k + ", " + v + "}"));
        }
        return mem;
    }

    @Override
    public List<String> findMembersByName(String name) {
        List<String> mem = new ArrayList<>();
        if (users.isEmpty()) {
            mem.add("해당 이름에 해당하는 정보가 없습니다.");
        } else {
            users.forEach((k, v) -> {
                if(Objects.equals(v.getName(), name)) {
                    mem.add("{" + k + ", " + v + "}");
                }
            });
        }
        return mem;
    }

    @Override
    public List<String> findMembersByJob(String job) {
        List<String> mem = new ArrayList<>();
        if (users.isEmpty()) {
            mem.add("해당 직업에 해당하는 정보가 없습니다.");
        } else {
            users.forEach((k, v) -> {
                if(Objects.equals(v.getJob(), job)) {
                    mem.add("{" + k + ", " + v + "}");
                }
            });
        }
        return mem;
    }

    @Override
    public String countMembers() {
        return "회원 수는 " + users.size() + "명 입니다.";
    }
}
