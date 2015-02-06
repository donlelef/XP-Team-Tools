package listPrinting;



public class VerticalPlacer implements Placer {

	int xDefault;
	int yStart;
	int deltaY;
	
	public VerticalPlacer(int xDefault, int yStart, int deltaY) {
		super();
		this.xDefault = xDefault;
		this.yStart = yStart;
		this.deltaY = deltaY;
	}

	@Override
	public int getX(int itemPosition) {
		return xDefault;
	}
	
	@Override
	public int getY(int itemPosition) {
		return yStart+itemPosition*deltaY;
	}

	@Override
	public int getItemPosition(int x, int y) {
		return (y-yStart)/deltaY;
	}

}
