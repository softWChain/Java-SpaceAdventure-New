package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	
	Timer timer;
	
	static int periodHýz = 15;
	static int backgroundSpeed=3;
	
	public Background(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Label.backgroundY1<490){
					Label.backgroundY1 +=backgroundSpeed;
				}else{
					Label.backgroundY1 = -500;
				}
				if(Label.backgroundY2<490){
					Label.backgroundY2 +=backgroundSpeed;
				}else{
					Label.backgroundY2 = -500;
				}
				
				
			}
		}, 0, periodHýz);
	}

}
