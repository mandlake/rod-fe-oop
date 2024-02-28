package service;

import java.util.Scanner;

public interface MemberService {
    void addMembers();
    String join(Scanner sc);
    String login(Scanner sc);
    void findMemberById(Scanner sc);
    void updatePassword(String username, Scanner sc);
    void deleteMember(Scanner sc);
    void getMemberList();
    void findMembersByName(Scanner sc);
    void findMembersByJob(Scanner sc);
    void countMembers();
}
