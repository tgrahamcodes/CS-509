package starting.model;

import java.util.ArrayList;

public class Triangle {
	
	final int numEdges = 3;
	int i = 1;
	int row;
	int col;
	Node a, b, c;
	boolean flag = false;

	ArrayList<Node> nodes = new ArrayList<Node>();
	
	// 	R1	   /1\
	//	R2	  /2\/3\
	//	R3	 /4\/5\/6\
	
	public Triangle(Node a, Node b, Node c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setStart(){
		flag = true;
	}
	
	public int getRow(){
		return row;
	}

	public int getCol(){
		return col;
	}
}
	

