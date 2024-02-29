package controller;

import builder.MemberBuilder;
import model.MemberDTO;
import service.MemberService;
import serviceImpl.MemberServiceImpl;

import java.util.*;

public class MemberController {
    private final MemberService member;

    public MemberController() {
        this.member = MemberServiceImpl.getInstance();
    }

    public String addMembers() {
        return member.addMembers();
    }

    public Map<String, MemberDTO> join(Scanner sc) {
        MemberDTO mem = new MemberBuilder()
                .username(sc.next())
                .pw(sc.next())
                .name(sc.next())
                .personId(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        return member.join(mem);
    }

    public String[] login(Scanner sc) {
        String username = sc.next();
        String pw = sc.next();
        return member.login(username, pw);
    }

    public String findMemberByID(Scanner sc) {
        String username = sc.next();
        return member.findMemberById(username);
    }

    public void updatePassword(String username, Scanner sc) {
        String pw = sc.next();
        member.updatePassword(username, pw);
    }

    public String deleteMember(String username) {
        return member.deleteMember(username);
    }

    public List<String> getMemberList() {
        return member.getMemberList();
    }

    public List<String> findMembersByName(Scanner sc) {
        String name = sc.next();
        return member.findMembersByName(name);
    }

    public List<String> findMembersByJob(Scanner sc) {
        String job = sc.next();
        return member.findMembersByJob(job);
    }

    public String countMembers() {
        return member.countMembers();
    }
}
