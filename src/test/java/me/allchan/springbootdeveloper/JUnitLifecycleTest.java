package me.allchan.springbootdeveloper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitLifecycleTest {
    public JUnitLifecycleTest() {
        System.out.println("new JUnitLifecycleTest");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @Test
    void testA() {
        System.out.println("test A");
    }

    @Test
    void testB() {
        System.out.println("test B");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
        System.out.println();
    }
}
