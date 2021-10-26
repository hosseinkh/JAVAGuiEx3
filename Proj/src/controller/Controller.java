package controller;

import java.lang.Math;
import java.util.List;

import javax.swing.JFrame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import model.Circle;
import model.Model;
import model.Point;
import view.MyComponent;

public class Controller implements MouseMotionListener {
	Model m;
	MyComponent mc;

	// JFrame frame ;
	public Controller(Model m, MyComponent mc) {
		// frame = new JFrame();
		this.mc = mc;
		this.m = m;
		mc.frame.addMouseMotionListener(this);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setSize(800,800);

		// setVisible(true);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}
 
	
	public void mouseMoved(MouseEvent e) {
        //boolean flag = false;
		List<Circle> shapes = m.shapes;

		Circle c = shapes.get(shapes.size() - 1);
		
		System.out.println(e.getX());
		System.out.println(e.getY());

		
			System.out.println("works");
			m.add(new Circle(new Point(e.getX(), e.getY()), c.getR()));
			mc.drawing();
			
		}
		
		

	

	public double distance(Point p1, Point p2) {
		return Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2);
	}

}
