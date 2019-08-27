package minesweeper.parser;

import minesweeper.acitivities.MineActivity;

public class StringParser {
	public MineActivity parseUserInput(String input){
		if(input == null || input.length() == 0){
			return null;
			
		}
		else  {
			input = input.replaceAll("[^A-Za-z0-9]", "");
			MineActivity  mineActivity = new MineActivity();
			mineActivity.setGridRowIndex(Character.getNumericValue(input.charAt(1)));
			mineActivity.setGridColumnndex(Character.getNumericValue(input.charAt(2)));
			mineActivity.setActivity(input.charAt(0));
			return mineActivity;
			
			
		}
		
		
	}

}
