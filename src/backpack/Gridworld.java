package backpack;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class Gridworld {
    JFrame jframe= new JFrame("World Created");
    JPanel jpanel= new JPanel();
    Bug bug= new Bug();
	Flower flower= new Flower();
	
	
	
	public Gridworld() {
		
	}
	public void show() {
		jframe.setSize(800, 800);
		jframe.setVisible(true);
	}
	public void add(Location loc, Actor occupant) {
		jpanel.add(jlabel);
	}
}
