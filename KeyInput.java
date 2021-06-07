package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
				
		System.out.println(key);
		
		for(int i = 0; i < handler.object.size(); i++) { //for every object in the handler, if the id of that object matches player1, 
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				//key events for Player 1
			
				if(key == KeyEvent.VK_W)
					tempObject.setVelY(-5);
				if(key == KeyEvent.VK_S)
					tempObject.setVelY(5);
				if(key == KeyEvent.VK_A)
					tempObject.setVelX(-5);
				if(key == KeyEvent.VK_D)
					tempObject.setVelX(5); 
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) { //for every object in the handler, if the id of that object matches player1, 
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				//key events for Player 1
				
				if(key == KeyEvent.VK_W)
					tempObject.setVelY(0);
				if(key == KeyEvent.VK_S)
					tempObject.setVelY(0);
				if(key == KeyEvent.VK_A)
					tempObject.setVelX(0);
				if(key == KeyEvent.VK_D)
					tempObject.setVelX(0);
			}
		}
		
		
	}
}
