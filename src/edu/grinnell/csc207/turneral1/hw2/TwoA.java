package edu.grinnell.csc207.turneral1.hw2;

public class TwoA {
        /*
         * Checks if a is a multiple of b.
         */
    	public static boolean isMultiple(long a, long b) {
    	    int i;
    	    for(i = 1; b*i < a; i++);
            return (b*i == a);    
    	}
    	/*
    	 * Checks if an integer is odd.
    	 */
    	public static boolean isOdd(int i) {
    	    int half_i = i << 1;
    	    return (i != 0) && (i == (half_i >> 1));
    	}
    	/*
    	 * Sums the positive odd numbers < n.
    	 */
    	public static int isOddProd(int n) {
    	    int sum = 0;
    	    for(int i = 1; i < n; i+=2)
    	        sum += i;
    	    return sum;
    	}
}
