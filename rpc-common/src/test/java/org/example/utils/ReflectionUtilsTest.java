package org.example.utils;

/**
 * @author Sizhe
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class ReflectionUtilsTest {

    @Test
    public void newInstance() {
        TestClass t = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    @Test
    public void getPublicMethods() {
    }

    @Test
    public void invoke() {
    }
}