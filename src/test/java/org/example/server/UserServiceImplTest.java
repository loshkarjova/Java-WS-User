package org.example.server;

import org.example.client.generated.Gender;
import org.example.client.generated.UserServiceImpl;
import org.example.client.generated.UserServiceImplService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    static UserServiceImplService service;
    static UserServiceImpl userService;

    @BeforeAll
    static void setUp(){
        service = new UserServiceImplService();
        userService = service.getUserServiceImplPort();
    }

    @Test
    void findByName_user1_Tom() {
        assertEquals("Tom",userService.findByName("Tom").getName());
    }

    @Test
    void findByName_user2_Age() {
        assertEquals(30,userService.findByName("Ann").getAge());
    }

    @Test
    void findByName_user3_Gender() {
        assertEquals(Gender.MALE,userService.findByName("Bill").getGender());
    }

}
