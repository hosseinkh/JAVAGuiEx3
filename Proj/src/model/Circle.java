package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.MyComponent;

public class Circle {
	
	


	private final Point center;
	private final int r;
	
	public int getR() {
		return this.r;
	}
	

	public Circle(Point p, int r) {
		//this.p = p;
		this.center = new Point(p);	//copie defensive
		this.r = r;
	}

	public Circle translate(int dx, int dy) {
		return new Circle(center.translate(dx, dy), this.r);
	}

	@Override
	public String toString() {
		return center.toString() + " " + r + " " + surface();
	}

	public Point getPoint() {
		//return p;
		//copie defensive
		return new Point(center);
	}

	//@Override
	//public boolean equals(Object obj) {
	//	if(obj==this)return true;
	//	if(!(obj instanceof Circle)) return false;
	//	Circle c = (Circle)obj;
	//	return c.center.equals(center) && r==c.r;
	//}
	

	public double surface() {
		//pi.r^2
		return Math.PI*r*r;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	/*distance au carré*/
	private double squareDistance(Point p) {
		double dx = p.getX() - this.center.getX();
		double dy = p.getY() - this.center.getY();
		
		return  dx * dx + dy * dy;
	}
	
	public boolean contains(Point p) {
		//pythagore
		return squareDistance(p) <= r*r;
	}
	
	public static boolean contains(Point p, Circle...circles) {
		for(Circle c: circles) {
			if(c.contains(p))return true;
		}
		return false;
	}


	public void draw(Graphics g) {
		
		g.drawOval(this.getPoint().getX(), this.getPoint().getY(), this.getR(), this.getR());
		//Graphics2D g2d = (Graphics2D) g;
        //Ellipse2D.Double circle = new Ellipse2D.Double(this.getCenter().getX(), this.getCenter().getX(), this.getR(), this.getR());
        //g2d.fill(circle);
		
	}
	public boolean contain( Point p2) {
		return (Math.pow((this.getPoint().getX() - p2.getX()), 2) + Math.pow((this.getPoint().getY() - p2.getY()), 2)) <= Math.pow(this.getR() ,2);
	}


}
