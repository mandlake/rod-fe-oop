package service;

import model.MemberDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc); //회원가입 감사합니다
    String login();
    String addUsers();
    MemberDTO findUser (String username);
    Map<String, MemberDTO> getUserMap();
    String count();

}