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

    public String join(Scanner sc) {
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

    public String login(Scanner sc) {
        String username = sc.next();
        String pw = sc.next();
        return member.login(username, pw);
    }

    public String findMemberByID(Scanner sc) {
        String username = sc.next();
        return member.findMemberById(username);
    }

    public void updatePassword(String username, Scanner sc) {
        member.updatePassword(username, sc);
    }

    public void deleteMember(Scanner sc) {
        member.deleteMember(sc);
    }

    public void getMemberList() {
        member.getMemberList();
    }

    public void findMembersByName(Scanner sc) {
        member.findMembersByName(sc);
    }

    public void findMembersByJob(Scanner sc) {
        member.findMembersByJob(sc);
    }

    public void countMembers() {
        member.countMembers();
    }
}
