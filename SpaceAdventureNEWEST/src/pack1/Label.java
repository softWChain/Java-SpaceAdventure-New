package pack1;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Label {
	
	static JFrame frame;
	static int WIDTH  = 650;
	static int HEIGHT = 500;
	static Draw lab;
	static int backgroundY1=0, backgroundY2=-500;
	static int atesX,atesY;
	static int azalanY=2;
	static int atesDegeri=0;
	static int carpmaDegeri=0;
	static int atesHareketi;
	static int explosionAnimation=0;
	static int astreoidExplosionAnimation=0;
	static int astreoidExplosionAnimationBuyuk =0;
	static int geciciX;
	static int geciciY;
	static int gecici2X;
	static int gecici2Y;
	static int astBuyukcarpmaSay�s�=0;
	static int kulland�g�mDeger=0;
	static int toplamSagl�k=1000;
	static int sagl�kArtt�rma=300;
	static int sagl�kAzaltma=500;
	

	
	static BufferedImage gorsel;
	static BufferedImage rocket;
	static BufferedImage tas;
	static BufferedImage ates;
	static BufferedImage ates1,ates2;
	static BufferedImage ast;
	
	static BufferedImage explosionArray[] = new BufferedImage[16];
	static BufferedImage astreoidExplosionArray[] = new BufferedImage[10];
	static BufferedImage astreoidExplosionArrayPatlama[] = new BufferedImage[18];
	
	static Image gifAstreoid;
	
	static int tasX[] = new int[7];
	static int tasY[] = new int[7];

	
	static int tasSpeed[] = new int[7];
	static int astX[] = new int[3];
	static int astY[] = new int[3];
	static int astH�z[] = new int[3];
	
	static boolean moveup = false , movedown = false, moveleft = false ,moveright = false;
	static boolean astreoidCarpmaKucuk = false;
	static boolean atesBoolean = false;
	static boolean atesFlame = false;
	static boolean explosionBoolean = false;
	static boolean astreoidExplosionBoolean = false;
	static boolean astreoideCarpmaBuyuk = false;
	static boolean oyun = true;
	
	static ArrayList<Ates> atesler = new ArrayList<Ates>();
	
	static int rocketX = 195, rocketY=300;
	
	public Label(){
		
		try {
			gorsel = ImageIO.read(new File("rsc/Veys.png"));
			rocket = ImageIO.read(new File("rsc/rocket.png"));
			tas = ImageIO.read(new File("rsc/tas.png"));
			ates = ImageIO.read(new File("rsc/Ates.png"));
			ates1 = ImageIO.read(new File("rsc/ates1.png"));
			ates2 = ImageIO.read(new File("rsc/ates2.png"));
			ast = ImageIO.read(new File("rsc/ast.png"));
			
			
			//gifAstreoid = Toolkit.getDefaultToolkit().createImage("rsc/astre.gif");
			
			///ROKET UZERINDE PATLAMA ICIN
			for(int i=0;i<=15;i++){
				
				explosionArray[i] = ImageIO.read(new File("rsc/exp"+(i+1)+".png"));
			}
			// KUCUK ASTREO�D PATLAMASI ICIN
			for(int i=0;i<=9;i++){
				
				astreoidExplosionArray[i] = ImageIO.read(new File("rsc/ast"+(i+1)+".bmp"));
			}
			
			//BUYUK ASTREO�D PATLAMASI ICIN
			
			gifAstreoid = Toolkit.getDefaultToolkit().createImage("rsc/gg.gif");
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
