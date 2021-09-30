package starting;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class Main {
	public static void main(String[] args) {
		Model myModel = new Model();
		TrianglePuzzleApp triangle = new TrianglePuzzleApp(myModel);
		triangle.setVisible(true);
	}
}
