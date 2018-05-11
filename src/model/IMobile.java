package model;

import java.awt.*;

public interface IMobile {



    public Direction getDirection();

    public void setDirection();

    public Position getPosition();

    public Dimension getDimension();

    public int getWidth();

    public int getHeight();

    public int getSpeed();

    public Image getImage(int image);

    public void move();

    public void placeInArea(IArea area);

    public boolean isPlayer(int player);

    public void setDogflightModel (IDogfightModel dogflightModel);

    public boolean hit();

    public boolean isWeapon();




}