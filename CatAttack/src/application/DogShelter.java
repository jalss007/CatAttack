package application;

public class DogShelter extends GameObject{
	private boolean alive;
	private int health;
	
	public DogShelter(boolean alive, int health) {
		super();
		this.alive = alive;
		this.health = health;
	}
	
	public void loseHealth() {
		// TODO
	}
}
