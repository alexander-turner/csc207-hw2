package edu.grinnell.csc207.turneral1.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {
	@Test
	public void test_isMultiple() {
		assertEquals("none")
	} // test_isMultiple
	
    @Test
    public void test_isOdd() {
	assertEquals("zero", false, TwoA.isOdd(0));
	for(int i = 1; i<500; i+=2){
	    assertEquals("positive even", true, TwoA.isOdd(2*i));
	    assertEquals("positive odd", false, TwoA.isOdd(i));
    	    assertEquals("negative even", true, TwoA.isOdd(-2*i));
    	    assertEquals("negative odd", false, TwoA.isOdd(-1*i));
	} // for
	// INCLUDE TESTS FOR MAX INT
    } // test_isOdd
    
    @Test
    public void test_oddSumTo() {
    	
    } // test_oddSumTo
   
    @Test
    public void test_isOddProd() {
    	
    } // test_isOddProd
    
    @Test
    public void test_allDistinct() {
    	assertEquals(")
    } // test_allDistinct
    
    @Test
    public void test_reverseInts() {
    	
    } // test_reverseInts
}
