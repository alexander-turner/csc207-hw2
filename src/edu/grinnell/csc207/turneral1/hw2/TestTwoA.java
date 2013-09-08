package edu.grinnell.csc207.turneral1.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {
    @Test
    public void test_isOdd() {
	assertEquals("zero", false, TwoA.isOdd(0));
	for(int i = 1; i<500; i+=2){
	    assertEquals("positive even", true, TwoA.isOdd(2*i));
	    assertEquals("positive odd", false, TwoA.isOdd(i));
    	    assertEquals("negative even", true, TwoA.isOdd(-2*i));
    	    assertEquals("negative odd", false, TwoA.isOdd(-1*i));
	} // for
    } // test_isOdd
    

}
