package tests;

import model.Icon;

public class IconTest {
	
	public static void main(String[] args) {
		
		Icon icon = new Icon(16);
		
		System.out.println(icon.getDimension());
		
		for (int i = 0; i < icon.getDimension(); i++) {
			for (int j = 0; j < icon.getDimension(); j++) {
				System.out.println(icon.getColors()[i][j]);
			}
		}		
	}

}
