package application;

/**
 * TODO
 * 
 * @author Jose Lopez & Helen Le
 */
public class Cat extends GameObject{
	private int attackPower;
	private int attackSpeed;
	private int attackRange;
	private String attackType;
	private int cost;
	private boolean owned;
	
	public Cat(int attackPower, int attackSpeed, int attackRange, String attackType, int cost, boolean owned) {
		super();
		this.attackPower = attackPower;
		this.attackSpeed = attackSpeed;
		this.attackRange = attackRange;
		this.attackType = attackType;
		this.cost = cost;
		this.owned = owned;
	}
	
	public void deleteCat() {
		// TODO
	}
	
	
	
}
