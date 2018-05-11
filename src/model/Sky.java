package model;
import java.awt.*;


public class Sky implements IArea{

    private Dimension dimension;
    private Image image;

    public Sky(Dimension dimension) {
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public Image getImage() {
        return image;
    }
}
