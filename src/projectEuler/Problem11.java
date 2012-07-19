package projectEuler;

import java.io.*;
import java.util.Scanner;

public class Problem11 {

	long answer = 0;
	int[][] grid = new int[20][20];
	
	/**
	 * 
	 * @param args
	 */
	public Problem11(){
		loadData();
		for(int x1 = 0; x1<20;x1++){
			
			for(int y1=0;y1 < 20;y1++){
				if(grid[x1][y1] > 0){
					long dow = down(x1,y1);
					long acc = across(x1,y1);
					long dia1 = diagP(x1,y1);
					long diaN = diagN(x1,y1);

					long highest1 = (dow > acc)?dow:acc;
					long highest2 = (dia1 > diaN)?dia1:diaN;
					long highest = (highest1>highest2)?highest1:highest2;
					if(highest > answer){
						answer = highest;	
					}
				}
			}
		}
		
		
	}
		
	public long getAnswer(){
		return answer;
	}
	
	private long down(int pX, int pY){
		long val = 1;
		if(pY+4 > 20){
			return 0;
		}
		for(int x = pX, y = pY; y < pY +4; y++){
			val *= grid[x][y];
		}
		return val;
	}

	private long across(int pX, int pY){
		long val = 1;
		if(pX+4 > 20){
			return 0;
		}
		for(int x = pX, y = pY; x < pX +4; x++){
			val *= grid[x][y];
		}
		return val;
	}
	
	private long diagP(int pX, int pY){
		long val = 1;
		if(pX+4 > 20 || pY+4 > 20){
			return 0;
		}
		for(int x = pX, y = pY; x < pX + 4;y++, x++){
			val *= grid[x][y];
		}		
		return val;
	}
	
	private long diagN(int pX, int pY){
		long val = 1;
		if(pX-3 < 0 || pY+4 >20){
			return 0;
		}
		for(int x = pX, y = pY; y < pY +4;y++, x--){
			val *= grid[x][y];
		}
		return val;
	}
	
	private void loadData(){
		try{
			FileInputStream fis = new FileInputStream("C:/GitCode/ProjectEuler/data/Problem11.txt");
			Scanner scanner = new Scanner(fis);
			
			for(int y = 0; y < 20; y++)
			{
				
				String in = scanner.nextLine();
				String[] temp = in.split(" ");
				for(int x = 0; x < 20; x++){
					grid[x][y] = Integer.parseInt(temp[x]);
				}
			}
			scanner.close();
			fis.close();	
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("ërr");
		}
	}
}
