package backpack;

import java.awt.Color;
import java.awt.Component;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

public static void main(String[] args) {
	
	Random rand= new Random();
	int row= rand.nextInt(10);
	int column=rand.nextInt(10);
	
	
	Color color= new Color(0,0,255);
	
	World world= new World();
	world.show();

	
	Bug bug= new Bug();
	bug.setColor(color);
	Location location= new Location(5,5);
	Location secondlocation= new Location(row,column);
	bug.turn();
	bug.turn();

	
	
	world.add(secondlocation, bug);//random
	world.add(location, bug);
	
	Flower flower= new Flower();
	Location left= new Location(row-1,column);
	Location right= new Location(row+1,column);
	
	world.add(left, flower);
	world.add(right, flower);
	
	
	for(int i=0; i<10; i++) {
		for(int j=0; j<10; j++) {
			Location loc= new Location(j,i);
			world.add(loc, flower);
		}
	}
	
	
}

   
	
	
	
	
	


}
