
package pokemons;


import java.util.LinkedList;
import java.util.List;

import moves.ChargeMove;
import moves.QuickMove;

public class Pokemon {


	private static final double[] CPM = { 0.0939999967813492, 0.1351374320893390, 0.1663978695869450,
			0.1926509131553250, 0.2157324701547620, 0.2365726514248220, 0.2557200491428380, 0.2735303721065720,
			0.2902498841285710, 0.3060573813898630, 0.3210875988006590, 0.3354450319964510, 0.3492126762866970,
			0.3624577366099390, 0.3752355873584750, 0.3875924077138780, 0.3995672762393950, 0.4111935532161000,
			0.4225000143051150, 0.4329264205125090, 0.4431075453758240, 0.4530599481650490, 0.4627983868122100,
			0.4723360853112780, 0.4816849529743190, 0.4908558071795490, 0.4998584389686580, 0.5087017489616000,
			0.5173939466476440, 0.5259425161103220, 0.5343543291091920, 0.5426357538035990, 0.5507926940917970,
			0.5588305844903850, 0.5667545199394230, 0.5745691281453700, 0.5822789072990420, 0.5898879078889450,
			0.5974000096321110, 0.6048236486651710, 0.6121572852134700, 0.6194041079582340, 0.6265671253204350,
			0.6336491787485760, 0.6406529545784000, 0.6475809713865540, 0.6544356346130370, 0.6612192658058590,
			0.6679340004920950, 0.6745818856474920, 0.6811649203300480, 0.6876849012553730, 0.6941436529159550,
			0.7005429010330630, 0.7068842053413390, 0.7131690748738230, 0.7193990945816040, 0.7255755869151540,
			0.7317000031471250, 0.7347410385504290, 0.7377694845199580, 0.7407855797371360, 0.7437894344329830,
			0.7467811972477650, 0.7497610449790950, 0.7527290997322810, 0.7556855082511900, 0.7586303702098510,
			0.7615638375282290, 0.7644860495921800, 0.7673971652984620, 0.7702972936773620, 0.7731865048408510,
			0.7760649470649920, 0.7789327502250670, 0.7817900507676660, 0.7846369743347170, 0.7874736085132750,
			0.7903000116348270 };

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


	public Pokemon(int dexEntry, String name, int typeA, int typeB, int baseAttack, int baseStamina, int baseDefense,
			boolean isFinalEvolution) {
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

		Pokemon ditto = new Pokemon(dexEntry, name, typeA, typeB, baseAttack, baseStamina, baseDefense,
				isFinalEvolution);
		ditto.setAttackIV(attackIV);
		ditto.setDefenseIV(defenseIV);
		ditto.setHpIV(hpIV);

		for (QuickMove qm : quickMoves)
			ditto.learnQuickMove(qm);
		for (ChargeMove cm : chargeMoves)
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
