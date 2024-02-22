package view;

import builder.SubjectBuilder;
import model.SubjectDTO;
import service.GradeService;
import serviceImpl.GradeServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("국어, 영어, 수학점수 : ");
        SubjectDTO student = new SubjectBuilder()
                .korea(sc.nextInt())
                .english(sc.nextInt())
                .math(sc.nextInt())
                .build();

        GradeService service = GradeServiceImpl.getInstance();
        int totalScore = service.createTotalScore();
        double average = service.createAverage();

        System.out.println(" ============= 성적표 ==============");
        System.out.println("국어점수 : " + student.getKorea());
        System.out.println("영어점수 : " + student.getEnglish());
        System.out.println("수학점수 : " + student.getMath());
        System.out.println("점수의 총합 : " + totalScore);
        System.out.println("평균 점수: " + average);

    }
}
