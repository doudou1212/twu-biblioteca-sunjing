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
        users.put("doudou", "123456");
        users.put("sj", "123456");
        users.put("lj", "123456");
        users.put("mr", "123456");
    }

    public boolean login(String libraryNumber, String password) {
        if(!this.users.containsKey(libraryNumber)) {
            return false;
        }
        if (this.users.get(libraryNumber).equals(password)){
            return  true;
        }
        System.out.println("wrong password");
        return false;
    }
}
