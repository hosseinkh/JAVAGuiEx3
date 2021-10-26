package model;

import java.awt.Graphics;

public abstract class Drawable {
	protected final Point p;
	protected final int x,y;
	
	
	
	public Drawable(Point p , int x, int y) {
		this.p = new Point(p);
		this.x = x;
		this.y = y;
	}
	
	public int getR() {
		return x;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point getPoint() {
		return p;
	}
	public abstract void draw(Graphics g);
	public abstract boolean contain(Point p);
}
