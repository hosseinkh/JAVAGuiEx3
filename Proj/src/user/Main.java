package user;

import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

import controller.Controller;
import model.Model;
import view.MyComponent;

public class Main {
	
	public static void main(String[] args) {
		MyComponent mc = new MyComponent();
		Model m = new Model();
		Controller c = new Controller(m,mc);
		
	}

}
