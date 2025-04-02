package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MySpringBootApp.class) // Specify the main application class
public class MySpringBootAppTests {

    @Test
    void contextLoads() {
        // This test ensures the Spring application context loads successfully
    }
}