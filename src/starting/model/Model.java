package starting.model;

public class Model {
	TrianglePuzzle puzzle;
	int score;
	int numMoves;
	boolean isComplete;
	
	public Model() {
		puzzle = new TrianglePuzzle();
		this.score = puzzle.score;
	}
	
	public int computeScore() {
		return score;
	}
	
	public boolean isComplete() {
		isComplete = true;
		return isComplete;
	}
	
	public void swapEdges(Node a, Node b, Node c) {
		
	}
	
	public void resetPuzzle() {
		this.puzzle = new TrianglePuzzle();
	}
}