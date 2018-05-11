package gameframe;

import java.awt.Graphics;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer  {
	
	private Observable observable;
	private IGraphicsBuilder graphicsBuilder;

	public GamePanel(IGraphicsBuilder graphicBuilder) {
		
	}
	
	public void update(Observable observable) {
		
	}
	
	public void paintComponent(Graphics graphic) {
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
