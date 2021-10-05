package starting.model;

import java.util.ArrayList;
import java.util.Iterator;

public class TrianglePuzzle implements Iterable<Node>{
	
	ArrayList<Node> nodes = new ArrayList<>();

	public final int numCols = 3;
	public final int numRows = 3;
    
    public TrianglePuzzle() {
    }
    
    public void add(Node n, int row, int col) {
    	n.setCol(col);
    	n.setRow(row);
    	nodes.add(n);
    }

	@Override
	public Iterator<Node> iterator() {
		return nodes.iterator();
	}
    
    
}
