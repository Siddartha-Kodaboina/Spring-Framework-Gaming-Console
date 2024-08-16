package com.spring_demo.spring_demo.game;

public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Up PMG");

	}

	@Override
	public void down() {
		System.out.println("down PMG");

	}

	@Override
	public void left() {
		System.out.println("left PMG");

	}

	@Override
	public void right() {
		System.out.println("right PMG");

	}

}
