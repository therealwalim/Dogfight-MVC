package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;
import controller.UserOrder;
import gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	
	private IOrderPerformer orderPerformer;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		UserOrder user = new UserOrder(0, null);
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		return null; 
		
	}

	@Override
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	
	
}

	

