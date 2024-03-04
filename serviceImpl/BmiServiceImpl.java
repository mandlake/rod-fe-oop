package serviceImpl;

import lombok.Getter;
import model.Member;
import service.BmiService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BmiServiceImpl implements BmiService {

    @Getter
    private static final BmiService instance = new BmiServiceImpl();
    Map<String, ?> memberMap;
    List<? extends Member> memberList;

    private BmiServiceImpl(){
        this.memberMap = new HashMap<>();
        this.memberList = new ArrayList<>();
    }

    @Override
    public String createBmi(Member member) {
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
