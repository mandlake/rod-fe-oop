package view;

import controller.AccountController;

import java.util.Scanner;

public class AccountView {
    public static void Account(Scanner sc) {
        AccountController ctrl = new AccountController();
        while (true) {
            System.out.println("[메뉴] 0-종료 1-계좌생성 2-입금 3-출금" +
                    " 4-잔고확인 5-계좌목록 6-해지");
            switch (sc.next()) {
                case "0":
                    System.out.println("계좌 관리를 종료합니다.");
                    return;
                case "1":
                    System.out.println("=== 계좌생성 ===");
                    System.out.println("계좌번호, 이름," +
                            " 통장에 넣을 금액을 입력해주세요");
                    System.out.println(ctrl.createAccount(sc));
                    break;
                case "2":
                    System.out.println("=== 입금 ===");
                    System.out.println("계좌번호와 입금할 금액을 입력해주세요.");
                    System.out.println(ctrl.deposit(sc));
                    break;
                case "3":
                    System.out.println("=== 출금 ===");
                    System.out.println("계좌번호와 출금할 금액을 입력해주세요.");
                    System.out.println(ctrl.withdraw(sc));
                    break;
                case "4":
                    System.out.println("=== 잔고확인 ===");
                    System.out.println("잔고를 확인할 계좌번호를 입력해주세요.");
                    System.out.println(ctrl.getBalance(sc));
                    break;
                case "5":
                    System.out.println("=== 계좌목록 ===");
                    System.out.println(ctrl.getAccounts());
                    break;
                case "6":
                    System.out.println("=== 해지 ===");
                    System.out.println(ctrl.cancelAccount(sc));
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하시오.");
            }
        }
    }
}
