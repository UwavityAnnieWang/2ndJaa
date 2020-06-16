import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon extends Balloon {

	public OvalBalloon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OvalBalloon(int x, int y, int r, Color c) {
		super(x, y, r, c);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g, boolean makeItFilled)
	  {
		int xCenter = getX();
		int radius  = getRadius();
		int yCenter = getY(); 
		
	    g.setColor(getColor());
	    if (makeItFilled)
	      g.fillOval(xCenter - radius,
	                 yCenter - radius, 2*radius, 4*radius);
	    else
	      g.drawOval(xCenter - radius,
	                 yCenter - radius, 2*radius, 4*radius);
	  }
	
}
