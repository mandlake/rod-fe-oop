package service;

import model.MemberDTO;

import java.util.Scanner;

public interface MemberService {
    String addMembers();
    String join(MemberDTO member);
    String login(String username, String pw);
    String findMemberById(String username);
    void updatePassword(String username, Scanner sc);
    void deleteMember(Scanner sc);
    void getMemberList();
    void findMembersByName(Scanner sc);
    void findMembersByJob(Scanner sc);
    void countMembers();
}
