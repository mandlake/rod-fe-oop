package view;

import controller.MemberController;

import java.util.Scanner;

public class MemberView {
    public static void memberView(Scanner sc) {
        MemberController ctrl = new MemberController();
        ctrl.addMembers();
        while (true) {
            System.out.println("[메뉴] " +
                    "0-종료 1-회원가입 2-로그인 3-마이페이지 4-비번변경 " +
                    "5-탈퇴 6-회원목록 7-이름검색 8-직업검색 9-회원수 ");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("=== 회원가입 ===");
                    ctrl.join(sc);
                    break;
                case "2":
                    System.out.println("=== 로그인 ===");
                    break;
                case "3":
                    System.out.println("=== 마이페이지 ===");
                    ctrl.findMember(sc.next());
                    break;
                case "4":
                    System.out.println("=== 비번변경 ===");
                    break;
                case "5":
                    System.out.println("=== 탈퇴 ===");
                    break;
                case "6":
                    System.out.println("=== 회원목록 ===");
                    ctrl.findMembers();
                    break;
                case "7":
                    System.out.println("=== 이름검색 ===");
                    break;
                case "8":
                    System.out.println("=== 직업검색 ===");
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
