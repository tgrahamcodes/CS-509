package starting.model;

public class TrianglePuzzle {

	int rowNumber = 1;
    int colNumber = 1;
    int i = 0;
    int score = 0;
    int moves = 0;
    final int triangleNum = 6;
    boolean isWinner;
    
    public TrianglePuzzle(){

    }
    
    public boolean isWinner() {
    	return isWinner;
    }
    
    public boolean setWinner() {
    	isWinner = true;
    	return isWinner;
    }
}
