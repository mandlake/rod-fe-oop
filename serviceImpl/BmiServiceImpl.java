package serviceImpl;

import service.BmiService;
import service.UtilService;

public class BmiServiceImpl implements BmiService {

    private static final BmiService instance = new BmiServiceImpl();

    private BmiServiceImpl(){}

    public static BmiService getInstance() {
        return instance;
    }
    @Override
    public double createBmi() {
        return 0.0;
    }

    @Override
    public String createBodyMass() {

        return "";
    }
}
