package model;

public class Plane extends Mobile{
    private static int SPEED = 2;
    private static int WIDTH = 100;
    private static int HEIGHT = 30;
    private int player;

    public Plane(int speed, Direction direction, Position position, Dimension dimension, String image, int player) {
        super(speed, direction, position, dimension, image);
        this.player = player;
    }

    @Override
    public boolean hit(){
		return false;}

    @Override
    public boolean isPlayer(int player){
        if (this.player == player){
            return true;
        }
        else {
            return false;
        }
    }


}
