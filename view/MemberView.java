package view;

import controller.MemberController;

import java.util.Scanner;

public class MemberView {
    public static String login(String username, MemberController ctrl, Scanner sc) {
        System.out.println("아이디와 비밀번호를 입력하세요.");
        String[] login = ctrl.login(sc);
        System.out.println(login[1]);
        if(login[0] != null) {
            username = login[0];
        } else {
            System.out.println("다시 로그인하세요.");
        }
        return username;
    }
    public static void memberView(Scanner sc) {
        MemberController ctrl = new MemberController();
        System.out.println(ctrl.addMembers());
        String username = "";
        while (true) {
            System.out.println("[메뉴] " +
                    "0-종료 1-회원가입 2-로그인 3-회원정보 4-비번변경 " +
                    "5-탈퇴 6-회원목록 7-이름검색 8-직업검색 9-회원수 ");
            switch (sc.next()) {
                case "0":
                    System.out.println("사용자 관리를 종료합니다.");
                    return;
                case "1":
                    System.out.println("=== 회원가입 ===");
                    System.out.println("ID, 비밀번호, 이름, 주민번호," +
                            " 전화번호, 주소, 직업을 입력해주세요");
                    ctrl.join(sc);
                    break;
                case "2":
                    System.out.println("=== 로그인 ===");
                    username = login(username, ctrl, sc);
                    break;
                case "3":
                    System.out.println("=== 회원정보 ===");
                    System.out.println("찾고 싶은 ID를 입력하세요.");
                    System.out.println(ctrl.findMemberByID(sc));
                    break;
                case "4":
                    System.out.println("=== 비번변경 ===");
                    if(username.isEmpty()) {
                        System.out.println("로그인을 먼저 하셔야 합니다.");
                        username = login(username, ctrl, sc);
                    }
                    System.out.println("바꿀 비밀번호를 입력하세요.");
                    ctrl.updatePassword(username, sc);
                    System.out.println("비밀번호 변경이 완료되었습니다.");
                    break;
                case "5":
                    System.out.println("=== 탈퇴 ===");
                    if(username.isEmpty()) {
                        username = login(username, ctrl, sc);
                    }
                    System.out.println(ctrl.deleteMember(username));
                    username = "";
                    break;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    for (String mem: ctrl.getMemberList()) {
                        System.out.println(mem);
                    }
                    break;
                case "7":
                    System.out.println("=== 이름검색 ===");
                    System.out.println("이름을 입력하세요.");
                    ctrl.findMembersByName(sc).forEach(System.out::println);
                    break;
                case "8":
                    System.out.println("=== 직업검색 ===");
                    System.out.println("찾고 싶은 직업을 입력하세요.");
                    ctrl.findMembersByJob(sc).forEach(System.out::println);
                    break;
                case "9":
                    System.out.println("=== 회원수 ===");
                    System.out.println(ctrl.countMembers());
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하시오.");
            }
        }
    }
}
