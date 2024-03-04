package view;

import model.Member;

import java.util.Scanner;

public class JoinView {
    public static void join(Scanner sc) {
        sc = new Scanner(System.in);

        System.out.println("ID, 비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력해주세요");
        Member member = Member.builder()
                .username(sc.next())
                .pw(sc.next())
                .pwAgain(sc.next())
                .name(sc.next())
                .personId(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        System.out.println(member.toString());
    }
}
