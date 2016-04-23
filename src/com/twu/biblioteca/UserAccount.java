package com.twu.biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sunjing on 4/23/16.
 */
public class UserAccount {
    private Map<String, String> users = new HashMap<String, String>();//libraryNumber, password

    public UserAccount() {
        users.put("sunjing", "123456");
        users.put("zhoujing", "123456");
        users.put("liujing", "123456");
        users.put("mengru", "123456");
    }

    public boolean login(String libraryNumber, String password) {
        if (this.users.get(libraryNumber).equals(password)){
            return  true;
        }
        return false;
    }
}
