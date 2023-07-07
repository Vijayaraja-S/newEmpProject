package com.p3Solution.learnspringframework.game;

public class GameRunner {
	Marrio game;
	
	public GameRunner(Marrio game) {
		this.game=game;
	}

	public void run() {
		System.out.println("Game is running "+game);
		game.down();
		game.left();
		game.right();
		game.up();
		
	}
}
