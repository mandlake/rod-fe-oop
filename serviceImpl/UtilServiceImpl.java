package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    private static final UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl(){}

    public static UtilService getInstance() {
        return instance;
    }

    @Override
    public int createRandomInteger(int start, int gap) {
        return (int)(Math.random() * gap) + start;
    }

    @Override
    public double createRandomDouble(int start, int gap) {
        return Math.random() * gap + start;
    }
}
