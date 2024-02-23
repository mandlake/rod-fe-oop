package service;

import model.SubjectDTO;

public interface GradeService {
    int createTotalScore(SubjectDTO student);
    double createAverage(SubjectDTO student);
}
