package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class AstreoidBulletExplosion {
	
	Timer timer;
	private int temp=0;
	
	public AstreoidBulletExplosion(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				
				
				if(Label.astreoideCarpmaBuyuk == true){
					
					if(temp<17){			
						temp++;
					}
					else if(temp==17){
						
						Label.astreoideCarpmaBuyuk=false;
						Label.gifAstreoid.flush();
						temp=0;
					}
				}
				
				
			}
		}, 0,50);
	}

}
