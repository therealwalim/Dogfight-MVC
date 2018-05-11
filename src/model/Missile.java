package model;

import java.lang.management.MonitorInfo;

public class Missile extends Mobile {
    private static int SPEED = 4;
    private static int WIDTH = 30;
    private static int HEIGHT = 10;
    private static int MAX_DISTANCE_TRAVELED = 1400;
    private static String image = "missile";
    private int distance_traveled = 0;

    public Missile(int speed, Direction direction, Position position, Dimension dimension, String image, int distance_traveled) {
        super(speed, direction, position, dimension, image);
        this.distance_traveled = distance_traveled;
    }

    public int getWidthWithADirection(Direction direction){
		return distance_traveled;}
    public int getHeightWithADirection(Direction direction){
		return distance_traveled;}

    @Override
    public void move(){}

    @Override
    public boolean isWeapon(){
        return true;
    }
}
