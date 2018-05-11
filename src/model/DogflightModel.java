package model;

import java.util.ArrayList;
import java.util.Observable;

public class DogflightModel {

    private ArrayList<IMobile> mobiles;
    private IArea area;
    private Sky sky;

    public DogflightModel() {}

    public IArea getArea(){
        return area;
    }

    public void buildArea(Dimension dimension){}

    public void addMobile (IMobile mobile){}

    public void removeMobile (IMobile mobile){}

    public ArrayList<IMobile> getMobiles(){
        return mobiles;
    }

    public IMobile getMobileByPlayer(int player){
        return mobiles.get(player);
    }

    public void setMobilesHavesMoved(){}
}
