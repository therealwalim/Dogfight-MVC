package gameframe;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {

	private IEventPerformer eventPerformer;
	
	public GameFrame (String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
