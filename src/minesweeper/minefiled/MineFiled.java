package minesweeper.minefiled;

import minesweeper.square.Square;

public class MineFiled {
	public static final int MINE_FILED_LENGTH = 3;
	public static final Square[][] MINE_FILED = new Square[MINE_FILED_LENGTH][MINE_FILED_LENGTH];

	public void loadInitialMindeFiled() {
		char[][] mindeData = { { 'x', 'x', 'm' }, { 'x', 'm', 'x' }, { 'x', 'x', 'x' } };
		for (int i = 0; i < mindeData.length; i++) {
			for (int j = 0; j < mindeData.length; j++) {
				MINE_FILED[i][j] = new Square(mindeData[i][j]);

			}

		}

	}

}
