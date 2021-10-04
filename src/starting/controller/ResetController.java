package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class ResetController {

	TrianglePuzzleApp app;
	Model model;
	
	public ResetController(Model model, TrianglePuzzleApp app) {
		this.model = model;
		this.app = app;
	}
	
	public void process() {
		Model n = new Model();
		TrianglePuzzleApp a =  new TrianglePuzzleApp(n);
		this.app = a;
		System.out.println("You clicked Reset!");
	}
}
