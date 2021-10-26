package view;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import model.*;

public class MyComponent extends JPanel {

	Model m;
	public JFrame frame;

	public MyComponent() {
		m = new Model();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		// frame.addMouseMotionListener(this);
		frame.getContentPane().add(this);

		// mc.drawing();
		frame.setVisible(true);
	}

	public void drawing() {
       System.out.println("Drawing");
		repaint();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		// for (Drawable e:d) {
		System.out.println(m);
		System.out.println(m.shapes.size());
        for (int i = 0; i<m.shapes.size();i++) {
		//for (Drawable e : m.shapes) {
		    System.out.println("in paint"+ m);
			m.shapes.get(i).draw(g);

		}
	}

}
