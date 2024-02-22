package view;

import builder.MemberBuilder;
import model.MemberDTO;
import service.BmiService;
import service.UtilService;
import serviceImpl.BmiServiceImpl;
import serviceImpl.UtilServiceImpl;

public class BmiView {
    public static void main(String[] args) {
        UtilService random = UtilServiceImpl.getInstance();
        MemberDTO person = new MemberBuilder()
                .height(random.createRandomDouble(150, 50))
                .weight(random.createRandomDouble(30, 69))
                .build();

        BmiService service = BmiServiceImpl.getInstance();

        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();

        System.out.printf("키: %.1f, 몸무게: %.1f ", person.getHeight(), person.getWeight());
        System.out.printf("BMI: %.1f ", bmi);

        System.out.println("체질량: " + bodyMass);

    }
}
