package starting.model;

public class Node {
	public int row;
	public int col;
	boolean selected = false;

	public Node() {
		this.selected = false;
	}
	
	public boolean getSelected(){
		return selected;
	}
	
	public void setSelected(){
		this.selected = true;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public void setCol(int col) {
		this.col = col;
	}

	public boolean contains(Coordinate c) {
		if (c.col >= col && c.col <= col + 10 && c.row >= row && c.row < row + 10) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getCol() {
		return this.col;
	}
	public int getRow() {
		return this.row;
	}
}
	