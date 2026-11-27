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
	
	/**
	 * @param attackPower
	 * @param attackSpeed
	 * @param attackRange
	 * @param attackPowerGrowthRate
	 * @param attackSpeedGrowthRate
	 * @param attackRangeGrowthRate
	 * @param attackType
	 * @param cost
	 * @param owned
	 * @param upgradeCost
	 */
	public Cat(int attackPower, int attackSpeed, int attackRange, int attackPowerGrowthRate, int attackSpeedGrowthRate,
			int attackRangeGrowthRate, String attackType, int cost, boolean owned, int upgradeCost) {
		this.attackPower = attackPower;
		this.attackSpeed = attackSpeed;
		this.attackRange = attackRange;
		this.attackPowerGrowthRate = attackPowerGrowthRate;
		this.attackSpeedGrowthRate = attackSpeedGrowthRate;
		this.attackRangeGrowthRate = attackRangeGrowthRate;
		this.attackType = attackType;
		this.cost = cost;
		this.owned = owned;
		this.upgradeCost = upgradeCost;
	}
	
/**
 * removes cat from the game and returns the player money
 */
	public void deleteCat() {
		reset(); //sends cat off-screen
		owned = false;
		
		CatShop.earn(cost);		
	}
	
	/**
	 * upgrades the cat's attack/speed/range based on the cat type
	 */
	public void upgradeCat() {
		//upgrades 
		attackPower += attackPowerGrowthRate;
		attackSpeed += attackSpeedGrowthRate;
		attackRange += attackRangeGrowthRate;
		
		upgradeCost += 5; //TODO can be a diff number
		CatShop.spend(upgradeCost); //TODO
	}
	
	/**
	 * Subtracts the cat's cost from the player's funds and allows the cat
	 * to be used as a defense tower
	 */
	public void buyCat() {
		CatShop.spend(cost);
		owned = true;
	}
	
	
	
}
