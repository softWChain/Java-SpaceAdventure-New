package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class ExplosionAnimation {
	
	Timer timer;
	private int temp=0;
	
	public ExplosionAnimation(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Label.explosionBoolean == true){
					
					if(temp<15){
						Label.explosionAnimation = temp;
						temp++;
					}
					if(temp==15){
						Label.explosionAnimation=15;
						temp=0;
						Label.explosionBoolean = false;
					}	
				}
				
			}
		}, 0, 50);
	}

}
