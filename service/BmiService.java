package service;

import model.MemberDTO;

public interface BmiService {
    String createBmi(MemberDTO member);
    String createBodyMass(double bmi);
}
