package stratagy;

import java.util.Arrays;
import java.util.Scanner;

enum Grade {
    A(90),
    B(80),
    C(70),
    D(60),
    F(0);
    private final int score;

    Grade(int score) {
        this.score = score;
    }

    public static String getGrade(int score) {
        return getOperator(score).name();
    }

    private static Grade getOperator(int score) {
        return Arrays.stream(values())
                .filter(o -> score >= o.score)
                .findFirst().orElse(F);
    }
}

public class GradeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score");
        String s = Grade.getGrade(sc.nextInt());
        System.out.println(s);
    }
}
