package controller;

import service.MemberService;
import serviceImpl.MemberServiceImpl;

import java.util.*;

public class MemberController {
    private final MemberService member;

    public MemberController() {
        this.member = MemberServiceImpl.getInstance();
    }

    public void addMembers() {
        member.addMembers();
    }

    public String join(Scanner sc) {
        return member.join(sc);
    }

    public String login(Scanner sc) {
        return member.login(sc);
    }

    public void findMemberByID(Scanner sc) {
        member.findMemberById(sc);
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
