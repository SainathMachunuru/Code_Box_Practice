package minesweeper.minefiled;

import minesweeper.square.Square;

public class MineFiled {
	public static final int MINE_FILED_LENGTH = 3;
	public static final Square[][] MINE_FILED = new Square[MINE_FILED_LENGTH][MINE_FILED_LENGTH];

	public void loadInitialMindeFiled() {
		char[][] mindeData = { { 'x', 'x', 'm' }, { 'x', 'm', 'x' },
				{ 'x', 'x', 'x' } };
		for (int i = 0; i < mindeData.length; i++) {
			for (int j = 0; j < mindeData.length; j++) {
				MINE_FILED[i][j] = new Square(mindeData[i][j]);

			}

		}

	}

	public void displayGrid() {
		for (int i = 0; i < MINE_FILED_LENGTH; i++) {
			for (int j = 0; j < MINE_FILED_LENGTH; j++) {
				if (MINE_FILED[i][j].isOpened) {
					System.out.print(MINE_FILED[i][j].val + " ");
				} else if (MINE_FILED[i][j].isFlaged) {
					System.out.print("f ");
				} else {
					System.out.print("x ");

				}

			}
			System.out.println();

		}
		System.out.println("-----------");
		

	}

	public Square open(int gridRowIndex, int gridColumnndex) {
		MINE_FILED[gridRowIndex][gridColumnndex].setOpened(true);
		if (MINE_FILED[gridRowIndex][gridColumnndex].val == 'x') {
			int adjMines = getAdjacentMineSquares(gridRowIndex, gridColumnndex);
			MINE_FILED[gridRowIndex][gridColumnndex]
					.setVal((char) (adjMines + '0'));
			MINE_FILED[gridRowIndex][gridColumnndex].setFlaged(false);
			return MINE_FILED[gridRowIndex][gridColumnndex];

		} else if (MINE_FILED[gridRowIndex][gridColumnndex].val == 'm') {
			MINE_FILED[gridRowIndex][gridColumnndex].setMined(true);
			return MINE_FILED[gridRowIndex][gridColumnndex];
		}
		return null;

	}

	public void flag(int gridRowIndex, int gridColumnndex) {
			MINE_FILED[gridRowIndex][gridColumnndex].setFlaged(true);
	}
	

	private int getAdjacentMineSquares(int gridRowIndex, int gridColumnndex) {
		int count = 0;
		if (gridRowIndex + 1 < MINE_FILED_LENGTH
				&& MINE_FILED[gridRowIndex + 1][gridColumnndex].val == 'm') {
			count++;
		}
		if (gridRowIndex - 1 >= 0
				&& MINE_FILED[gridRowIndex - 1][gridColumnndex].val == 'm') {
			count++;
		}
		if (gridColumnndex + 1 < MINE_FILED_LENGTH
				&& MINE_FILED[gridRowIndex][gridColumnndex + 1].val == 'm') {
			count++;
		}
		if (gridColumnndex - 1 >= 0
				&& MINE_FILED[gridRowIndex][gridColumnndex - 1].val == 'm') {
			count++;
		}

		return count;
	}

	public boolean checkForWin() {
		for (int i = 0; i < MINE_FILED_LENGTH; i++) {
			for (int j = 0; j < MINE_FILED_LENGTH; j++) {
				if (!MINE_FILED[i][j].isOpened) {
					if (MINE_FILED[i][j].isFlaged && MINE_FILED[i][j].val!='m') {
						return false;
						
					}
					else if (!MINE_FILED[i][j].isFlaged && MINE_FILED[i][j].val == 'x') {
						return false;
						
					}
					
					
				} 
				 

			}
			

		}
		return true;
	}

	public boolean isOpened(int gridRowIndex, int gridColumnndex) {
		// TODO Auto-generated method stub
		return MINE_FILED[gridRowIndex][gridColumnndex].isOpened;
	}

}
