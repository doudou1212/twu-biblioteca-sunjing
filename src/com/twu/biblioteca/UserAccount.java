package com.twu.biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunjing on 4/23/16.
 */
public class UserAccount {
    private Map<String, String> users = new HashMap<String, String>();//Username, password

    public UserAccount() {
        users.put("sunjing", "123456");
        users.put("zhoujing", "123456");
        users.put("liujing", "123456");
        users.put("mengru", "123456");
    }

    public boolean login(String username, String password) {
        if (this.users.get(username).equals(password)){
            return  true;
        }
        return false;
    }
}
