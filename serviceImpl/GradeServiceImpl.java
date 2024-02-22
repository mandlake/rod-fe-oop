package serviceImpl;

import service.GradeService;
import service.UtilService;

public class GradeServiceImpl implements GradeService {

    private static final GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int createTotalScore() {
        return 0;
    }

    @Override
    public double createAverage() {
        return 0;
    }
}
