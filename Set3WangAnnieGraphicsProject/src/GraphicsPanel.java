// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 10/28/15
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  Your project should have at least one character that moves
//				with the arrow keys and one character that moves with the clock.  Finally, you should detect if the
//				two items intersect and have something happen if they do intersect.
//
// Since you will modify this class you should add comments that describe when and how you modified the class.  
//Annie Wang
//Kirby has to jump over the rock three times in order to win 
//you can use combos of arrow keys 
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
public class GraphicsPanel extends JPanel implements KeyListener{
	
	int background_x;
	//rock x, updates 
	int rock_x;
	//counts jumps 
	int counter = 0;
	//counts how many times the rock passes by 
	int rck_counter=1;
	//rock y 
	int y=160;
	//kirby original y 
	int kb_orgy=50;
	//kirby current y 
	int kb_currenty =kb_orgy;
	//kirby original x 
	int kb_orgx =700;
	//kirby current x 
	int kb_currentx =kb_orgx;
	
	int edge = 1365;
	
	//limits for kirby 
	int right_limit=740;
	int left_limit=-20;
	int up_limit=kb_orgy-120;
	int down_limit=130;
	//booleans 
	boolean jumpEnded=false;
	//boolean collide = false; 
	//int rock_x;
	private Timer t;
	// The timer is used to move objects at a consistent time interval.
	private Character jeep;						 // A jeep
	private Character rock;	//a rock 
	
	
	//A kirby 
	private Character kirby;
	public GraphicsPanel(){
		//initialization of rock kirby and jeep 
		rock_x=50;
       
		jeep = new Character(0, 800, 120);
		rock = new Character(1, rock_x, y);
		
		kirby = new Character(2,kb_orgx,kb_orgy);
		

		background_x=0;
		//rock_x=50;
		setPreferredSize(new Dimension(950,343));    // Set these dimensions to the width 
		 											 // of your background picture.   

		t = new Timer(5, new ClockListener(this));   // t is a timer.  This object will call the ClockListener's
		
		 											 // action performed method every 5 milliseconds once the 
		 											 // timer is started. You can change how frequently this
		 											 // method is called by changing the first parameter.
		t.start();
		this.setFocusable(true);					 // for keylistener
		this.addKeyListener(this);
	}
	
	// method: paintComponent
	// description: This method will paint the items onto the graphics panel.  This method is called when the panel is
	//   			first rendered.  It can also be called by this.repaint()
	// parameters: Graphics g - This object is used to draw your images onto the graphics panel.
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		ClassLoader cldr = this.getClass().getClassLoader();	// These five lines of code load the background picture.
		String imagePath = "images/background.png";				// Change this line if you want to use a different 
		URL imageURL = cldr.getResource(imagePath);				// background image.  The image should be saved in the
		ImageIcon image = new ImageIcon(imageURL);				// images directory.
		image.paintIcon(this, g2, 0, 0);
		
		ImageIcon background1Image = new ImageIcon(imageURL);	// Two ImageIcon's are used to scroll the background.
		background1Image.paintIcon(this, g2, background_x, 0);
		ImageIcon background2Image = new ImageIcon(imageURL);
		background2Image.paintIcon(this, g2, background_x-1365, 0);
		//intersects 
		if(kirby.getBounds().intersects(rock.getBounds())){
			//stops timer 
			t.stop();
			//opens a window with the following message
			JOptionPane.showMessageDialog(this,  "You died, gotta restart the game ", "RIP", JOptionPane.YES_NO_CANCEL_OPTION);
			//game kills itself 
			System.exit(ABORT);
			//collide = true;
			//System.out.println("hello");
		       //System.out.println("help");                                             // This code will detect if the pirate and parrot have
															// collided.  Make something happen if they do intersect.
		}
		//win statement 
		if(counter==3&&rck_counter==3) {
			//stops timer 
			t.stop();
			//displays this window 
			JOptionPane.showMessageDialog(this,  "You Won Hooray ", "Yay", JOptionPane.YES_NO_CANCEL_OPTION);
			//game kills itself 
			System.exit(ABORT);
			
		}

		
		//draws rock and kirby 
		rock.draw(g2, this);
		kirby.draw(g2, this);
		//System.out.println(kirby.getX()-rock.getX());
		//System.out.println("x: " + rock.getX() + " y: " + rock.getY());
		//System.out.println(rock.getX());
		
		
		//System.out.println(background_x);
		
	}
	
	
	// method:clock
	// description: This method is called by the clocklistener every 5 milliseconds.  You should update the coordinates
	//				of one of your characters in this method so that it moves as time changes.  After you update the
	//				coordinates you should repaint the panel.
	public void clock(){
		//moves rock and moves it back if it reaches the edge 
		//also updates rock 
			if(rock_x<edge) {
				rock_x++;
				
				rock.moveTo(rock_x, y);
			}else {
				
				rock_x=50;
				rck_counter++;
				if(rck_counter==3) {
					rck_counter=3;
				}
				
				rock.moveTo(rock_x, y);
				
			}
			
			
		
		
		if(background_x<edge) {
			background_x++;
			
		}else {
			background_x = 0;
			
			}
		
		//updates when jump ends 
		//allows for "jump drift" 
			if(jumpEnded==true) {
				
				if(kb_currenty!=kb_orgy) {
				kb_currentx-=10;
				if(kb_currentx<0) {
					kb_currentx=0;
					
				}
				//System.out.println(kb_currenty);
				//System.out.println(kb_currentx);
					
	           }
				
				if(kb_currenty<kb_orgy) {
					//kirby.timerMove(direction);
					kb_currenty+=10;
					
					
					if(kb_currenty>kb_orgy) {
						kb_currenty=kb_orgy;
						
					}
					
				}
			
		        kirby.moveTo(kb_currentx, kb_currenty);
		        
			}
			//limits kirby and prevents kirby from moving entirely out
			if(kb_currentx>right_limit) {
			kb_currentx=right_limit;
			kirby.moveTo(right_limit, kb_currenty);
			}
			if(kb_currentx<left_limit) {
				kb_currentx=left_limit;
				kirby.moveTo(kb_currentx, kb_currenty);
				
			}
			if(kb_currenty<up_limit) {
				kb_currenty=up_limit;
				kirby.moveTo(kb_currentx, kb_currenty);
			}
			if(kb_currenty>down_limit) {
				kb_currenty=down_limit;
				kirby.moveTo(kb_currentx, kb_currenty);
			}
			
		
			//System.out.println(jumpEnded);
		
		this.repaint();
		
		
		
	}
	
	
	// method: keyPressed()
	// description: This method is called when a key is pressed. You can determine which key is pressed using the 
	//				KeyEvent object and .  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		//moves right 
		case (KeyEvent.VK_RIGHT):
			kb_currentx+=20;
		kirby.moveTo(kb_currentx, kb_currenty);
		
		//kb_currentx=kirby.getX();
		
		this.repaint();
	
		
		break;
		//moves left 
		case(KeyEvent.VK_LEFT):
			kb_currentx-=20;
		kirby.moveTo(kb_currentx, kb_currenty);
		
		
		this.repaint();
		break;
		//moves up 
		case(KeyEvent.VK_UP):
			//kb_currenty=kirby.getY();
			kb_currenty-=20;
			kirby.moveTo(kb_currentx, kb_currenty);
			
			
			//System.out.println(kirby.getY());
			jumpEnded=false;
			
			
			
		
		break;
		//moves down 
		case(KeyEvent.VK_DOWN):
			kb_currenty+=20;
		
		kirby.moveTo(kb_currentx, kb_currenty);
			jumpEnded=false;
			//System.out.println(kirby.getY());
			//prints out update info 
			/**System.out.println("get");
			System.out.println(kirby.getY());
			System.out.println("current");
			System.out.println(kb_currenty);**/
			
		break;
		//jumps 
		case(KeyEvent.VK_SPACE):
			//jump mechanism 
			jumpEnded = false;
		kb_currentx-=120;
		kb_currenty-=120;
		
		kirby.moveTo(kb_currentx, kb_currenty);
		//System.out.println(kb_currenty);
			
		
		
		
			
		
		
		
		
			
		
		break;
		
		
		
		}
		
			

	}
		
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

		

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//once the jump ends sets jump ended to true
		//which then goes to timer 
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			counter++;
			if(counter==3) {
				counter=3;
				
			}
			jumpEnded=true;
			
		}
		
	}

}
