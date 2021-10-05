package starting.model;

public class Coordinate {
	public int row, col;

    public Coordinate(int row, int col){
    	this.row = row;
    	this.col = col;
    }

    public String toString(){
        return "(" + row + "," + col + ")";
    }
}
