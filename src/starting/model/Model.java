package starting.model;

public class Model {
	TrianglePuzzle puzzle;
	int score;
	int numMoves;
	boolean isComplete;
	Node selectedNode;
	
	public Model() {
		puzzle = new TrianglePuzzle();
		// puzzle.add(n);
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
	
	public TrianglePuzzle getPuzzle() {
		return this.puzzle;
	}
	
	public void setSelectedNode(Node n) {
		this.selectedNode = n;
	}
	
	public Node getSelectedNode() {
		return this.selectedNode;
	}
	
	public void clearSelectedNode() {
		this.selectedNode = null;
	}
}