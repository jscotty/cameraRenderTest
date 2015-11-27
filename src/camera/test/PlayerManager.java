package camera.test;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class PlayerManager {
	
	private Player player;
	private Player player2;
	
	private Ellipse2D ellipse = new Ellipse2D.Float();

	public PlayerManager() {
		player = new Player(100, 100);
		player2 = new Player(350, 100).setColor(Color.red);
	}
	
	public void tick(){
		player.tick();
		player2.tick();
	}
	
	public void render(Graphics2D g){
		ellipse.setFrame(GameView.getCamera1());
		
		g.setClip(GameView.getCamera1());
		if(GameView.getCamera1().intersects(player)){
			player.render(g);
			player.scale = GameView.getCamera1().cameraScale;
		}

		g.setClip(GameView.getCamera2());

		if(GameView.getCamera2().intersects(player2)) {
			player2.render(g);
			player2.scale = GameView.getCamera2().cameraScale;
		}

		g.setClip(0,0,800,600);
	}

}
