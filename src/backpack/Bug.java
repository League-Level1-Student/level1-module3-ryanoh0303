package backpack;

import java.awt.Color;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bug {
	JLabel image= loadImage("download.jpeg");
	
	public Bug() {
		
		
	 
	}
	public Bug(Color bugColor) {
		
	}
	public void turn() {
		
	}
	public void setColor() {
		
	}
	
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
