package view;

import model.Member;
import service.BmiService;
import service.UtilService;
import serviceImpl.BmiServiceImpl;
import serviceImpl.UtilServiceImpl;

public class BmiView {
    public static void bmi() {
        UtilService random = UtilServiceImpl.getInstance();
        Member person = Member.builder()
                .height(random.createRandomDouble(150, 50))
                .weight(random.createRandomDouble(30, 69))
                .build();

        BmiService service = BmiServiceImpl.getInstance();

        String bmi = service.createBmi(person);
        String bodyMass = service.createBodyMass(Double.parseDouble(bmi));

        System.out.print(" ============= BMI ==============\n"
                + "BMI: " + bmi + "\n"
                + "체질량: " + bodyMass);

    }
}
