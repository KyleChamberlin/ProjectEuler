package com.kylechamberlin.projectEuler;

import com.kylechamberlin.projectEuler.solutions.*;


/**
 *
 * @author kylec
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Solution problem = new Problem6();

    	long startTime = System.currentTimeMillis();
    	problem.solve();
    	long endTime = System.currentTimeMillis();
    	

    	System.out.println(problem.solution());
    	System.out.println((endTime - startTime) + " ms");

    
    }
    
}
