package com.kylechamberlin.projectEuler.utils;

import java.math.BigInteger;

public class FactorialTest {
	
	protected static BigInteger[] list;
	protected int currentPrime;
	protected int currentIndex;
	protected int limit;
	
	
	public FactorialTest(int pN){
		list = listFactorials(pN);		
	}
	
	public BigInteger[] listFactorials(int pB) { 
		BigInteger[] fl = new BigInteger[pB + 1]; 
		fl[0] = BigInteger.ONE;
		for(int i = 1; i<=pB; i++){
			fl[i]=fl[i-1].multiply(new BigInteger(""+i));
		}
	    return fl;
	}
	
	public BigInteger getNfact(int pN){
		if (list.length > pN){
			return list[pN];
		}
		list = listFactorials(pN);
		return list[pN];
	}

}
