package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler // loop through all objects in the game, and render each one in the screen
{ 
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick()
	{
		for(int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			tempObject.tick();
		}
	}
	
	public void render(Graphics g)
	{
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			tempObject.render(g);
		}
	}
	
	public void addObject(GameObject o) {
		this.object.add(o);
	}
	
	public void removeObject(GameObject o) {
		this.object.remove(o);
	}
}
