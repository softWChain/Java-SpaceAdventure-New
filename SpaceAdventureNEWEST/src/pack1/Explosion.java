package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Explosion {
	
	Timer timer;
	
	private int temp=0;
	
	public Explosion(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				for(int i=0;i<7;i++){
					
					if(Label.rocketX+30>=Label.tasX[i]-140&& Label.rocketX+40<=Label.tasX[i]-20&&
							Label.rocketY>=Label.tasY[i]-80&& Label.rocketY<=Label.tasY[i]+20){
						Label.explosionBoolean = true;
						Label.tasY[i] = -100;

						if(Label.explosionBoolean == true){
							Label.toplamSaglýk -= Label.saglýkAzaltma;
						}

					}
				}
				
			}
		}, 0, 15);
		
		
	}

}
