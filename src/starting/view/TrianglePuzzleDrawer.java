package starting.view;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import starting.model.Model;
import starting.model.Node;
import starting.model.Triangle;
import starting.model.TrianglePuzzle;


@SuppressWarnings("serial")
public class TrianglePuzzleDrawer extends JPanel {

	/**
	 * A class to draw the triangle puzzle game;
	 */
	Model model;
	int rowNumber;
	int colNumber;
	TrianglePuzzle puzzle;
	Node obj;
	Node selectedNode;
	ArrayList<Triangle> triangles = new ArrayList<Triangle>();
	
	/** 
	 * Create the panel.
	 */
	public TrianglePuzzleDrawer(Model model){
		this.model = model;
	}
	
	public Triangle computeTriangle(Node a, Node b, Node c) {
		Triangle tri = new Triangle(a, b, c);
		triangles.add(tri);
		return tri;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// protects you when looking inside WindowBuilder
		if (model == null) {
			return;
		}

		// do the math and figure out WHERE to draw all the boxes (nodes) lines (edges)


		// DRAW ENTIRE PUZZLE HERE...
		for (rowNumber=0; rowNumber < 3; rowNumber++){
			for(colNumber=0; colNumber < 5; colNumber++){
				if (rowNumber == 0 && colNumber == 0){
					Graphics2D g2d = (Graphics2D) g.create();
					Stroke stroke = new BasicStroke(6f);
					g2d.setStroke(stroke);
					g2d.setColor(Color.red);
					g2d.drawLine(250, 0, 300,100);

					g2d.setColor(Color.green);
					g2d.drawLine(300, 100, 200,100);
					g2d.setColor(Color.red);
					g2d.drawLine(250, 0, 200,100);

					g2d.setColor(Color.black);
					g2d.drawRect(195, 95, 10, 10);
					g2d.fillRect(195, 95, 10, 10);
				}
				if (rowNumber==1 && colNumber==0) {

					Graphics2D g2d = (Graphics2D) g.create();
					Stroke stroke = new BasicStroke(6f);
					g2d.setStroke(stroke);
					g2d.setColor(Color.blue); // l
					g2d.drawLine(200, 100, 250,200);
					g2d.setColor(Color.green); // b
					g2d.drawLine(250, 200, 150,200);
					g2d.setColor(Color.red); // r
					g2d.drawLine(200, 100, 150,200);

					g2d.setColor(Color.black);
					g2d.drawRect(195, 95, 10, 10);
					g2d.fillRect(195, 95, 10, 10);
					g2d.drawRect(295, 95, 10, 10);
					g2d.fillRect(295, 95, 10, 10);
				}
				if (rowNumber == 1 && colNumber==2){
					Graphics2D g2d = (Graphics2D) g.create();
					Stroke stroke = new BasicStroke(6f);
					g2d.setStroke(stroke);
					g2d.setColor(Color.green);
					g2d.drawLine(250, 200, 350,200);
					g2d.setColor(Color.red);
					g2d.drawLine(350, 200, 300,100);
					g2d.setColor(Color.blue);
					g2d.drawLine(250, 200, 300,100);

					g2d.setColor(Color.black);
					g2d.drawRect(195, 95, 10, 10);
					g2d.fillRect(195, 95, 10, 10);

					g2d.drawRect(295, 95, 10, 10);
					g2d.fillRect(295, 95, 10, 10);
				}
				if (rowNumber == 2 && colNumber==0){
					Graphics2D g2d = (Graphics2D) g.create();
					Stroke stroke = new BasicStroke(6f);
					g2d.setStroke(stroke);
					g2d.setColor(Color.red);
					g2d.drawLine(150, 200, 100,300);
					g2d.setColor(Color.green);
					g2d.drawLine(100, 300, 200,300);
					g2d.setColor(Color.blue);
					g2d.drawLine(150, 200, 200,300);

					g2d.setColor(Color.black);
					g2d.drawRect(195, 95, 10, 10);
					g2d.fillRect(195, 95, 10, 10);

					g2d.drawRect(295, 95, 10, 10);
					g2d.fillRect(295, 95, 10, 10);
				}
				if (rowNumber == 2 && colNumber==1){
					g.setColor(Color.black);
					g.drawLine(200, 300, 250,200);
				}
				if (rowNumber == 2 && colNumber==2){
					Graphics2D g2d = (Graphics2D) g.create();
					Stroke stroke = new BasicStroke(6f);
					g2d.setStroke(stroke);
					g2d.setColor(Color.blue);
					g2d.drawLine(250, 200, 200,300);
					g2d.setColor(Color.green);
					g2d.drawLine(200, 300, 300,300);
					g2d.setColor(Color.blue);
					g2d.drawLine(250, 200, 300,300);

					g2d.setColor(Color.black);
					g2d.drawRect(195, 95, 10, 10);
					g2d.fillRect(195, 95, 10, 10);

					g2d.drawRect(295, 95, 10, 10);
					g2d.fillRect(295, 95, 10, 10);
				}
				if (rowNumber==2 && colNumber==4){
					Graphics2D g2d = (Graphics2D) g.create();
					Stroke stroke = new BasicStroke(6f);
					g2d.setStroke(stroke);
					g2d.setColor(Color.red);
					g2d.drawLine(350, 200, 400,300);
					g2d.setColor(Color.green);
					g2d.drawLine(400, 300, 300,300);
					g2d.setColor(Color.blue);
					g2d.drawLine(350, 200, 300,300);

					g2d.setColor(Color.black);
					g2d.drawRect(195, 295, 10, 10);
					g2d.fillRect(195, 295, 10, 10);
					g2d.drawRect(145, 195, 10, 10);
					g2d.fillRect(145, 195, 10, 10);
					g2d.drawRect(95, 295, 10, 10);
					g2d.fillRect(95, 295, 10, 10);
					g2d.drawRect(295, 295, 10, 10);
					g2d.fillRect(295, 295, 10, 10);
					g2d.drawRect(245, 195, 10, 10);
					g2d.fillRect(245, 195, 10, 10);
					g2d.drawRect(245, 0, 10, 10);
					g2d.fillRect(245, 0, 10, 10);
					g2d.drawRect(345, 195, 10, 10);
					g2d.fillRect(345, 195, 10, 10);
					g2d.drawRect(395, 295, 10, 10);
					g2d.fillRect(395, 295, 10, 10);

				}
			}
		}
	}
}
