/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ed.uml.clock;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class NumberDisplayTest {
    NumberDisplay nd;    
    
    @Before
    public void setUp() {
        nd = new NumberDisplay(20);
    }

    @Test
    public void testSetGetValue() {
        nd.setValue(15);
        assertTrue(nd.getValue()==15);
        nd.setValue(-10);
        assertFalse(nd.getValue()==-10);
        assertTrue(nd.getValue()==15);
        nd.setValue(50);
        assertFalse(nd.getValue()==50);
        assertTrue(nd.getValue()==15);        
    }

    @Test
    public void testToString() {
        nd.setValue(4);
        assertTrue("04".equals(nd.toString()));
        nd.setValue(19);
        assertTrue("19".equals(nd.toString()));
        assertFalse("019".equals(nd.toString()));
    }


    @Test
    public void testIncrement() {
        nd.setValue(4);
        nd.increment();
        assertTrue(5==nd.getValue());
        nd.setValue(19);
        nd.increment();
        assertTrue(0==nd.getValue());
        nd.setValue(5);
        for (int i = 0; i < 20 ; i++) {
            nd.increment();
        }
        assertTrue(5==nd.getValue());
    }
    
}
