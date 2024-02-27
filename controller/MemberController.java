package controller;

import model.MemberDTO;
import service.MemberService;
import serviceImpl.MemberServiceImpl;

import java.util.*;

public class MemberController {
    private final MemberService member;

    private Map<String, MemberDTO> users;

    public MemberController() {
        this.member = MemberServiceImpl.getInstance();
        this.users = new HashMap<>();
    }

    public void addMembers() {
        this.users = member.addMembers();
    }

    public MemberDTO findMember(String username) {
        return member.findMemberById(username);
    }

    public String join(Scanner sc) {
        return member.join(sc);
    }

    public Map<String, MemberDTO> findMembers() {
        return member.getMemberList();
    }

    public String countMembers() {
        return member.countMembers();
    }
}
