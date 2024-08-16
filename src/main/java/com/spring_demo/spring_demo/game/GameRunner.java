package com.spring_demo.spring_demo.game;

public class GameRunner {
	GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		System.out.println("Running Game" + this.game);
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
