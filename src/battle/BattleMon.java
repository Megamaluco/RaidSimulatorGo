
package battle;


import battle.RaidSimulatorStateMachine.STATE;
import moves.ChargeMove;
import moves.QuickMove;


public abstract class BattleMon {

	private QuickMove quickMove;
	private ChargeMove chargeMove;
	private int quickAttackDamage;
	private int chargeAttackDamage;
	private int lastTimeQuickAttack;
	private int lastTimeChargeAttack;
	private STATE state;
	private int hp;
	private int energy;


	public BattleMon(QuickMove quickMove, ChargeMove chargeMove) {
		this.quickMove = quickMove;
		this.chargeMove = chargeMove;
		this.lastTimeQuickAttack = 0;
		this.lastTimeChargeAttack = 0;
		this.energy = 0;
		this.state = STATE.NOTHING;
		this.hp = 0;
	}


	public boolean isAlive() {

		return hp > 0;
	}


	/**
	 * @return the energy
	 */
	public int getEnergy() {

		return energy;
	}


	/**
	 * @param hp
	 *            the hp to set
	 */
	public void setHp(int hp) {

		this.hp = hp;
	}


	/**
	 * @param energy
	 *            the energy to set
	 */
	public void setEnergy(int energy) {

		this.energy = energy;
	}


	/**
	 * @return the lastTimeChargeAttack
	 */
	public int getLastTimeChargeAttack() {

		return lastTimeChargeAttack;
	}


	/**
	 * @param lastTimeChargeAttack
	 *            the lastTimeChargeAttack to set
	 */
	public void setLastTimeChargeAttack(int lastTimeChargeAttack) {

		this.lastTimeChargeAttack = lastTimeChargeAttack;
	}


	/**
	 * @return the state
	 */
	public STATE getState() {

		return state;
	}


	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(STATE state) {

		this.state = state;
	}


	/**
	 * @return the hp
	 */
	public int getHp() {

		return hp;
	}


	/**
	 * @return the quickMove
	 */
	public QuickMove getQuickMove() {

		return quickMove;
	}


	/**
	 * @return the chargeMove
	 */
	public ChargeMove getChargeMove() {

		return chargeMove;
	}


	/**
	 * @return the quickAttackDamage
	 */
	public int getQuickAttackDamage() {

		return quickAttackDamage;
	}


	/**
	 * @return the lastTimeQuickAttack
	 */
	public int getLastTimeQuickAttack() {

		return lastTimeQuickAttack;
	}


	/**
	 * @param lastTimeQuickAttack
	 *            the lastTimeQuickAttack to set
	 */
	public void setLastTimeQuickAttack(int lastTimeQuickAttack) {

		this.lastTimeQuickAttack = lastTimeQuickAttack;
	}


	/**
	 * @param quickAttackDamage
	 *            the quickAttackDamage to set
	 */
	public void setQuickAttackDamage(int quickAttackDamage) {

		this.quickAttackDamage = quickAttackDamage;
	}


	/**
	 * @param chargeAttackDamage
	 *            the chargeAttackDamage to set
	 */
	public void setChargeAttackDamage(int chargeAttackDamage) {

		this.chargeAttackDamage = chargeAttackDamage;
	}


	/**
	 * @return the chargeAttackDamage
	 */
	public int getChargeAttackDamage() {

		return chargeAttackDamage;
	}
	
	public void loseEnergy(int energyLost){
		energy = Math.max(0, energy - energyLost);
	}

	
	public void gainEnergy(int energy){
		energy = Math.min(100, this.energy + energy);
	}

	public void getAttacked(int damage) {

		hp -= damage;
		energy = Math.min(100, energy + (damage / 2));

	}


}
