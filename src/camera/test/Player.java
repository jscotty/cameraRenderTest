package camera.test;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import my.javagame.main.Vector2D;

@SuppressWarnings("serial")
public class Player extends Rectangle {

	private Vector2D pos = new Vector2D(100, 200);
	private Color color = Color.BLUE;
	
	public int width = 32, height = 32, speed = 2;
	
	public float scale = 1;
	
	
	public Player(float xPos, float yPos) {
		pos.xPos = xPos; pos.yPos = yPos;
	}
	
	public Player setColor(Color color){
		this.color = color;
		return this;
	}
	
	public void tick(){
		setBounds((int)pos.xPos, (int)pos.yPos, (int)(width* scale), (int)(height* scale));
		
		if(GameView.up)
			pos.yPos -= speed;
		if(GameView.down)
			pos.yPos += speed;
		if(GameView.left)
			pos.xPos -= speed;
		if(GameView.right)
			pos.xPos += speed;
		
		
	}
	
	public void render(Graphics2D g){
		
		g.setColor(color);
		g.fillRect((int)pos.xPos, (int)pos.yPos, (int)(width* scale), (int)(height* scale));
	}

}
