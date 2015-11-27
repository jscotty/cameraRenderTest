package camera.test;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import my.javagame.main.Dot;
import my.javagame.main.Vector2D;
import my.javagame.main.VectorOperations;

public class GameView implements KeyListener  {

	public static boolean up, down, left, right;
	
	private static Camera01 camera1;
	private static Camera02 camera2;
	private PlayerManager pm = new PlayerManager();
	
	public GameView() {
		
	}
	
	public void init(){
		camera1 = new Camera01(100,50,200);
		camera2 = new Camera02(350,50,200);
	}
	
	public void tick(double deltaTime){
		pm.tick();
	}

	public void render(Graphics2D g){
		pm.render(g);
		
		camera1.render(g);
		camera2.render(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_UP){
			up = true;
		}
		if(key == KeyEvent.VK_DOWN){
			down = true;	
		}
		if(key == KeyEvent.VK_LEFT){
			left = true;
		}
		if(key == KeyEvent.VK_RIGHT){
			right = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_UP){
			up = false;
		}
		if(key == KeyEvent.VK_DOWN){
			down = false;	
		}
		if(key == KeyEvent.VK_LEFT){
			left = false;
		}
		if(key == KeyEvent.VK_RIGHT){
			right = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public static Camera01 getCamera1() {
		return camera1;
	}
	
	public static Camera02 getCamera2() {
		return camera2;
	}
}
