package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class rocketMovement {
	
	Timer timer;
	static int rocketSpeed = 6;
	
	public rocketMovement(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate( new TimerTask() {
			
			@Override
			public void run() {
				if(Label.moveup == true){
					if(Label.rocketY+20> 0)
					{
					Label.rocketY -= rocketSpeed;
					}
				}
				if(Label.movedown == true){
					if(Label.rocketY < 350){
						Label.rocketY += rocketSpeed;
					}
					
				}
				if(Label.moveleft == true){
					if(Label.rocketX +120> 0){
						Label.rocketX -= rocketSpeed;
					}
				}
				if(Label.moveright == true){
					if(Label.rocketX < 460){
						Label.rocketX += rocketSpeed;
					}
					
				}
				
			}
		}, 0, 15);
		
		
	}

}
