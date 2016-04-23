package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 4/23/16.
 */
public class TestUserAccount {
    @Test
    public void testLogin(){
        UserAccount userAccount = new UserAccount();
        assertEquals(true, userAccount.login("doudou", "123456"));
        assertEquals(false, userAccount.login("tiantian", "123456"));
    }
}
