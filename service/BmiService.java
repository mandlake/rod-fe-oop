package service;

import model.Member;

public interface BmiService {
    String createBmi(Member member);
    String createBodyMass(double bmi);
}
