package camera.test;

import my.javagame.main.IDGameLoop;

@SuppressWarnings("serial")
public class Loop extends IDGameLoop{

	GameView coll;
	
	
	public Loop(int width, int height) {
		super(width, height);
	}

	@Override
	public void init() {
		super.init();
		coll = new GameView();
			coll.init();
	}
	
	@Override
	public void tick(double deltaTime) {
			coll.tick(deltaTime);
	}
	
	@Override
	public void render() {
			coll.render(graphics2D);
		clear();
		super.render();
	}
	
	@Override
	public void clear() {
		super.clear();
	}

}
