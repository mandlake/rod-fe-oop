package service;

import model.Subject;

public interface GradeService {
    int createTotalScore(Subject student);
    double createAverage(Subject student);
}
