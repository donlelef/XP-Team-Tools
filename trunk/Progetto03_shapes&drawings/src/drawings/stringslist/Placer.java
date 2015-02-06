package drawings.stringslist;

public class Placer implements IPlacer {

	private IPlacer placer;
	
	public void setPlacer(IPlacer placer) {
		this.placer = placer;
	}
	
	@Override
	public void place(int position, int[] xy) {
		placer.place(position, xy);
	}
	
//	public static final int VERTICAL_DISPOSITION = 0;
//	public static final int DIAGONAL_DISPOSITION = 1;
//
//	public VerticalPlacer verticalPlacer;
//	public DiagonalPlacer diagonalPlacer;
//	public int disposition;
//
//	public Placer() {
//		this.verticalPlacer = new VerticalPlacer();
//		this.diagonalPlacer = new DiagonalPlacer();
//		this.disposition = DIAGONAL_DISPOSITION;
//	}
//	
//	public void setDisposition(int disposition) {
//		this.disposition = disposition;
//	}
//
//	/* (non-Javadoc)
//	 * @see drawings.stringslist.IPlacer#place(int, int[])
//	 */
//	@Override
//	public void place(int position, int[] xy) {
//		if (disposition == VERTICAL_DISPOSITION) {
//			verticalPlacer.place(position, xy);
//		} else if (disposition == DIAGONAL_DISPOSITION) {
//			diagonalPlacer.place(position, xy);
//		}
//	}
}