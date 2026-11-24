package application;

/**
 * TODO
 * 
 * @author Jose Lopez & Helen Le
 */
public class GameObject {
	//current placement variables
	private int x;
	private int y;
	
	//starting placement
	private int originalX = x;
	private int originalY = y;
	
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
	
	//resets object placement
	public void reset() {
		x = originalX;
		y = originalY;
	}
	
	public void move(int xChange, int yChange) {
		x += xChange;
		y += yChange;
	}
}
