package org.example.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static final Map<String, User> USER_MAP = new HashMap<>();

    static {
        initData();
    }

    private static void initData(){
       User user1 = new User();
       user1.setName("Tom");
       user1.setAge(20);
       user1.setPhone("8-043-654-33");
       user1.setGender(Gender.MALE);
       USER_MAP.put(user1.getName(), user1);

        User user2 = new User();
        user2.setName("Ann");
        user2.setAge(30);
        user2.setPhone("8-045-634-23");
        user2.setGender(Gender.FEMALE);
        USER_MAP.put(user2.getName(), user2);

        User user3 = new User();
        user3.setName("Bill");
        user3.setAge(45);
        user3.setPhone("8-023-678-34");
        user3.setGender(Gender.MALE);
        USER_MAP.put(user3.getName(), user3);
    }

    public User findUser(String name) {
        return USER_MAP.get(name);
    }


}
