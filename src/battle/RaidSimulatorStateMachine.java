
package battle;


import java.util.Random;

import moves.ChargeMove;
import moves.Moves;
import moves.QuickMove;
import moves.Types;
import pokemons.Pokemon;
import pokemons.RaidBoss;

/**
 * 
 */

/**
 * @author Ricardo Martinho
 *
 */
public class RaidSimulatorStateMachine {

	protected enum STATE {
		NOTHING, START_QUICK_ATTACK, START_CHARGE_ATTACK, DOING_QUICK_ATTACK, DOING_CHARGE_ATTACK, FINISHED_QUICK_ATTACK, FINISH_CHARGE_ATTACK;
	}


	private static final double DISADVANTAGE = 0.714;
	private static final double ADVANTAGE = 1.4;
	private static final double IMUNITY = 0.51;
	private static final int TEAM_SIZE = 6;
	private static final double STAB_BONUS = 1.2;

	private static final int CHARGE_TIME = 100;

	private int timeRemaming;

	private static final boolean DEBUG = false;


	protected static double[][] typeAdavantageChart = new double[18][18];

	static {
		for (int i = 0; i < 18; i++)
			for (int j = 0; j < 18; j++)
				typeAdavantageChart[i][j] = 1.0;


		typeAdavantageChart[Types.NORMAL][Types.ROCK] = DISADVANTAGE;
		typeAdavantageChart[Types.NORMAL][Types.GHOST] = IMUNITY;
		typeAdavantageChart[Types.NORMAL][Types.STEEL] = DISADVANTAGE;

		typeAdavantageChart[Types.FIRE][Types.FIRE] = DISADVANTAGE;
		typeAdavantageChart[Types.FIRE][Types.WATER] = DISADVANTAGE;
		typeAdavantageChart[Types.FIRE][Types.GRASS] = ADVANTAGE;
		typeAdavantageChart[Types.FIRE][Types.ICE] = ADVANTAGE;
		typeAdavantageChart[Types.FIRE][Types.BUG] = ADVANTAGE;
		typeAdavantageChart[Types.FIRE][Types.ROCK] = DISADVANTAGE;
		typeAdavantageChart[Types.FIRE][Types.DRAGON] = DISADVANTAGE;
		typeAdavantageChart[Types.FIRE][Types.STEEL] = ADVANTAGE;


		typeAdavantageChart[Types.WATER][Types.FIRE] = ADVANTAGE;
		typeAdavantageChart[Types.WATER][Types.WATER] = DISADVANTAGE;
		typeAdavantageChart[Types.WATER][Types.GRASS] = DISADVANTAGE;
		typeAdavantageChart[Types.WATER][Types.GROUND] = ADVANTAGE;
		typeAdavantageChart[Types.WATER][Types.ROCK] = ADVANTAGE;
		typeAdavantageChart[Types.WATER][Types.DRAGON] = ADVANTAGE;


		typeAdavantageChart[Types.GRASS][Types.FIRE] = DISADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.WATER] = ADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.GRASS] = DISADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.POISON] = DISADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.GROUND] = ADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.FLYING] = DISADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.BUG] = DISADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.DRAGON] = DISADVANTAGE;
		typeAdavantageChart[Types.GRASS][Types.STEEL] = DISADVANTAGE;


		typeAdavantageChart[Types.ELECTRIC][Types.WATER] = ADVANTAGE;
		typeAdavantageChart[Types.ELECTRIC][Types.GRASS] = DISADVANTAGE;
		typeAdavantageChart[Types.ELECTRIC][Types.ELECTRIC] = DISADVANTAGE;
		typeAdavantageChart[Types.ELECTRIC][Types.GROUND] = IMUNITY;
		typeAdavantageChart[Types.ELECTRIC][Types.FLYING] = ADVANTAGE;
		typeAdavantageChart[Types.ELECTRIC][Types.DRAGON] = DISADVANTAGE;


		typeAdavantageChart[Types.ICE][Types.FIRE] = DISADVANTAGE;
		typeAdavantageChart[Types.ICE][Types.WATER] = DISADVANTAGE;
		typeAdavantageChart[Types.ICE][Types.GRASS] = ADVANTAGE;
		typeAdavantageChart[Types.ICE][Types.ICE] = DISADVANTAGE;
		typeAdavantageChart[Types.ICE][Types.GROUND] = ADVANTAGE;
		typeAdavantageChart[Types.ICE][Types.FLYING] = ADVANTAGE;
		typeAdavantageChart[Types.ICE][Types.DRAGON] = ADVANTAGE;
		typeAdavantageChart[Types.ICE][Types.STEEL] = DISADVANTAGE;

		typeAdavantageChart[Types.FIGHTING][Types.NORMAL] = ADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.ICE] = ADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.POISON] = DISADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.FLYING] = DISADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.PSYCHIC] = DISADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.BUG] = DISADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.ROCK] = ADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.GHOST] = IMUNITY;
		typeAdavantageChart[Types.FIGHTING][Types.DARK] = ADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.STEEL] = ADVANTAGE;
		typeAdavantageChart[Types.FIGHTING][Types.FAIRY] = DISADVANTAGE;

		typeAdavantageChart[Types.POISON][Types.GRASS] = ADVANTAGE;
		typeAdavantageChart[Types.POISON][Types.POISON] = DISADVANTAGE;
		typeAdavantageChart[Types.POISON][Types.GROUND] = DISADVANTAGE;
		typeAdavantageChart[Types.POISON][Types.ROCK] = DISADVANTAGE;
		typeAdavantageChart[Types.POISON][Types.GHOST] = DISADVANTAGE;
		typeAdavantageChart[Types.POISON][Types.STEEL] = IMUNITY;
		typeAdavantageChart[Types.POISON][Types.FAIRY] = ADVANTAGE;

		typeAdavantageChart[Types.GROUND][Types.FIRE] = ADVANTAGE;
		typeAdavantageChart[Types.GROUND][Types.POISON] = DISADVANTAGE;
		typeAdavantageChart[Types.GROUND][Types.ELECTRIC] = ADVANTAGE;
		typeAdavantageChart[Types.GROUND][Types.POISON] = ADVANTAGE;
		typeAdavantageChart[Types.GROUND][Types.FLYING] = IMUNITY;
		typeAdavantageChart[Types.GROUND][Types.BUG] = DISADVANTAGE;
		typeAdavantageChart[Types.GROUND][Types.ROCK] = ADVANTAGE;
		typeAdavantageChart[Types.GROUND][Types.STEEL] = ADVANTAGE;

		typeAdavantageChart[Types.FLYING][Types.GRASS] = ADVANTAGE;
		typeAdavantageChart[Types.FLYING][Types.ELECTRIC] = DISADVANTAGE;
		typeAdavantageChart[Types.FLYING][Types.FIGHTING] = ADVANTAGE;
		typeAdavantageChart[Types.FLYING][Types.BUG] = ADVANTAGE;
		typeAdavantageChart[Types.FLYING][Types.ROCK] = DISADVANTAGE;
		typeAdavantageChart[Types.FLYING][Types.STEEL] = DISADVANTAGE;


		typeAdavantageChart[Types.PSYCHIC][Types.FIGHTING] = ADVANTAGE;
		typeAdavantageChart[Types.PSYCHIC][Types.POISON] = ADVANTAGE;
		typeAdavantageChart[Types.PSYCHIC][Types.PSYCHIC] = DISADVANTAGE;
		typeAdavantageChart[Types.PSYCHIC][Types.DARK] = IMUNITY;
		typeAdavantageChart[Types.PSYCHIC][Types.STEEL] = DISADVANTAGE;

		typeAdavantageChart[Types.BUG][Types.FIRE] = DISADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.GRASS] = ADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.FIGHTING] = DISADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.POISON] = DISADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.FLYING] = DISADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.PSYCHIC] = ADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.GHOST] = DISADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.DARK] = ADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.STEEL] = DISADVANTAGE;
		typeAdavantageChart[Types.BUG][Types.FAIRY] = DISADVANTAGE;

		typeAdavantageChart[Types.ROCK][Types.FIRE] = ADVANTAGE;
		typeAdavantageChart[Types.ROCK][Types.ICE] = ADVANTAGE;
		typeAdavantageChart[Types.ROCK][Types.FIGHTING] = DISADVANTAGE;
		typeAdavantageChart[Types.ROCK][Types.GROUND] = DISADVANTAGE;
		typeAdavantageChart[Types.ROCK][Types.FLYING] = ADVANTAGE;
		typeAdavantageChart[Types.ROCK][Types.BUG] = ADVANTAGE;
		typeAdavantageChart[Types.ROCK][Types.STEEL] = DISADVANTAGE;

		typeAdavantageChart[Types.GHOST][Types.NORMAL] = IMUNITY;
		typeAdavantageChart[Types.GHOST][Types.PSYCHIC] = ADVANTAGE;
		typeAdavantageChart[Types.GHOST][Types.GHOST] = ADVANTAGE;
		typeAdavantageChart[Types.GHOST][Types.DARK] = DISADVANTAGE;

		typeAdavantageChart[Types.DRAGON][Types.DRAGON] = ADVANTAGE;
		typeAdavantageChart[Types.DRAGON][Types.STEEL] = DISADVANTAGE;
		typeAdavantageChart[Types.DRAGON][Types.FAIRY] = IMUNITY;

		typeAdavantageChart[Types.DARK][Types.FIGHTING] = DISADVANTAGE;
		typeAdavantageChart[Types.DARK][Types.PSYCHIC] = ADVANTAGE;
		typeAdavantageChart[Types.DARK][Types.GHOST] = ADVANTAGE;
		typeAdavantageChart[Types.DARK][Types.DARK] = DISADVANTAGE;
		typeAdavantageChart[Types.DARK][Types.FAIRY] = DISADVANTAGE;


		typeAdavantageChart[Types.STEEL][Types.FIRE] = DISADVANTAGE;
		typeAdavantageChart[Types.STEEL][Types.WATER] = DISADVANTAGE;
		typeAdavantageChart[Types.STEEL][Types.ELECTRIC] = DISADVANTAGE;
		typeAdavantageChart[Types.STEEL][Types.ICE] = ADVANTAGE;
		typeAdavantageChart[Types.STEEL][Types.ROCK] = ADVANTAGE;
		typeAdavantageChart[Types.STEEL][Types.STEEL] = DISADVANTAGE;
		typeAdavantageChart[Types.STEEL][Types.FAIRY] = ADVANTAGE;

		typeAdavantageChart[Types.FAIRY][Types.FIRE] = DISADVANTAGE;
		typeAdavantageChart[Types.FAIRY][Types.FIGHTING] = ADVANTAGE;
		typeAdavantageChart[Types.FAIRY][Types.POISON] = DISADVANTAGE;
		typeAdavantageChart[Types.FAIRY][Types.DRAGON] = ADVANTAGE;
		typeAdavantageChart[Types.FAIRY][Types.DARK] = ADVANTAGE;
		typeAdavantageChart[Types.FAIRY][Types.STEEL] = ADVANTAGE;


	}

	private Attacker attacker;
	private Defender defender;

	private int numberOFAttackers;


	public RaidSimulatorStateMachine(Pokemon attacker, RaidBoss defender, QuickMove attackerQm, QuickMove defenderQm,
			ChargeMove attackerCm, ChargeMove defenderCm, int numerOfAttackers) {

		this.attacker = new Attacker(attacker, attackerQm, attackerCm);
		this.attacker.setQuickAttackDamage(calculateDamage(attacker, defender, attackerQm));
		this.attacker.setChargeAttackDamage(calculateDamage(attacker, defender, attackerCm));


		this.defender = new Defender(defender, defenderQm, defenderCm);
		this.defender.setChargeAttackDamage(calculateDamage(defender, attacker, defenderQm));
		this.defender.setChargeAttackDamage(calculateDamage(defender, attacker, defenderCm));

		this.numberOFAttackers = numerOfAttackers;
		resetBatle();


	}


	private int calculateDamage(Pokemon attacker, Pokemon defender, Moves move) {

		double stab, effective;


		if (move.getType() == attacker.getTypeA() || move.getType() == attacker.getTypeB())
			stab = STAB_BONUS;
		else
			stab = 1.0;

		effective = typeAdavantageChart[move.getType()][defender.getTypeA()];
		if (defender.getTypeB() != -1)
			effective *= typeAdavantageChart[move.getType()][defender.getTypeB()];

		effective = Math.max(effective, IMUNITY);


		double damage = 0.5 * move.getPower() * (attacker.getAttack() / defender.getDefense()) * stab * effective;

		int result = ((int) (Math.floor(damage)) + 1) * numberOFAttackers;

		return result;
	}


	public void simulateBatle() {

		int timer = 0;

		STATE attackerState, defenderState;

		int attackerWait = 0;
		int defenderWait = 0;
		int attackerLastQm = Integer.MIN_VALUE;
		int attackerLastCm = Integer.MIN_VALUE;
		int defenderLastQm = Integer.MIN_VALUE;
		int defenderLastCm = Integer.MIN_VALUE;
		boolean battleEnd = false;

		Random rng = new Random();
		int randomTimer;
		int numberOfDeaths = 0;


		while (timer < 180 * 100 && !battleEnd) {

			attackerState = attacker.getState();
			defenderState = defender.getState();

			// Attacker
			switch (attackerState) {
			case NOTHING:
				if (attacker.getEnergy() >= attacker.getChargeMove().getEnergyLost()) {
					// Do charge Attack

					attackerWait = 0;
					attacker.setState(STATE.START_CHARGE_ATTACK);


				} else {
					// Do quick attack

					attackerWait = 0;
					attacker.setState(STATE.START_QUICK_ATTACK);


				}


				break;
			case START_QUICK_ATTACK:
				attackerLastQm = timer;
				attackerWait = attacker.getQuickMove().getCooldown();


				attacker.setState(STATE.DOING_QUICK_ATTACK);
				break;

			case DOING_QUICK_ATTACK:
				if (timer - attackerLastQm >= attacker.getQuickMove().getCooldown()) {
					attackerWait = 0;
					attacker.setState(STATE.FINISHED_QUICK_ATTACK);
				} else {
					attackerWait = attacker.getQuickMove().getCooldown() - (timer - attackerLastQm);
				}


				break;
			case FINISHED_QUICK_ATTACK:
				defender.getAttacked(attacker.getQuickAttackDamage());
				attacker.gainEnergy(attacker.getQuickMove().getEnergyGain());

				battleEnd = !defender.isAlive();

				attackerWait = 0;
				attacker.setState(STATE.NOTHING);


				break;
			case START_CHARGE_ATTACK:
				attackerLastCm = timer + CHARGE_TIME;
				attackerWait = attacker.getChargeMove().getCooldown() + CHARGE_TIME;

				attacker.setState(STATE.DOING_CHARGE_ATTACK);


				break;
			case DOING_CHARGE_ATTACK:
				if (timer - attackerLastCm >= attacker.getChargeMove().getCooldown()) {
					attackerWait = 0;
					attacker.setState(STATE.FINISHED_QUICK_ATTACK);
				} else {
					attackerWait = attacker.getChargeMove().getCooldown() - (timer - attackerLastQm);
				}


				break;

			case FINISH_CHARGE_ATTACK:
				defender.getAttacked(attacker.getChargeAttackDamage());
				attacker.loseEnergy(attacker.getChargeMove().getEnergyLost());

				battleEnd = !defender.isAlive();

				attackerWait = 0;
				attacker.setState(STATE.NOTHING);


				break;
			}


			// Defender
			switch (defenderState) {
			case NOTHING:
				if (defender.getEnergy() >= attacker.getChargeMove().getEnergyLost() && rng.nextBoolean()) {
					// Do charge Attack

					defenderWait = 0;
					attacker.setState(STATE.START_CHARGE_ATTACK);


				} else {
					// Do quick attack

					defenderWait = 0;
					defender.setState(STATE.START_QUICK_ATTACK);


				}


				break;
			case START_QUICK_ATTACK:
				randomTimer = 150 + rng.nextInt(250 - 150);
				defenderLastQm = timer + randomTimer;
				defenderWait = defender.getQuickMove().getCooldown() + randomTimer;


				defender.setState(STATE.DOING_QUICK_ATTACK);
				break;
			case DOING_QUICK_ATTACK:
				if (timer - defenderLastQm >= defender.getQuickMove().getCooldown()) {
					defenderWait = 0;
					defender.setState(STATE.FINISHED_QUICK_ATTACK);
				} else {
					defenderWait = defender.getQuickMove().getCooldown() - (timer - defenderLastQm);
				}


				break;
			case FINISHED_QUICK_ATTACK:

				attacker.getAttacked(defender.getQuickAttackDamage());
				defender.gainEnergy(defender.getQuickMove().getEnergyGain());


				if (!attacker.isAlive()) {
					numberOfDeaths++;
					attacker.resetHp();
					attacker.setEnergy(0);

					battleEnd = numberOfDeaths == TEAM_SIZE;


				}

				defenderWait = 0;
				defender.setState(STATE.NOTHING);


				break;
			case START_CHARGE_ATTACK:
				randomTimer = 150 + rng.nextInt(250 - 150);
				defenderLastCm = timer + CHARGE_TIME + randomTimer;
				defenderWait = attacker.getChargeMove().getCooldown() + CHARGE_TIME + randomTimer;

				defender.setState(STATE.DOING_CHARGE_ATTACK);

				break;
			case DOING_CHARGE_ATTACK:
				if (timer - defenderLastCm >= defender.getChargeMove().getCooldown()) {
					defenderWait = 0;
					defender.setState(STATE.FINISHED_QUICK_ATTACK);
				} else {
					defenderWait = defender.getChargeMove().getCooldown() - (timer - defenderLastQm);
				}


				break;
			case FINISH_CHARGE_ATTACK:
				attacker.getAttacked(defender.getChargeAttackDamage());
				defender.loseEnergy(defender.getChargeMove().getEnergyLost());

				if (!attacker.isAlive()) {
					numberOfDeaths++;
					attacker.resetHp();
					attacker.setEnergy(0);

					battleEnd = numberOfDeaths == TEAM_SIZE;


				}


				defenderWait = 0;
				defender.setState(STATE.NOTHING);


				break;
			}


		}


		timer += Math.min(attackerWait, defenderWait);


	}


	public boolean didAttackerWin() {

		return !defender.isAlive();
	}


	public void resetBatle() {

		attacker.setEnergy(0);
		defender.setEnergy(0);
		attacker.resetHp();
		defender.resetHp();

	}


	/**
	 * @return the timeRemaming
	 */
	public int getTimeRemaming() {

		return 180 * 100 - timeRemaming;
	}


}
