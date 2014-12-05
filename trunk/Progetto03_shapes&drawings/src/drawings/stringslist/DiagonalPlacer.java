package drawings.stringslist;

public class DiagonalPlacer implements IPlacer{

	private static final int DIAGONAL_POS_X = 100;
	private static final int DIAGONAL_POS_Y = 100;
	private static final int DIAGONAL_POS_DELTAX = 15;
	private static final int DIAGONAL_POS_DELTAY = 25;

	private int diagonalPosX = DIAGONAL_POS_X;
	private int diagonalPosY = DIAGONAL_POS_Y;
	private int diagonalPosDeltaY = DIAGONAL_POS_DELTAY;
	private int diagonalPosDeltaX = DIAGONAL_POS_DELTAX;
	
	public void place(int position, int[] xy) {
		xy[0]=diagonalPosX + position * diagonalPosDeltaX;
		xy[1]=diagonalPosY + position * diagonalPosDeltaY;
	}
}
