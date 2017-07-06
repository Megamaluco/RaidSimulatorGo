/**
 * 
 */

package pokemons;


/**
 * @author Ricardo Martinho
 *
 */
public class RaidBoss extends Pokemon {

	private static final double[] CPM_RAID = { 0.61, 0.67, 0.73, 0.79 };
	private int tier;
	private static final int[] BOSS_HEALTH = {600, 1800, 3000, 7500};


	public RaidBoss(int dexEntry, String name, int typeA, int typeB, int baseAttack, int baseStamina, int baseDefense,
			boolean isFinalEvolution, int tier) {
		super(dexEntry, name, typeA, typeB, baseAttack, baseStamina, baseDefense, isFinalEvolution);
		//this.hp = (int) (BOSS_HEALTH[tier-1] / 2 / CPM_RAID[tier-1]);
		this.attackIV = 15;
		this.defenseIV = 15;
		this.hpIV = 15;
		this.tier = tier;
		this.attack = (int) ((baseAttack + attackIV) * CPM_RAID[tier-1]);
		this.defense = (int) ((baseDefense + defenseIV) * CPM_RAID[tier-1]);
		this.hp = (int) ((BOSS_HEALTH[tier-1] + hpIV) * CPM_RAID[tier-1]);
		
		
	}


	/**
	 * @return the tier
	 */
	public int getTier() {
	
		return tier;
	}

}
