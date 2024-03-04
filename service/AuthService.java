package service;

import model.Member;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc); //회원가입 감사합니다
    String login();
    String addUsers();
    Member findUser (String username);
    Map<String, Member> getUserMap();
    String count();

}