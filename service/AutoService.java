package service;

import model.MemberDTO;

import java.util.Map;

public interface AutoService {
    String join();
    String login();
    Map<String, MemberDTO> addMembers();
    void findMembers(String username);
}
