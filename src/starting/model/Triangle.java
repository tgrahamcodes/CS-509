package starting.model;

import java.util.ArrayList;
import starting.model.Edge;
import java.awt.Color;

public class Triangle {
	
	final int numEdges = 3;
	int i = 1;
	int triangleNum;
	boolean flag = false;
	int position = 0;
	Color color;
	Edge e;
	
	ArrayList<Edge> edges = new ArrayList<Edge>();
	
	// 		   /1\
	//		  /2\/3\
	//		 /4\/5\/6\
	
	public Triangle() {
		while (i <= numEdges) {
			e = new Edge(i, color);
			edges.add(e);
			i++;
		}
	}

	public void setStart(){
		flag = true;
	}
	
	// out of six positions
	// 1 being top, 2 and 3 second row, 4, 5, and 6 third row
	public void setTriangleNumber(int triangleNum){
		this.triangleNum = triangleNum;
	}
	
	public int getTriangleNumber() {
		return triangleNum;
	}
	
	public ArrayList<Edge> getEdgeArrayList(){
		return edges;
	}
}
	

