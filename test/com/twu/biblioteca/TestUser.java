package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 4/23/16.
 */
public class TestUser {

    @Test
    public void testUser() {
        User user = new User("sunjing", "doudou","404891954@qq.com","smith street", "15091182408");
        assertEquals("sunjing", user.getName());
        assertEquals("doudou", user.getLibraryNumber());
        assertEquals("404891954@qq.com", user.getEmail());
        assertEquals("smith street", user.getAddress());
        assertEquals("15091182408", user.getPhoneNumber());

        user.setLibraryNumber("liujing");
        assertEquals("liujing", user.getLibraryNumber());

        user.setAddress("taibai road");
        assertEquals("taibai road", user.getAddress());

        user.setEmail("sj.xidian@gmail.com");
        assertEquals("sj.xidian@gmail.com", user.getEmail());

        user.setLibraryNumber("carrie");
        assertEquals("carrie", user.getLibraryNumber());

        user.setPhoneNumber("15829916976");
        assertEquals("15829916976", user.getPhoneNumber());
    }

}
