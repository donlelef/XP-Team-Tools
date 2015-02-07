package drawings.stringslist;

public class VerticalPlacer implements IPlacer{

	private static final int VERTICAL_POS_X = 100;
	private static final int VERTICAL_POS_Y = 100;
	private static final int VERTICAL_POS_DELTAY = 25;

	private int verticalPosX = VERTICAL_POS_X;
	private int verticalPosY = VERTICAL_POS_Y;
	private int verticalPosDeltaY = VERTICAL_POS_DELTAY;

	public void place(int position, int[] xy) {
		xy[0]=verticalPosX;
		xy[1]=verticalPosY + position * verticalPosDeltaY;
	}
}
