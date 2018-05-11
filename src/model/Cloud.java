package model;

public class Cloud extends Mobile{
    private static int SPEED = 1;
    private static int WIDTH = 300;
    private static int HEIGHT = 150;
    private static String IMAGE = "cloud";

    public Cloud(int speed, Direction direction, Position position, Dimension dimension, String image) {
        super(speed, direction, position, dimension, image);
    }
}
