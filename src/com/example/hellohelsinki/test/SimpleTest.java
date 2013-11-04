package com.example.hellohelsinki.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SimpleTest extends TestCase {
	   /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SimpleTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SimpleTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Rigourous Test :-)
     */
    public void testOne()
    {
        assertEquals("10 x 5 must be 50", 50, 10 * 5);
    }
}
