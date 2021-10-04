package starting.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class MouseHandler extends MouseAdapter {

	TrianglePuzzleApp app;
	Model model;
	
	public MouseHandler(Model model, TrianglePuzzleApp app) {
		this.model = model; 
		this.app = app;
	}
	
	@Override
    public void mousePressed(MouseEvent e) {
		System.out.println("You pressed on " + e.getPoint());
	}
}
