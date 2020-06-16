import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon {

	public RoundBalloon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoundBalloon(int x, int y, int r, Color c) {
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
	                 yCenter - radius, 2*radius, 2*radius);
	    else
	      g.drawOval(xCenter - radius,
	                 yCenter - radius, 2*radius, 2*radius);
	  }
}
