package view;

import controller.MemberController;

import java.util.Objects;
import java.util.Scanner;

public class MemberView {
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
                    System.out.println("아이디와 비밀번호를 입력하세요.");
                    System.out.println(ctrl.login(sc));

                    break;
                case "3":
                    System.out.println("=== 회원정보 ===");
                    System.out.println("찾고 싶은 ID를 입력하세요.");
                    System.out.println(ctrl.findMemberByID(sc));
                    break;
                case "4":
                    System.out.println("=== 비번변경 ===");
                    if(Objects.equals(username, "")) {
                        System.out.println("비번 변경을 원하는 아이디를 입력하세요.");
                        username = sc.next();
                    }
                    ctrl.updatePassword(username, sc);
                    break;
                case "5":
                    System.out.println("=== 탈퇴 ===");
                    ctrl.deleteMember(sc);
                    break;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    ctrl.getMemberList();
                    break;
                case "7":
                    System.out.println("=== 이름검색 ===");
                    ctrl.findMembersByName(sc);
                    break;
                case "8":
                    System.out.println("=== 직업검색 ===");
                    ctrl.findMembersByJob(sc);
                    break;
                case "9":
                    System.out.println("=== 회원수 ===");
                    ctrl.countMembers();
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하시오.");
            }
        }
    }
}
