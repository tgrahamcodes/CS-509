package starting.view;

import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import javax.swing.JPanel;
import starting.model.Model;

public class TrianglePuzzleDrawer extends JPanel {

	Model model;
	int rowNumber;
	int colNumber;
	private static final int PREF_W = 300;
	private static final int PREF_H = PREF_W;
	int i, j;
	
	/**
	 * Create the panel.
	 */
	public TrianglePuzzleDrawer(Model model){
		this.model = model;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// protects you when looking inside WindowBuilder
		if (model == null) { return; }

		int rowNumber;
		// do the math and figure out WHERE to draw all the boxes (nodes) lines (edges)
		
		// DRAW ENTIRE PUZZLE HERE...

		for (rowNumber=0; rowNumber < 3; rowNumber++){
			for(colNumber=0; colNumber < 5; colNumber++){
				if (rowNumber == 0 && colNumber == 0){
					Triangle_Shape triangleShape = new Triangle_Shape(new Point2D.Double(250, 0),
							new Point2D.Double(300, 100), new Point2D.Double(200, 100));
					Graphics2D g2d = (Graphics2D) g.create();
					g2d.draw(triangleShape);
				}
				if (rowNumber==1 && colNumber==0) {
					Triangle_Shape triangleShape2 = new Triangle_Shape(new Point2D.Double(200, 100),
							new Point2D.Double(250, 200), new Point2D.Double(150, 200));
					Graphics2D g2dd = (Graphics2D) g.create();
					g2dd.draw(triangleShape2);
				}
				if (rowNumber == 1 && colNumber==1){
					g.drawLine(250, 200, 300,100);
				}
				if (rowNumber == 1 && colNumber==2){
					Triangle_Shape triangleShape3 = new Triangle_Shape(new Point2D.Double(250, 200),
							new Point2D.Double(350, 200), new Point2D.Double(300, 100));
					Graphics2D g2ddd = (Graphics2D) g.create();
					g2ddd.draw(triangleShape3);
				}
				if (rowNumber == 2 && colNumber==0){
					Triangle_Shape triangleShape2 = new Triangle_Shape(new Point2D.Double(150, 200),
							new Point2D.Double(100, 300), new Point2D.Double(200, 300));
					Graphics2D g2dddd = (Graphics2D) g.create();
					g2dddd.draw(triangleShape2);
				}
				if (rowNumber == 2 && colNumber==1){
					g.drawLine(200, 300, 250,200);
				}
				if (rowNumber == 2 && colNumber==2){
					Triangle_Shape triangleShape3 = new Triangle_Shape(new Point2D.Double(250, 200),
							new Point2D.Double(200, 300), new Point2D.Double(300, 300));
					Graphics2D g2dddd = (Graphics2D) g.create();
					g2dddd.draw(triangleShape3);
				}
				if (rowNumber == 2 && colNumber==3){
					g.drawLine(300, 300, 350,200);
				}
				if (rowNumber==2 && colNumber==4){
					Triangle_Shape triangleShape4 = new Triangle_Shape(new Point2D.Double(350, 200),
							new Point2D.Double(400, 300), new Point2D.Double(300, 300));
					Graphics2D g2ddddd = (Graphics2D) g.create();
					g2ddddd.draw(triangleShape4);
				}
			}
		}
	}
	class Triangle_Shape extends Path2D.Double {
		public Triangle_Shape(Point2D... points) {
			moveTo(points[0].getX(), points[0].getY());
			lineTo(points[1].getX(), points[1].getY());
			lineTo(points[2].getX(), points[2].getY());
			closePath();
		}
	}
}
