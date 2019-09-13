package pack1;

import javax.swing.JFrame;

public class Gui {
	
	public Gui(){
		
		Label.frame = new JFrame();
		Label.frame.setSize(Label.WIDTH,Label.HEIGHT);
		Label.frame.setTitle("Space Adventure");
		Label.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Label.frame.setResizable(false);
		Label.frame.setLocationRelativeTo(null);
		Label.frame.addKeyListener(new KeyHandler());
		Label.frame.setLayout(null);
		Label.frame.requestFocus();
		Label.frame.setVisible(true);
		
		KeyHandler key = new KeyHandler();
		
		Label.lab = new Draw();
		Label.lab.setBounds(0,0,Label.WIDTH,Label.HEIGHT);
		Label.frame.add(Label.lab);
	}

}
