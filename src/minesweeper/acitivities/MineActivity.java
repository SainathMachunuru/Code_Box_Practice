package minesweeper.acitivities;

public class MineActivity {

	private int gridRowIndex;
	private int gridColumnndex;
	private char activity;

	public MineActivity() {

	}

	public MineActivity(int gridRowIndex, int gridColumnndex, char activity) {
		this.gridRowIndex = gridRowIndex;
		this.gridColumnndex = gridColumnndex;
		this.activity = activity;
	}

	public int getGridRowIndex() {
		return gridRowIndex;
	}

	public void setGridRowIndex(int gridRowIndex) {
		this.gridRowIndex = gridRowIndex;
	}

	public int getGridColumnndex() {
		return gridColumnndex;
	}

	public void setGridColumnndex(int gridColumnndex) {
		this.gridColumnndex = gridColumnndex;
	}

	public char getActivity() {
		return activity;
	}

	public void setActivity(char activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "MineActivity [gridRowIndex=" + gridRowIndex
				+ ", gridColumnndex=" + gridColumnndex + ", activity="
				+ activity + "]";
	}
	
	

}
