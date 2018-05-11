package controller;

import default_name.DogfightModel;
import model.IDogfightModel;
import model.Missile;
import view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	private static int TIME_SLEEP =30;
	private IDogfightModel dogfightModel;
	private IViewSystem viewSystem;
	
	public DogfightController(DogfightModel dogfightModel2){
		
	}
	
	public void orderPerform(UserOrder userOrder){
		
	}
	
	public void play(){
		
	}
	
	public void setViewSystem(IViewSystem viewSstem){
		
	}
	
	private void lauchMissile(int player){
		Missile missile = new Missile(player, null, null, null, null, player);
	}
	
	private void gameLoop(){
		
	}
}
