package com.spring_demo.spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_demo.spring_demo.game.GameRunner;
import com.spring_demo.spring_demo.game.GamingConsole;
import com.spring_demo.spring_demo.game.MarioGame;
import com.spring_demo.spring_demo.game.PacmanGame;
import com.spring_demo.spring_demo.game.SuperContraGame;

public class App01GamingBasicJava {
	
	public static void printGame(GameRunner game) {
//		game.up();
//		game.down();
//		game.right();
//		game.left();
//		System.out.println(" : " + game.down() + " : " +  + " : " + game.left() );
		System.out.println("_________________________");
	}

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
//		var game = new PacmanGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
		
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		GamingConsole marioGame = (GamingConsole) context.getBean("MarioGame");
//		printGame(marioGame);
		
//		GamingConsole superContraGame = (GamingConsole) context.getBean("SuperContraGame");
//		printGame(superContraGame); 
//		
//		GamingConsole pacmanGame = (GamingConsole) context.getBean("PacmanGame");
//		printGame(pacmanGame);C
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
		
		
		
		
	}

}
