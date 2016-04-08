/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class FirstTestTest {
    
    public FirstTestTest() {
    }

    /**
     * Test of main method, of class FirstTest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FirstTest.main(args);
        assertEquals(1,1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
