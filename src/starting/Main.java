package starting;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;
import java.awt.FlowLayout;

public class Main {
	public static void main(String[] args) {
		Model myModel = new Model();
		TrianglePuzzleApp triangle = new TrianglePuzzleApp(myModel);
		triangle.getPanel().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		triangle.setVisible(true);
	}
}
