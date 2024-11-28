package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    /**
     * Test qui réussit.
     */
    @Test
    public void testApp() {
        assertTrue("Ce test doit réussir", true);
    }

    /**
     * Test qui échoue avec assertFalse.
     */
    @Test
    public void testAssertFalse() {
        assertFalse("Ce test échoue intentionnellement.", true);
    }
}
