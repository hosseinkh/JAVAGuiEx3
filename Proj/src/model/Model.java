package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import view.MyComponent;

public class Model{
    public static List<Circle> shapes = new ArrayList<>();
	//public static Circle shape;
    //public Boolean modified;
    //public MyComponent mc;
	public Model() {

		shapes.add(new Circle(new Point(180,300) , 80));

	}
	
	public void add(Circle c) {
		this.shapes.add(c);
	}
	
	//public void draw(Graphics g) {
      //  for (Drawable d : this.shapes) {
        //	d.draw(g);
        //}   
    //}

	//@Override
	//public String toString() {
	//	return this.shapes.toString();
	//}

}
