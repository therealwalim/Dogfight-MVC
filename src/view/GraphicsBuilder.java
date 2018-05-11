package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import gameframe.IGraphicsBuilder;
import model.IDogfightModel;
import model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {
	
	private BufferedImage emptySky ;
	private IDogfightModel dogfightModel;

	public GraphicsBuilder(IDogfightModel dogfightModel) {
		
	}
	
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	
	public int getGlobalWidth() {
		return 0;
		
	}
	
	public int getGlobalHeight() {
		return 0;
		
	}

	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		
	}

}
