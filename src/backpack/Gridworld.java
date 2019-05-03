package backpack;

import java.awt.Component;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class Gridworld {
	Bug bug= new Bug();
	
    JFrame jframe= new JFrame("World Created");
    JPanel jpanel= new JPanel();
   
	Flower flower= new Flower();
	
	
	
	public Gridworld() {
		
		
	}
	
	public void show() {
		
		jframe.setSize(800, 800);
		jpanel.add(bug.image);
		jframe.add(jpanel);
		jframe.setVisible(true);

	}
	public void add(Location loc, Actor occupant) {
	
	}
}
