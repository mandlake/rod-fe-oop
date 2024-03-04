package serviceImpl;

import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {

    private static final GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int createTotalScore(Subject subject) {
        return subject.getEnglish() + subject.getKorea() + subject.getMath();
    }

    @Override
    public double createAverage(Subject subject) {
        return (double) (subject.getEnglish() + subject.getKorea() + subject.getMath()) /3;
    }
}
