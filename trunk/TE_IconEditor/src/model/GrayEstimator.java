package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class GrayEstimator {

	private Icon icon;
	private ArrayList<Float> intensities = new ArrayList<Float>();

	public GrayEstimator(Icon icon) {
		super();
		this.icon = icon;
		this.initializeVector();
	}

	private void initializeVector(){
		
		for (int i = 0; i < icon.getDimension(); i++) {
			for (int j = 0; j < icon.getDimension(); j++) {
				
				Color color = this.icon.getColors()[i][j];
				float gray = 0.3F*color.getRed() + 0.59F*color.getGreen() + 0.11F*color.getBlue();
				this.intensities.add(gray);
				
			}
		}
	}
	
	
	public float getMaximumIntensity(){
		return Collections.max(intensities);
	}
	
	public float getMinimumIntensity(){
		return Collections.min(intensities);
	}
	
	public float getAverageIntensity(){
		float sum = 0;
		for (Float intensity : intensities) {
			sum += intensity;
		}
		return sum/intensities.size();
	}
}
