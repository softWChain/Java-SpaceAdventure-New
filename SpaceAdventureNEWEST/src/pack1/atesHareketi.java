package pack1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

public class atesHareketi {
	
	Timer timer;
	Ates ates;
	
	public atesHareketi(){
		
		timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				try{
					for(Ates  ates : Label.atesler){	
						
						if(Label.atesBoolean == true){
							ates.setAtesY(ates.getAtesY()- Label.azalanY);	
							if(ates.getAtesY()<0){
								Label.atesler.remove(ates);
								
							}
							if(Label.astreoidCarpmaKucuk == true){
								Label.atesler.remove(ates);
								Label.astreoidCarpmaKucuk = false;
							}
							if(Label.astreoideCarpmaBuyuk == true){
								Label.atesler.remove(ates);
								Label.astreoideCarpmaBuyuk = false;
							}

						}

					}
					
					
				}
				catch(Exception e){
					System.out.println("Veys");
					e.printStackTrace();
				}
				
			}
		}, 0, 15);		
			
			
 
		}
		
		
	}
