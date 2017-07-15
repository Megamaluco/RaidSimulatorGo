package battle;
import java.util.Random;

import moves.ChargeMove;
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
@Deprecated
public class RaidSimulator {


	private static final double DISADVANTAGE = 0.714;
	private static final double ADVANTAGE = 1.4;
	private static final double IMUNITY = 0.51;
	private static final int TEAM_SIZE = 6;
	private int timeRemaming;

	private static final boolean DEBUG = false;


	private static double[][] typeAdavantageChart = new double[18][18];

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

	private Pokemon attacker;
	private int attackerEnergy;
	private int attackerHealthPoints;
	private int defenderEnergy;
	private int defenderHealthPoints;
	private RaidBoss defender;
	private int numberOFAttackers;
	private QuickMove attackerQm, defenderQm;
	private ChargeMove attackerCm, defenderCm;


	public RaidSimulator(Pokemon attacker, RaidBoss defender, QuickMove attackerQm, QuickMove defenderQm,
			ChargeMove attackerCm, ChargeMove defenderCm, int numerOfAttackers) {
		this.attacker = attacker;
		this.defender = defender;
		this.numberOFAttackers = numerOfAttackers;
		resetBatle();
		this.attackerQm = attackerQm;
		this.defenderQm = defenderQm;
		this.attackerCm = attackerCm;
		this.defenderCm = defenderCm;
		timeRemaming = 0;


	}


	public void simulateBatle() {

		double stab;
		double effective;

		int attackerQuickAttackDamage;


		if (attackerQm.getType() == attacker.getTypeA() || attackerQm.getType() == attacker.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeAdavantageChart[attackerQm.getType()][defender.getTypeA()];
		if (defender.getTypeB() != -1)
			effective *= typeAdavantageChart[attackerQm.getType()][defender.getTypeB()];
		
		effective = Math.max(effective,IMUNITY);


		double damage = 0.5 * attackerQm.getPower() * (attacker.getAttack() / defender.getDefense()) * stab * effective;


		attackerQuickAttackDamage = ((int) (Math.floor(damage)) + 1) * numberOFAttackers;


		int attackerChargeAttackDamage;


		if (attackerCm.getType() == attacker.getTypeA() || attackerCm.getType() == attacker.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeAdavantageChart[attackerCm.getType()][defender.getTypeA()];
		if (defender.getTypeB() != -1)
			effective *= typeAdavantageChart[attackerCm.getType()][defender.getTypeB()];
		
		effective = Math.max(effective,IMUNITY);


		damage = 0.5 * attackerCm.getPower() * (attacker.getAttack() / defender.getDefense()) * stab * effective;


		attackerChargeAttackDamage = ((int) (Math.floor(damage)) + 1) * numberOFAttackers;


		int defenderQuickAttackDamage;


		if (defenderQm.getType() == defender.getTypeA() || defenderQm.getType() == defender.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeAdavantageChart[defenderQm.getType()][attacker.getTypeA()];
		if (attacker.getTypeB() != -1)
			effective *= typeAdavantageChart[defenderQm.getType()][attacker.getTypeB()];
		
		effective = Math.max(effective,IMUNITY);


		damage = 0.5 * defenderQm.getPower() * (defender.getAttack() / attacker.getDefense()) * stab * effective;


		defenderQuickAttackDamage = (int) (Math.floor(damage)) + 1;


		int defenderChargeAttackDamage;


		if (defenderCm.getType() == defender.getTypeA() || defenderCm.getType() == defender.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeAdavantageChart[defenderCm.getType()][attacker.getTypeA()];
		if (attacker.getTypeB() != -1)
			effective *= typeAdavantageChart[defenderCm.getType()][attacker.getTypeB()];

		effective = Math.max(effective, IMUNITY);

		damage = 0.5 * defenderCm.getPower() * (defender.getAttack() / attacker.getDefense()) * stab * effective;


		defenderChargeAttackDamage = (int) (Math.floor(damage)) + 1;


		int timer = 180 * 100;

		int attackerLastQm = Integer.MAX_VALUE;
		int attackerLastCm = Integer.MAX_VALUE;
		int defenderLastQm = Integer.MAX_VALUE;
		int defenderLastCm = Integer.MAX_VALUE;
		boolean attackerDoingChargeAttack = false;
		boolean deffenderDoingChargeAttack = false;
		int attackerPokemonFainted = 0;

		int attackHasToWait = 1;
		int defenderHasToWait = 1;

		Random rng = new Random();


		while (timer >= 0) {
			boolean skipDefenderQuickAttack = false;

			if (DEBUG)
				System.out.println(timer);


			if (attackerEnergy >= attackerCm.getEnergyLost()) {

				if (!attackerDoingChargeAttack) {
					attackerDoingChargeAttack = true;
					attackerLastCm = timer;

					attackHasToWait = attackerCm.getCooldown();

					if (DEBUG)
						System.out.println("ATACKER: STARTED CHARGE ATTACK");


				} else if (attackerLastCm - timer >= attackerCm.getCooldown()) {

					defenderHealthPoints -= attackerChargeAttackDamage;

					if (defenderHealthPoints <= 0)
						break;

					attackerEnergy -= attackerCm.getEnergyLost();

					defenderEnergy = Math.min(defenderEnergy + (attackerChargeAttackDamage / 2), 100);

					attackerDoingChargeAttack = false;

					attackHasToWait = 1;

					if (DEBUG)
						System.out.println("ATACKER: FINISHED CHARGE ATTACK");
				}


			} else if (attackerLastQm - timer >= attackerQm.getCooldown()) {
				defenderHealthPoints -= attackerQuickAttackDamage;

				if (defenderHealthPoints <= 0)
					break;


				attackerLastQm = timer;

				attackerEnergy = Math.min(attackerEnergy + attackerQm.getEnergyGain(), 100);

				defenderEnergy = Math.min(defenderEnergy + (attackerQuickAttackDamage / 2), 100);

				attackHasToWait = attackerQm.getCooldown();

				if (DEBUG)
					System.out.println("ATACKER: FINISHED QUICK ATTACK");

			} else {
				attackHasToWait = attackerQm.getCooldown() - (attackerLastQm - timer);
				// System.out.println("ATACKER: DOING QUICK ATTACK");
			}


			if (defenderEnergy >= defenderCm.getEnergyLost()) {

				if (!deffenderDoingChargeAttack) {
					if (rng.nextBoolean()) {
						deffenderDoingChargeAttack = true;
						int randomIncrement = 150 + rng.nextInt(250 - 150);
						defenderLastCm = timer - randomIncrement;

						defenderHasToWait = defenderCm.getCooldown() + randomIncrement;

						if (DEBUG)
							System.out.println("DEFENDER: STARTED CHARGE ATTACK");
					}


				} else if (defenderLastCm - timer >= defenderCm.getCooldown()) {

					attackerHealthPoints -= defenderChargeAttackDamage;

					if (attackerHealthPoints <= 0) {
						attackerPokemonFainted++;
						attackerEnergy = 0;
						attackerHealthPoints = attacker.getHp();
						if (attackerPokemonFainted == TEAM_SIZE)
							break;
					}

					defenderEnergy -= defenderCm.getEnergyLost();

					attackerEnergy = Math.min(attackerEnergy + (defenderChargeAttackDamage / 2), 100);

					deffenderDoingChargeAttack = false;
					timer--;
					defenderHasToWait = defenderCm.getCooldown();
					skipDefenderQuickAttack = true;

					if (DEBUG)
						System.out.println("DEFENDER: FINISHED CHARGE ATTACK");
				}


			}

			if (defenderLastQm - timer >= defenderQm.getCooldown() && !deffenderDoingChargeAttack
					&& !skipDefenderQuickAttack) {
				attackerHealthPoints -= defenderQuickAttackDamage;

				if (attackerHealthPoints <= 0) {
					attackerPokemonFainted++;
					attackerEnergy = 0;
					if (attackerPokemonFainted == TEAM_SIZE)
						break;
				}

				if (DEBUG)
					System.out.println("DEFENDER: DOING QUICK ATTACK");


				int randomIncrement = 150 + rng.nextInt(250 - 150);

				defenderLastQm = timer - randomIncrement;


				defenderEnergy = Math.min(attackerEnergy + defenderQm.getEnergyGain(), 100);

				attackerEnergy = Math.min(attackerEnergy + defenderQuickAttackDamage / 2, 100);

				defenderHasToWait = defenderQm.getCooldown() + randomIncrement;

			} else if (!deffenderDoingChargeAttack && !skipDefenderQuickAttack) {
				defenderHasToWait = defenderQm.getCooldown() - (defenderLastQm - timer);
			}


			timer -= Math.min(defenderHasToWait, attackHasToWait);
			// timer -= 1;


		}
		timeRemaming = timer;


		// System.out.println("Battle Ended.");

	}


	public boolean didAttackerWin() {

		return defenderHealthPoints <= 0;
	}


	public boolean wasItClose() {

		return (defender.getHp() / 10) >= defenderHealthPoints;

	}


	public void resetBatle() {
		attackerEnergy = 0;
		defenderEnergy = 0;
		attackerHealthPoints = attacker.getHp();
		defenderHealthPoints = defender.getHp();

	}


	/**
	 * @return the timeRemaming
	 */
	public int getTimeRemaming() {
	
		return timeRemaming;
	}


}
