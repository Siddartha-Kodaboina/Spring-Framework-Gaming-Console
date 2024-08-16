package com.spring_demo.spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring_demo.spring_demo.game.GameRunner;
import com.spring_demo.spring_demo.game.GamingConsole;
import com.spring_demo.spring_demo.game.MarioGame;
import com.spring_demo.spring_demo.game.PacmanGame;
import com.spring_demo.spring_demo.game.SuperContraGame;

//record GamingConsole(String up, 
//		String down, 
//		String right,
//		String left) {};

@Configuration
public class GamingConfiguration {
	@Bean("MarioGame")
	@Primary
	public GamingConsole game() {
		return new MarioGame();
	}
	
	@Bean("SuperContraGame")
	public GamingConsole game1() {
		return new SuperContraGame();
	}
	
	@Bean("PacmanGame")
	public GamingConsole game2() {
		return new PacmanGame();
	}
	
	@Bean
	GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
}
