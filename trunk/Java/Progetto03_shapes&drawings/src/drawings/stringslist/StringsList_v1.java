package drawings.stringslist;

import java.awt.Color;
import java.awt.Graphics;

import drawings.Drawable;

public class StringsList_v1 implements Drawable {

	// Constant declaration
	private static final int VERTICAL_POS_X = 100;
	private static final int VERTICAL_POS_Y = 100;
	private static final int VERTICAL_POS_DELAY = 20;

	private static final int DIAGONAL_POS_X = 100;
	private static final int DIAGONAL_POS_Y = 100;
	private static final int DIAGONAL_POS_DELAY = 20;

	public static final int VERTICAL_DISPOSITION = 0;
	public static final int DIAGONAL_DISPOSITION = 1;

	private String[] strings;
	private int index;

	private int disposition = DIAGONAL_DISPOSITION; // This is a default value.
													// I can add setters and
													// getters to choose a
													// different disposition

	// I use variables instead of constants. Thus the user can modify their
	// values.
	private int verticalPosX = VERTICAL_POS_X;
	private int verticalPosY = VERTICAL_POS_Y;
	private int verticalPosDelay = VERTICAL_POS_DELAY;

	private int diagonalPosX = DIAGONAL_POS_X;
	private int diagonalPosY = DIAGONAL_POS_Y;
	private int diagonalPosDelay = DIAGONAL_POS_DELAY;

	public StringsList_v1(String... strings) {
		// super();
		this.strings = strings;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void up() {
		if (index < strings.length - 1) {
			index++;
		}
	}

	public void down() {
		if (index > 0) {
			index--;
		}
	}

	@Override
	public void draw(Graphics g) { // This method should draw 'strings' vector

		for (int i = 0; i < strings.length; i++) {

			int position = i - index;
			if (position == 0)
				g.setColor(Color.RED);
			else
				g.setColor(Color.BLACK);

			int[] xy = new int[2];
			if (disposition == VERTICAL_DISPOSITION) {
				placeVertcal(position, xy);
			}

			else if (disposition == DIAGONAL_DISPOSITION) {
				placeDiagonal(position, xy);
			}
			g.drawString(strings[i], xy[0], xy[1]);

		}
	}

	private void placeDiagonal(int position, int[] xy) {
		xy[0] = diagonalPosX;
		xy[1] = diagonalPosY + diagonalPosDelay * position;
	}

	private void placeVertcal(int position, int[] xy) {
		xy[0] = verticalPosX;
		xy[1] = verticalPosY + verticalPosDelay * position;
	}

}

// This class implements three different responsibilities:
// Color, disposition and up&down
