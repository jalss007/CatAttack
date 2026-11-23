package application;

/**
 * TODO
 * 
 * @author Jose Lopez & Helen Le
 */
public class DogLovers extends GameObject{
	private boolean alive;
	private int health;
	private int attackPower;
	private int speed;
	
	public DogLovers(boolean alive, int health, int attackPower, int speed) {
		super();
		this.alive = alive;
		this.health = health;
		this.attackPower = attackPower;
		this.speed = speed;
	}
	
	public void move(int xChange, int yChange) {
		
	}
	
	public void damageTaken(int damage) {
		
	}
}
