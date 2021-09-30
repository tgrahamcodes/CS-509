package starting.model;
import java.awt.Color;
import java.util.ArrayList;

public class Edge {
	Color color;
	Edge edge;
	boolean isSelected;
	int position;
	Triangle triangle;
	
	public Edge(int position, Color color) {
		this.isSelected = false;
		this.position = position;
		this.color = color;
	}

	public boolean isSelected() {
		return this.isSelected;
	}
	
	public void setSelected() {
		this.isSelected = true;
	}
	
	public void swapColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getEdgeNum() {
		return this.position;
	}
	

}
