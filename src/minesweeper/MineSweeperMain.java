package minesweeper;

import java.util.Scanner;

import minesweeper.acitivities.MineActivity;
import minesweeper.minefiled.MineFiled;
import minesweeper.parser.StringParser;
import minesweeper.square.Square;

public class MineSweeperMain {
	private static MineFiled mineFiled = new MineFiled();
	private static StringParser parser = new StringParser();
	
	public static void main(String[] args) {
		
		mineFiled.loadInitialMindeFiled();
		run();
	}
	public static void run() {
		Scanner sc = new Scanner(System.in);
		String input = "";
		mineFiled.displayGrid();
		while (true) {
			System.out.println("Enter your action[eg: o(1,1)/f(0,2))");
			input = sc.next();
			MineActivity mineActivity = parser.parseUserInput(input);
			if(mineActivity == null) {
				System.out.println("Invalid Input.Please enter agian...");
				
			}
			else {
				if(mineActivity.getActivity() == 'o'){
					Square mindeSqure = mineFiled.open(mineActivity.getGridRowIndex(),mineActivity.getGridColumnndex());
					mineFiled.displayGrid();
					if(mindeSqure.isMined){
						System.out.println("Oops! You stepped on a mine! Game over! ");
						break;	
						
					}
					if(mineFiled.checkForWin()){
						System.out.println("Wow! You cleared the minefield! Game over!  ");
						break;
						
					}
					
				}
				else if(mineActivity.getActivity() == 'f'){
					if(mineFiled.isOpened(mineActivity.getGridRowIndex(),mineActivity.getGridColumnndex())){
						System.out.println("It is already opened... please select other to proceed ");
						
					}
					else{
						mineFiled.flag(mineActivity.getGridRowIndex(),mineActivity.getGridColumnndex());
						mineFiled.displayGrid();
						if(mineFiled.checkForWin()){
							System.out.println("Wow! You cleared the minefield! Game over!  ");
							break;
							
						}
						
					}
					
					
				}
				
			}
			
			
			//mineFiled.displayGrid();
			
		}
		
	}

}
