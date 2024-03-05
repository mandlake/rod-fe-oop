package serviceImpl;

import lombok.Getter;
import model.Member;
import service.AutoService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;

public class AutoServiceImpl implements AutoService {

    @Getter
    private static final AutoService instance = new AutoServiceImpl();

    private AutoServiceImpl(){}

    @Override
    public String join() {
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public Map<String, Member> addMembers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for(int i = 0; i < 5; i++) {
            String username = util.createRandomUserName();
            String password = String.valueOf(util.createRandomInteger(1, 10));

            map.put(username,
                    Member.builder()
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
