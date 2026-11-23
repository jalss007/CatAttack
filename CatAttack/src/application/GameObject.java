package application;

/**
 * TODO
 * 
 * @author Jose Lopez & Helen Le
 */
public class GameObject {
	private int x;
	private int y;
	
	@Override
	public String toString() {
		return "GameObject [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void reset() {
		// TODO
	}
	
	public void move(int xChange, int yChange) {
		// TODO
	}
}
