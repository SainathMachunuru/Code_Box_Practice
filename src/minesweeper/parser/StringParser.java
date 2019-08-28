package minesweeper.parser;

import minesweeper.acitivities.MineActivity;
import minesweeper.minefiled.MineFiled;

public class StringParser {
	public MineActivity parseUserInput(String input){
		if(input == null || input.length() == 0){
			return null;
			
		}
		else {
			input = input.replaceAll("[^A-Za-z0-9]", "");
			if(input.length()!=3) {
				return null;
				
			}
			else if(!isValid(input.charAt(0),Character.getNumericValue(input.charAt(1)),Character.getNumericValue(input.charAt(2)))) {
				return null;
			}
			else  {
			
				MineActivity  mineActivity = new MineActivity();
				mineActivity.setGridRowIndex(Character.getNumericValue(input.charAt(1)));
				mineActivity.setGridColumnndex(Character.getNumericValue(input.charAt(2)));
				mineActivity.setActivity(input.charAt(0));
				return mineActivity;
				
				
			}
			
		}
		
		
		
	}

	private boolean isValid(char activity, int gridRow, int gridColumn) {
		if(activity!='o' && activity!='f' ) {
			return false;
			
		}
		if(!(gridRow>=0 && gridRow<MineFiled.MINE_FILED_LENGTH)) {
			return false;
			
		}
		if(!(gridColumn>=0 && gridColumn<MineFiled.MINE_FILED_LENGTH)) {
			return false;
			
		}
		return true;
	}

}
