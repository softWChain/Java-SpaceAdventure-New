package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class tasMovement {
	
	Timer timer;
	static int temp=0;
	
	public tasMovement(){
		
		for(int i=0;i<7;i++){
			Label.tasX[i] = temp +20;
			Label.tasY[i] = -temp -100;
			temp +=80;
			}
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				for(int i=0;i<7;i++){
					

					
					if(Label.toplamSaglýk >10 && Label.toplamSaglýk <3000){
						
						Label.tasSpeed[0]=3;
						Label.tasSpeed[1]=2;
						Label.tasSpeed[2]=6;
						Label.tasSpeed[3]=4;
						Label.tasSpeed[4]=7;
						Label.tasSpeed[5]=3;
						Label.tasSpeed[6]=8;
						
					}
					
					if(Label.toplamSaglýk >3000 && Label.toplamSaglýk <6000){
						
						Label.tasSpeed[0]=5;
						Label.tasSpeed[1]=7;
						Label.tasSpeed[2]=4;
						Label.tasSpeed[3]=8;
						Label.tasSpeed[4]=10;
						Label.tasSpeed[5]=6;
						Label.tasSpeed[6]=7;
						
					}
					
					if(Label.toplamSaglýk >6000 && Label.toplamSaglýk <9000){
						
						Label.tasSpeed[0]=10;
						Label.tasSpeed[1]=7;
						Label.tasSpeed[2]=9;
						Label.tasSpeed[3]=12;
						Label.tasSpeed[4]=14;
						Label.tasSpeed[5]=16;
						Label.tasSpeed[6]=13;
						
					}
		
					Label.tasY[i] += Label.tasSpeed[i];
					
					if(Label.tasY[i] +70 >=500 ){
						Label.tasY[i] = -100;
					}
					
				}
				
			}
		}, 0, 15);
			
			
		}
	}


