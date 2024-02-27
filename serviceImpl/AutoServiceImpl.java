package serviceImpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.AutoService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    public Map<String, MemberDTO> addMembers() {
        Map<String, MemberDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for(int i = 0; i < 5; i++) {
            String username = util.createRandomUserName();
            String password = String.valueOf(util.createRandomInteger(1, 10));

            map.put(username,
                    new MemberBuilder()
                            .username(username)
                            .pw(password)
                            .pwAgain(password)
                            .name(util.createRandomName())
                            .build());
        }

        return map;
    }

    @Override
    public void findMembers(String username) {
    }
}
