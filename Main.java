import view.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 선택");

        while (true) {
            System.out.println("0-종료 1-회원가입 2-성적들 3-게시판 4-BMI " +
                    "5-사용자관리(map) 6-계좌관리");
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    System.out.println("종료합니다.");
                    return;
                case 1:
                    System.out.println("=== 회원가입 ===");
                    JoinView.join(sc);
                    break;
                case 2:
                    System.out.println("=== 성적들 ===");
                    GradeView.grade(sc);
                    break;
                case 3:
                    System.out.println("=== 게시판 ===");
                    BoardView.board();
                    break;
                case 4:
                    System.out.println("=== BMI ===");
                    BmiView.bmi();
                    break;
                case 5:
                    System.out.println("=== 사용자관리(map) ===");
                    MemberView.memberView(sc);
                    break;
                case 6:
                    System.out.println("=== 계좌관리 ===");
                    AccountView.Account(sc);
                    break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하시오.");
            }
        }
    }
}