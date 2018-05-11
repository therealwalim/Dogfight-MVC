package model;

import javafx.geometry.Pos;

import java.awt.*;
import java.util.ArrayList;

public class Mobile implements IMobile{
    private int speed;
    private Direction direction;
    private Position position;
    private Dimension dimension;
    private Image images[] = new Image[4];
    private DogflightModel dogflightModel;

    public Mobile(int speed, Direction direction, Position position, Dimension dimension, String image) {
        this.speed = speed;
        this.direction = direction;
        this.position = position;
        this.dimension = dimension;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void setDirection() {

    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public Position getPosition() {
        return position;
    }

    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    public int getWidth(Dimension dimension) {
        return dimension.width;
    }

    public int getHeight(Dimension dimension) {
        return dimension.height;
    }

    public void move() {
    }

    public void placeInArea(IArea area) {
    }

    public boolean isPlayer(int player) {
        return false;
    }

    @Override
    public void setDogflightModel(IDogfightModel dogflightModel) {

    }

    public void moveUp() {
        this.position.setY(this.position.getY()-1);
    }

    public void moveRight() {
        this.position.setX(this.position.getX()+1);
    }

    public void moveDown() {
        this.position.setY(this.position.getY()+1);
    }

    public void moveLeft() {
        this.position.setX(this.position.getX()-1);
    }

    public Color getColor(){
		return null;}

    public DogflightModel getDogflightModel(){
        return this.dogflightModel;
    }

    public void setDogFightModel(IDogfightModel dogFightModel){}

    public boolean hit(){
		return false;}

    public boolean isWeapon(){
        return false;
    }

    public Image getImage(int image){
        return this.images[image];
    }
}