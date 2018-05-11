package model;

import java.util.ArrayList;

public interface IDogfightModel {
    public IArea getArea();

    public void buildArea();

    public void addMobile();

    public void removeMobile();

    public ArrayList<Mobile> getMobiles();

    public Mobile getMobileByPlayer(int player);

    public void setMobilesHavesMoved();


}
