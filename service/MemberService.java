package service;

import model.MemberDTO;

import java.util.List;
import java.util.Map;

public interface MemberService {
    String addMembers();
    Map<String, MemberDTO> join(MemberDTO member);
    String[] login(String username, String pw);
    String findMemberById(String username);
    void updatePassword(String username, String pw);
    String deleteMember(String username);
    List<String> getMemberList();
    List<String> findMembersByName(String name);
    List<String> findMembersByJob(String job);
    String countMembers();
}
