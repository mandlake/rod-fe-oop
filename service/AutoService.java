package service;

import model.Member;

import java.util.Map;

public interface AutoService {
    String join();
    String login();
    Map<String, Member> addMembers();
    void findMembers(String username);
}
