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
public class ClockDisplayTest {
    
    ClockDisplay cd;
    
    @Before
    public void setUp() {
        cd = new ClockDisplay();
    }
    
    @Test
    public void testConstructors() {
        ClockDisplay cd1 = new ClockDisplay(3,5);
        assertTrue(cd1.toString().equals("03:05"));
    }

    @Test
    public void testTimeTick() {
        cd.setTime(20,50);
        cd.timeTick();
        assertTrue(cd.getTime().equals("20:51"));
        cd.setTime(20,59);
        cd.timeTick();
        assertTrue(cd.getTime().equals("23:00"));
        cd.setTime(23,59);
        cd.timeTick();
        assertTrue(cd.getTime().equals("00:00"));
        
    }

    public void testSetTime() {
        cd.setTime(20,07);
        assertTrue(cd.getTime().equals("20:07"));
    }

    @Test
    public void testGetTime() {
        assertTrue(cd.getTime().equals("00:00"));
        cd.setTime(10,5);
        assertTrue(cd.getTime().equals("10:05"));
        cd.setTime(30,30);
        assertTrue(cd.getTime().equals("10:30"));
    }

    @Test
    public void testToString() {
        assertTrue(cd.toString().equals("00:00"));
        cd.setTime(10,5);
        assertTrue(cd.toString().equals("10:05"));
        cd.setTime(30,30);
        assertTrue(cd.toString().equals("10:30"));
    }
    
}
