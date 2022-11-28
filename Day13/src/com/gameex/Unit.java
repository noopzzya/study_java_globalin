package com.gameex;

public abstract class Unit {
	
	int x, y;
	
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}
