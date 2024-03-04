package service;

import model.Member;

import java.util.List;
import java.util.Map;

public interface MemberService {
    String addMembers();
    Map<String, Member> join(Member member);
    String[] login(String username, String pw);
    String findMemberById(String username);
    void updatePassword(String username, String pw);
    String deleteMember(String username);
    List<String> getMemberList();
    List<String> findMembersByName(String name);
    List<String> findMembersByJob(String job);
    String countMembers();
}
