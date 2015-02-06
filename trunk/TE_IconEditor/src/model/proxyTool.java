package model;

/**
 * A proxy to encapsulate the tool in use in the editor.
 * 
 * @author lele
 *
 */
public class proxyTool implements ITool {

	private ITool tool;

	public void setTool(ITool tool) {
		this.tool = tool;
	}

	public ITool getTool() {
		return tool;
	}

	@Override
	public void operate(int xPixel, int yPixel) {
		this.tool.operate(xPixel, yPixel);
	}

}
