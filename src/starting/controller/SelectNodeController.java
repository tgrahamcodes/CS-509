package starting.controller;

import java.awt.Point;

import starting.model.Coordinate;
import starting.model.Model;
import starting.model.TrianglePuzzle;
import starting.view.TrianglePuzzleApp;
import starting.model.Node;

public class SelectNodeController {
	
	TrianglePuzzleApp app;
	Model model;
	
    public SelectNodeController(Model model, TrianglePuzzleApp app) {
        this.model = model;
        this.app = app;
    }

	public void process(Point point) {
		Coordinate c = app.getPanel().pointToCoordinate(point);
		TrianglePuzzle puzzle = model.getPuzzle();
		
		System.out.println(c);
		for (Node n: puzzle) {
			if (n.contains(c)) {
				model.clearSelectedNode();
				model.setSelectedNode(n);
				app.repaint();
			}
		}
	}
}
