package starting.model;
import java.awt.Color;

public class Edge {
	Color color;
	int edgeID;
	Node a,b;
	boolean isSelected;	
	
	/*
	 * Edge object contains:
	 * edgeId, integer from  0-9 
	 * color, Color object out of R,B,G 
	 * Node a, and node b
	 */
	public Edge(int edgeID, Color color, Node a, Node b) {
		this.edgeID = edgeID;
		this.color = color;
		this.a = a;
		this.b = b;
	}
}
