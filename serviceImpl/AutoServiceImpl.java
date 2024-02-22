package serviceImpl;

import service.AutoService;

public class AutoServiceImpl implements AutoService {

    private static final AutoService instance = new AutoServiceImpl();

    private AutoServiceImpl(){}

    public static AutoService getInstance() {
        return instance;
    }
    @Override
    public String join() {
        return null;
    }

    @Override
    public String login() {
        return null;
    }
}
