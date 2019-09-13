package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	Ates ates;

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		if(e.getKeyCode() == KeyEvent.VK_W){
			Label.moveup = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			Label.movedown = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			Label.moveleft = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_D){
			Label.moveright = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			
			try{
				Label.atesler.add(new Ates(Label.rocketX+135, Label.rocketY+20));
				Label.atesDegeri++;
				Label.atesBoolean = true;
			}
			catch(Exception e1){
				
			}
			//ates = new Ates(Label.rocketX, Label.rocketY);

		}
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			Label.oyun = true;
			

		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_W){
			Label.moveup = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			Label.movedown = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			Label.moveleft = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_D){
			Label.moveright = false;
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
