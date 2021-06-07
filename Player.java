package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;


public class Player extends GameObject{
	
	private Color co;
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		co = Color.white;
		
	}
	
	public Player(int x, int y, ID id, String desColor) {
		super(x, y, id);
		try {
		    java.lang.reflect.Field field = Class.forName("java.awt.Color").getField(desColor);
		    co = (Color)field.get(null);
		} catch (Exception e) {
		    co = null; // Not defined
		}
		
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
	}

	@Override
	public void render(Graphics g) { // every time player object created, the color of it will be white
		g.setColor(co);
		g.fillRect(x, y, 32, 32);
	}
	
}
