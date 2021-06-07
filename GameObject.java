package com.tutorial.main;

import java.awt.Graphics;

public abstract class GameObject //player object and enemy object and more are all game objects
{
	protected int x; //the class inheriting the game object doesn't have to initialize these variables
	protected int y;
	
	protected ID id; 
	protected int velX, velY;
	
	public GameObject(int x, int y, ID id)
	{
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	public void setId(ID id) // id for each object
	{
		this.id = id;
	}
	public ID getId()
	{
		return id;
	}
	
	public void setVelX(int velX) // velocity
	{
		this.velX = velX;
	}
	public void setVelY(int velY)
	{
		this.velY = velY;
	}
	public int getVelX() {
		return velX;
	}
	public int getVelY() {
		return velY;
	}
	
}
