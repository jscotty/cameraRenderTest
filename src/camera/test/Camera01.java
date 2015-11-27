package camera.test;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Camera01 extends Rectangle {

	private int xPos, yPos;
	private int size;
	
	public float cameraScale = 1;
	
	public Camera01(int x, int y, int size) {
		xPos = x;
		yPos = y;
		this.size = size;
		setBounds(xPos,yPos,size,size);
	}
	
	public void tick(){
		if(GameView.a)
			cameraScale -= 0.01f;
		if(GameView.q)
			cameraScale += 0.01f;
		
	}
	
	public void render(Graphics2D g){
		g.setColor(Color.blue);
		g.drawRect(xPos, yPos, size-1, size-1);
	}
	
	

}
