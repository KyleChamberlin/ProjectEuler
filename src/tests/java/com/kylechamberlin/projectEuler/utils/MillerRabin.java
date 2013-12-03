package projectEuler;

/* Copyright (c) 2012 the authors listed at the following URL, and/or
 * the authors of referenced articles or incorporated external code:
 * http://en.literateprograms.org/Miller-Rabin_primality_test_(Java)?action=history&offset=20111215044139
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sub-license, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Retrieved from: http://en.literateprograms.org/Miller-Rabin_primality_test_(Java)?oldid=17585
 */

import java.math.BigInteger;
import java.util.Random;

public class MillerRabin
{
    private static final Random rnd = new Random();

    private static boolean miller_rabin_pass(BigInteger a, BigInteger n) {
        BigInteger n_minus_one = n.subtract(BigInteger.ONE);
        BigInteger d = n_minus_one;
	int s = d.getLowestSetBit();
	d = d.shiftRight(s);
        BigInteger a_to_power = a.modPow(d, n);
        if (a_to_power.equals(BigInteger.ONE)) return true;
        for (int i = 0; i < s-1; i++) {
            if (a_to_power.equals(n_minus_one)) return true;
            a_to_power = a_to_power.multiply(a_to_power).mod(n);
        }
        if (a_to_power.equals(n_minus_one)) return true;
        return false;
    }

    public static boolean miller_rabin(BigInteger n) {
        for (int repeat = 0; repeat < 20; repeat++) {
            BigInteger a;
            do {
                a = new BigInteger(n.bitLength(), rnd);
            } while (a.equals(BigInteger.ZERO));
            if (!miller_rabin_pass(a, n)) {
                return false;
            }
        }
        return true;
    }
    
    public MillerRabin(){
    	   	
    }
    
    public boolean test(String pN){
    	BigInteger n = new BigInteger(pN);
    	return miller_rabin(n);
    }
    
    public boolean test(BigInteger pN){
    	BigInteger n = pN;
    	return miller_rabin(n);
    }
    
    public BigInteger genPrime(int pBits){
    	BigInteger p;
    	do {
            p = new BigInteger(pBits,rnd);
            if (p.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) continue;
			if (p.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) continue;
			if (p.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO)) continue;
			if (p.mod(BigInteger.valueOf(7)).equals(BigInteger.ZERO)) continue;
        } while (!miller_rabin(p));
    	return p;    	
    }
}
