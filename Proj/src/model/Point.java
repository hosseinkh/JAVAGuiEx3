package model;


public class Point {
	
	private final int x;
	private final int y;
	private static int nbPoint;
	private int id;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		id = nbPoint++;
		
	}
	
	public Point (Point p2) {
		x = p2.x;
		y = p2.y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public int getId() {
		return nbPoint;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {return true;}
		if (obj instanceof Point) {
			Point p = (Point) obj;
			if (p.x == this.x && p.y == this.y) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public Point translate(int dx , int dy) {
		Point p = new Point (this.x + dx , this.y + dy);
		return p;
	}

}
