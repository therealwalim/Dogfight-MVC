package view;

import java.util.Observable;

import controller.IOrderPerformer;
import default_name.DogfightModel;
import model.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable {
	
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;

	public DogfightView(IOrderPerformer orderPerformer, DogfightModel dogfightModel, DogfightModel dogfightModel2) {
		
	}

	
	public String displayMessage(String message) {
		return message;
	}
	
	public void closeAll() {
	}


	@Override
	public void run() {
		
	}
	
}
