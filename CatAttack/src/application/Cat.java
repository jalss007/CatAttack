package application;

/**
 * TODO
 * 
 * @author Jose Lopez & Helen Le
 */
public class Cat extends GameObject{
	//attack variables
	private int attackPower;
	private int attackSpeed;
	private int attackRange;
	private int attackPowerGrowthRate;
	private int attackSpeedGrowthRate;
	private int attackRangeGrowthRate;


	private String attackType;
	
	//shop relevant
	private int cost;
	private boolean owned;
	private int upgradeCost;
	
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
		reset(); //sends cat off-screen
		owned = false;
		//TODO disable functionality
		
	}
	
	public void upgradeCat() {
		//upgrades 
		attackPower += attackPowerGrowthRate;
		attackSpeed += attackSpeedGrowthRate;
		attackRange += attackRangeGrowthRate;
		
		upgradeCost += 5; //TODO can be a diff number
//		CatShop.spend(upgradeCost); //TODO
	}
	
	
	
}
