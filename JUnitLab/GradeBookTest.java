package com.fgonzalesv.junitlab;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
    private GradeBook test1, test2;

    @Before
    public void setUp() throws Exception {
        test1 = new GradeBook(5);
        test1.addScore(99);
        test1.addScore(75);
        test1.addScore(83);
        test1.addScore(67);
        test2 = new GradeBook(5);
        test2.addScore(0);
        test2.addScore(97);
        test2.addScore(89);
    }

    @After
    public void tearDown() throws Exception {
        test1 = test2 = null;
    }

    @Test
    public void addScore() {
        assertTrue(test1.toString().equals("99.0 75.0 83.0 67.0 "));
        assertTrue(test2.toString().equals("0.0 97.0 89.0 "));
            }

    @Test
    public void sum() {
        assertEquals(324, test1.sum(), 0.001);
        assertEquals(186, test2.sum(), 0.001);
    }

    @Test
    public void minimum() {
        assertEquals(67, test1.minimum(), 0.001);
        assertEquals(0, test2.minimum(), 0.001);
    }

    @Test
    public void finalScore() {
        assertEquals(257, test1.finalScore(), 0.001);
        assertEquals(186, test2.finalScore(), 0.001);
    }
}
