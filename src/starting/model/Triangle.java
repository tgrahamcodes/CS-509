package starting.model;

public class Triangle {
	
	final int numEdges = 3;
	int i, j, k =0;
	Node a, b, c;
	boolean flag = false;
	
	public Triangle(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public void setStart(){
		flag = true;
	}
}
	

