package serviceImpl;

import model.SubjectDTO;
import service.GradeService;

public class GradeServiceImpl implements GradeService {

    private static final GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int createTotalScore(SubjectDTO subject) {
        return subject.getEnglish() + subject.getKorea() + subject.getMath();
    }

    @Override
    public double createAverage(SubjectDTO subject) {
        return (double) (subject.getEnglish() + subject.getKorea() + subject.getMath()) /3;
    }
}
