// Class: Character
// Written by: Mr. Swope
// Date: 10/28/15
// Description: This class implements a Character.  This Character will be drawn onto a graphics panel. 
// 
// If you modify this class you should add comments that describe when and how you modified the class.  

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.net.URL;
import javax.swing.ImageIcon;

public class Character {
	private ImageIcon image;			// The ImageIcon will be used to hold the Character's png.
										// This png must be saved in the images folder and will be loaded 
										// in the constructor.
	
	private int x_coordinate;			// These ints will be used for the drawing the png on the graphics panel.
	private int y_coordinate;			// When the Character's move method is called you should update one or both
										// of these instance variables.  (0,0) is the top left hand corner of the
										// panel.  x increases as you move to the right, y increases as you move
										// down.
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Character(){
		this(0, 200, 300);
	}
		
	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: imageChoice - used to determine which image to load when a Character is instantiated.  You can change
	//			   existing options or add other options. 0 - pirate, 1 - parrot.
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Character(int imageChoice, int x_coordinate, int y_coordinate){
        
		ClassLoader cldr = this.getClass().getClassLoader();	// These eight lines of code load the Character's png
		String imagePath;										// so that it later be painted on the graphics panel
																// when draw method is called.  You should modify
																// the imagePath if you change the Character's png.
		
		if(imageChoice == 0)									// if statement that determines which image to use for		
			imagePath = "images/jeep.png";					    // a Character object.  You can add other options as well.
		else if(imageChoice==1)
			imagePath = "images/Coal.png";
		else
			//adds Kirby as an image option 
			
		
		  imagePath = "images/220px-Kirby.png";
		
		
		URL imageURL = cldr.getResource(imagePath);				
        image = new ImageIcon(imageURL);						
        
        this.x_coordinate = x_coordinate;						// Initial coordinates for the Character.
        this.y_coordinate = y_coordinate;  
	}
	
	// method: getBounds
	// description: This method will return the coordinates of a rectangle that would be drawn around the 
	// 				Character's png.  This rectangle can be used to check to see if the Character bumps into 
	//				another character on your panel by calling the Rectangle's intersects method:
	//
	//							p.getBounds().intersects(c.getBounds());
	//
	//				in this example p is an instance of the Character class and c is an instance of another
	//				class that has a getBounds method that also returns a Rectangle, so p.getBounds and
	//				c.getBounds would both return or evaluate to Rectangle objects.  The intersects method
	//				return true if the two rectangles overlap, false if they do not.
	// return: A Rectangle - This rectangle would be like drawing a rectangle around the Character's image.
	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, image.getIconWidth(), image.getIconHeight());
	}
	
	// method: getX
	// description:  This method will return the x-coordinate of the top left hand corner of the the image.
	// return: int - the x-coordinate of the top left hand corner of the the image.
	public int getX(){
		return x_coordinate;
	}
	
	// method: getY
	// description:  This method will return the y-coordinate of the top left hand corner of the the image.
	// return: int - the y-coordinate of the top left hand corner of the the image.
	public int getY(){
		return y_coordinate;
	}
	
	// method: keyPressedMove
	// description: This method should modify the Character's x or y (or perhaps both) coordinates.  When the 
	//				graphics panel is repainted the Character will then be drawn in it's new location.
	// parameters: int direction - This parameter should represent the direction that you want to move
	//			   the Character, so decide on a standard for what each integer value will stand for and then
	//			   add comments below that describe these integer values, for example...
	//			   1 - move Character to the right.
	public void keyPressedMove(int direction1, int direction2){
		
			x_coordinate+=direction1;
			y_coordinate+=direction2;
			//makes it so if either the x or y are 0, the x 
			//and y dont move 
		if(direction1==0) {
			x_coordinate=x_coordinate;
		}
		if(direction2==0) {
			y_coordinate=y_coordinate;
		}
		
	}
	//just moves you to the specified coordinates 
	public void moveTo(int place1, int place2) {
		x_coordinate=place1;
		y_coordinate=place2;
	}
	
	

	// method: timerMove
	// description: This method should modify the Character's x or y (or perhaps both) coordinates.  When the 
	//				graphics panel is repainted the Character will then be drawn in it's new location.
	// parameters: int direction - This parameter should represent the direction that you want to move
	//			   the Character, so decide on a standard for what each integer value will stand for and then
	//			   add comments below that describe these integer values, for example...
	//			   1 - move Character to the right.
	public void timerMove(int direction){
		x_coordinate--;
	}
	// method: draw
	// description: This method is used to draw the image onto the GraphicsPanel.  You shouldn't need to 
	//				modify this method.
	// parameters: Graphics g - this object draw's the image.
	//			   Component c - this is the component that the image will be drawn onto.
	public void draw(Graphics g, Component c) {
        image.paintIcon(c, g, x_coordinate, y_coordinate);
    }
}
