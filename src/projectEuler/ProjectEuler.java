/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectEuler;

/**
 *
 * @author kylec
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	long startTime = System.currentTimeMillis();
    	Problem27 problem = new Problem27();
    	long endTime = System.currentTimeMillis();
    	

    	System.out.println(problem.getAnswer());
    	System.out.println((endTime - startTime) + " ms");
    
    }
    
}
