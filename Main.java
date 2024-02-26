import view.BmiView;
import view.BoardView;
import view.GradeView;
import view.JoinView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 선택");

        while (true) {
            System.out.println("0-종료 1-회원가입 2-성적들 3-게시판 4-BMI");
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    System.out.println("종료합니다.");
                    return;
                case 1: JoinView.join(sc); break;
                case 2: GradeView.grade(sc); break;
                case 3: BoardView.board(); break;
                case 4: BmiView.bmi(); break;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력하시오.");
            }
        }
    }
}