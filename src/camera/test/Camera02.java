package camera.test;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Camera02 extends Rectangle {
	
	private int xPos, yPos;
	private int size;

	public Camera02(int x, int y, int size) {
		xPos = x;
		yPos = y;
		this.size = size;
		setBounds(xPos,yPos,size,size);
	}
	
	public void render(Graphics2D g){
		g.setColor(Color.red);
		g.drawRect(xPos, yPos, size, size);
	}
	
	

}
