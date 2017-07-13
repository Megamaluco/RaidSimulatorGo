
package pokemons;


import java.util.LinkedList;
import java.util.List;

import moves.ChargeMove;
import moves.QuickMove;

public class Pokemon {

	private static final double[] CPM = { 0.094, 0.135137432, 0.16639787, 0.192650919, 0.21573247, 0.236572661,
			0.25572005, 0.273530381, 0.29024988, 0.306057377, 0.3210876, 0.335445036, 0.34921268, 0.362457751,
			0.37523559, 0.387592406, 0.39956728, 0.411193551, 0.42250001, 0.432926419, 0.44310755, 0.4530599578,
			0.46279839, 0.472336083, 0.48168495, 0.4908558, 0.49985844, 0.508701765, 0.51739395, 0.525942511,
			0.53435433, 0.542635767, 0.55079269, 0.558830576, 0.56675452, 0.574569153, 0.58227891, 0.589887917,
			0.59740001, 0.604818814, 0.61215729, 0.619399365, 0.62656713, 0.633644533, 0.64065295, 0.647576426,
			0.65443563, 0.661214806, 0.667934, 0.674577537, 0.68116492, 0.687680648, 0.69414365, 0.700538673,
			0.70688421, 0.713164996, 0.71939909, 0.725571552, 0.7317, 0.734741009, 0.73776948, 0.740785574, 0.74378943,
			0.746781211, 0.74976104, 0.752729087, 0.75568551, 0.758630378, 0.76156384, 0.764486065, 0.76739717,
			0.770297266, 0.7731865, 0.776064962, 0.77893275, 0.781790055, 0.78463697, 0.787473578, 0.79030001 };

	private int dexEntry;
	private String name;
	private List<QuickMove> quickMoves;
	private List<ChargeMove> chargeMoves;
	private int typeA;
	private int typeB;
	private int baseAttack;
	protected int baseStamina;
	private int baseDefense;
	protected int attackIV;
	protected int hpIV;
	protected int defenseIV;
	private boolean isFinalEvolution;
	private int cp;
	private int level;
	protected double attack;
	protected double defense;
	protected int hp;


	public Pokemon(int dexEntry, String name, int typeA, int typeB, int baseAttack, int baseStamina,
			int baseDefense, boolean isFinalEvolution) {
		this.dexEntry = dexEntry;
		this.name = name;
		this.quickMoves = new LinkedList<>();
		this.chargeMoves = new LinkedList<>();
		this.typeA = typeA;
		this.typeB = typeB;
		this.baseAttack = baseAttack;
		this.baseStamina = baseStamina;
		this.baseDefense = baseDefense;
		this.isFinalEvolution = isFinalEvolution;
		this.attackIV = 0;
		this.hpIV = 0;
		this.defenseIV = 0;
		this.level = 0;
		this.attack = ((baseAttack + attackIV) * CPM[level]);
		this.defense = ((baseDefense + defenseIV) * CPM[level]);
		this.hp = (int) ((baseStamina + hpIV) * CPM[level]);
		this.cp = getCp();

	}


	/**
	 * @return the attackIV
	 */
	public int getAttackIV() {

		return attackIV;
	}


	/**
	 * @param attackIV
	 *            the attackIV to set
	 */
	public void setAttackIV(int attackIV) {

		this.attackIV = attackIV;
		updateAttack();
	}


	/**
	 * @return the hpIV
	 */
	public int getHpIV() {

		return hpIV;
	}


	/**
	 * @param hpIV
	 *            the hpIV to set
	 */
	public void setHpIV(int hpIV) {

		this.hpIV = hpIV;
		updateHP();
	}


	/**
	 * @return the defenseIV
	 */
	public int getDefenseIV() {

		return defenseIV;
	}


	/**
	 * @param defenseIV
	 *            the defenseIV to set
	 */
	public void setDefenseIV(int defenseIV) {

		this.defenseIV = defenseIV;
		updateDefense();
	}


	/**
	 * @return the cp
	 */
	public int getCp() {

		int preCP = (int) ((attack * Math.sqrt(defense) * Math.sqrt(hp) * Math.pow(CPM[level], 2)) / 10.0);
		cp = Math.max(preCP, 10);
		return cp;
	}


	/**
	 * @return the name
	 */
	public String getName() {

		return name;
	}


	/**
	 * @return the quickMoves
	 */
	public List<QuickMove> getQuickMoves() {

		return quickMoves;
	}


	/**
	 * @return the chargeMoves
	 */
	public List<ChargeMove> getChargeMoves() {

		return chargeMoves;
	}


	/**
	 * @return the typeA
	 */
	public int getTypeA() {

		return typeA;
	}


	/**
	 * @return the typeB
	 */
	public int getTypeB() {

		return typeB;
	}


	/**
	 * @return the isFinalEvolution
	 */
	public boolean isFinalEvolution() {

		return isFinalEvolution;
	}


	/**
	 * @return the dexEntry
	 */
	public int getDexEntry() {

		return dexEntry;
	}


	/**
	 * 
	 * @param qm
	 */
	public void learnQuickMove(QuickMove qm) {

		quickMoves.add(qm);
	}


	public void learnChargeMove(ChargeMove cm) {

		chargeMoves.add(cm);
	}


	/**
	 * @return the level
	 */
	public int getLevel() {

		return level;
	}


	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {

		this.level = level;
		updateAttack();
		updateDefense();
		updateHP();
	}


	private void updateHP() {

		this.hp = (int) ((baseStamina + hpIV) * CPM[level]);

	}


	private void updateDefense() {

		this.defense = (baseDefense + defenseIV) * CPM[level];
	}


	private void updateAttack() {

		this.attack = (baseAttack + attackIV) * CPM[level];
	}


	public Pokemon mYclone() {
		Pokemon ditto = new Pokemon(dexEntry, name, typeA, typeB, baseAttack, baseStamina, baseDefense, isFinalEvolution);
		ditto.setAttackIV(attackIV);
		ditto.setDefenseIV(defenseIV);
		ditto.setHpIV(hpIV);
		
		for(QuickMove qm: quickMoves)
			ditto.learnQuickMove(qm);
		for(ChargeMove cm: chargeMoves)
			ditto.learnChargeMove(cm);
		
		
		return ditto;
	}


	/**
	 * @return the hp
	 */
	public int getHp() {

		return hp;
	}


	/**
	 * @return the attack
	 */
	public double getAttack() {

		return attack;
	}


	/**
	 * @return the defense
	 */
	public double getDefense() {

		return defense;
	}


}
