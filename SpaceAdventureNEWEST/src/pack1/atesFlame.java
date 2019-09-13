package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class atesFlame {
	
	Timer timer;
	private int temp = 0;
	
	public atesFlame(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(temp==0){
					Label.atesHareketi=0;
					temp++;
				}
				else if(temp==1){
					Label.atesHareketi=1;
					temp--;
				}
				
				
			}
		}, 0, 10);
		
	}

}
