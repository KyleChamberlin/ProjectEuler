package com.kylechamberlin.projectEuler.utils;

import java.util.BitSet;

public class PrimesTest {
	
	protected BitSet list;
	protected int currentPrime;
	protected int currentIndex;
	protected int limit;
	
	
	public PrimesTest(int pN){
		this.limit = pN;
		list = primeSieve(limit);
		this.currentPrime = 2;		
	}
	
	public BitSet primeSieve(int pB) { 
	    BitSet pl = new BitSet(pB>>1); 
	    pl.set(0,pl.size(),true); 

	    int sqrt = (int) Math.sqrt(pB); 
	    pl.clear(0); 
	    for(int n = 3; n <= sqrt; n+=2) 
	    { 
	        if( pl.get(n >> 1) ) 
	        { 
	            int i = n << 1;
	            for(int f = n * n; f < pB; f += i) 
	            { 
	                    pl.clear(f >> 1); 
	            } 
	        } 
	    } 
	    return pl;
	}
	
	public int nextPrime() {
		currentIndex++;
		currentIndex = list.nextSetBit(currentIndex);
		this.currentPrime = currentIndex*2 +1;
		return currentPrime;
	}
	
	public boolean isPrime(int num) 
	{ 
	    if( num < limit)
	    {
	        if( (num & 1) == 0) 
	            return ( num == 2); 
	        else 
	            return list.get(num>>1);
	    }
	    return false;
	}	
}
