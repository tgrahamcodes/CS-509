package starting.model;

public class Node {
	final int idNumber;
	boolean selected = false;

	public Node(int idNumber) {
		this.idNumber = idNumber;
		this.selected = false;
	}
	
	public boolean getSelected(){
		return selected;
	}
	
	public void setSelected(){
		this.selected = true;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
}
	