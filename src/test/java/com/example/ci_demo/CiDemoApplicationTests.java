package com.example.ci_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiDemoApplicationTests {

    @Autowired
    TestService testService;

    @Test
    void contextLoads() {

    }

    @Test
    public void testAddition() {
        assertEquals(5, testService.addUp(2, 3));
    }



}
