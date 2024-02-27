package service;

import model.MemberDTO;

import java.util.Map;
import java.util.Scanner;

public interface MemberService {
    Map<String, MemberDTO> addMembers();
    String join(Scanner sc);
    String login(MemberDTO member);
    MemberDTO findMemberById(String username);
    String updatePassword(MemberDTO member);
    String deleteMember(String username);
    Map<String, MemberDTO> getMemberList();
    String findMembersByName(String name);
    String findMembersByJob(String job);
    String countMembers();
}
