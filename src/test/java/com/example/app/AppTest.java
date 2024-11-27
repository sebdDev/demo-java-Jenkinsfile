package com.example.app;

import org.junit.Test;
import static org.junit.Assert.*;

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
