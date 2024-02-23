package serviceImpl;

import model.MemberDTO;
import service.BmiService;

public class BmiServiceImpl implements BmiService {

    private static final BmiService instance = new BmiServiceImpl();

    private BmiServiceImpl(){}

    public static BmiService getInstance() {
        return instance;
    }

    @Override
    public String createBmi(MemberDTO member) {
        return String.format(String.valueOf(0.1f), (member.getWeight())/((member.getHeight()/100) * (member.getHeight()/100)));
    }

    @Override
    public String createBodyMass(double bmi) {
        String bodyMass;
        if(bmi >= 35) {
            bodyMass = "3단계 비만";
        } else if(bmi >= 30) {
            bodyMass = "2단계 비만";
        } else if (bmi >= 25) {
            bodyMass = "1단계 비만";
        } else if (bmi >= 23) {
            bodyMass = "비만 전 단계";
        } else if (bmi >= 18.5) {
            bodyMass = "정상";
        } else {
            bodyMass = "저체중";
        }
        return bodyMass;
    }
}
