package camera.test;

import java.awt.Color;
import java.awt.Graphics2D;

public class PlayerManager {
	
	private Player player;
	private Player player2;

	public PlayerManager() {
		player = new Player(100, 100);
		player2 = new Player(350, 100).setColor(Color.red);
	}
	
	public void tick(){
		player.tick();
		player2.tick();
	}
	
	public void render(Graphics2D g){
		if(GameView.getCamera1().intersects(player))
			player.render(g);
		if(GameView.getCamera2().intersects(player2))
			player2.render(g);
	}

}
