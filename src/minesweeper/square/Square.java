package minesweeper.square;

public class Square {

	private char val;
	private boolean isMined;
	private boolean isFlaged;

	public Square() {
	}

	public Square(char val) {
		this.val = val;

	}

	public char getVal() {
		return val;
	}

	public void setVal(char val) {
		this.val = val;
	}

	public boolean isMined() {
		return isMined;
	}

	public void setMined(boolean isMined) {
		this.isMined = isMined;
	}

	public boolean isFlaged() {
		return isFlaged;
	}

	public void setFlaged(boolean isFlaged) {
		this.isFlaged = isFlaged;
	}

}
