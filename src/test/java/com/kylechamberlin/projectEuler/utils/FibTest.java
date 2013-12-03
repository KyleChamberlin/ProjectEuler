package com.kylechamberlin.projectEuler.utils;

public class FibTest {
	
	double phi = 1.618033988749894848204586834365638117720309179805762862135448622705260462;
	
	public FibTest(){
	
	}
	
	public long fibn(long pN){
		long val = (long) Math.ceil( Math.pow(phi, pN) / Math.sqrt(5) );
		return val;
	}
	
	public boolean isFib(int pN) 
	{ 
		boolean isfib = false;
	    int check = 5*(pN*pN)+4;
	    int check2 = 5*(pN*pN)-4;
	    int checkSqrt = (int) Math.sqrt(check);
	    int check2Sqrt = (int) Math.sqrt(check2);
	    
	    if (check == checkSqrt*checkSqrt || check2 == check2Sqrt*check2Sqrt){
	    	isfib = true;
	    }
	    return isfib;	    
	}	
}