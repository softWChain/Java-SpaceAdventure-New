package pack1;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Astreoid {
	
	Timer timer;
	
	private int temp=0;

	Random rand = new Random();
	

	public Astreoid(){
		

		for(int i=0;i<3;i++){
			Label.astX[i] = temp +20;
			Label.astY[i] = -temp -200;
			temp+=150;
		}
		
		Label.astHýz[0] = 4;
		Label.astHýz[1] = 5;
		Label.astHýz[2] = 9;
		
	
		timer  = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				

				for(int i=0;i<3;i++){
					
					Label.astY[i]+=Label.astHýz[i];
					
					if(Label.astY[0] +20> 500){
						Label.astY[0] = -200;
					}
					
					if(Label.astY[1] +20> 500){
						Label.astY[1] = -2800;
					}
					
					if(Label.astY[2] +20> 500){
						Label.astY[2] = -4100;
					}
					
				}
				

				
				
			}
		}, 0, 20);
		
		
	}

}
