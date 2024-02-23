package view;

import builder.MemberBuilder;
import builder.SubjectBuilder;
import model.MemberDTO;
import model.SubjectDTO;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름, 국어, 영어, 수학점수 : ");
        UtilService random = UtilServiceImpl.getInstance();
        MemberDTO student = new MemberBuilder()
                .name(sc.next())
                .build();
        SubjectDTO subject = new SubjectBuilder()
                .korea(random.createRandomInteger(0, 100))
                .english(random.createRandomInteger(0, 100))
                .math(random.createRandomInteger(0, 100))
                .build();

        GradeService service = GradeServiceImpl.getInstance();
        int totalScore = service.createTotalScore(subject);
        double average = service.createAverage(subject);

        System.out.print(" ============= 성적표 ==============\n"
                + "이름 : " + student.getName() + "\n"
                + "국어점수 : " + subject.getKorea() + "\n"
                + "영어점수 : " + subject.getEnglish() + "\n"
                + "수학점수 : " + subject.getMath() + "\n"
                + "점수의 총합 : " + totalScore + "\n"
                + "평균 점수: " + average);
    }
}
