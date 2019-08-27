package minesweeper.square;

public class Square {

	public char val;
	public boolean isMined;
	public boolean isFlaged;
	public boolean isOpened;

	

	public Square() {
	}

	public Square(char val) {
		this.val = val;

	}

	public void setVal(char val) {
		this.val = val;
	}

	public void setMined(boolean isMined) {
		this.isMined = isMined;
	}

	public void setFlaged(boolean isFlaged) {
		this.isFlaged = isFlaged;
	}

	public void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}



}
