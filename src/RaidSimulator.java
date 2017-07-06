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
public class RaidSimulator {


	private static final double DISADVANTAGE = 0.714;
	private static final double ADVANTAGE = 1.4;
	private static final double IMUNITY = 0.51;
	private static final int TEAM_SIZE = 6;


	private static double[][] typeChartAdvantage = new double[18][18];

	static {
		for (int i = 0; i < 18; i++)
			for (int j = 0; j < 18; j++)
				typeChartAdvantage[i][j] = 1.0;


		typeChartAdvantage[Types.NORMAL][Types.ROCK] = DISADVANTAGE;
		typeChartAdvantage[Types.NORMAL][Types.GHOST] = IMUNITY;
		typeChartAdvantage[Types.NORMAL][Types.STEEL] = DISADVANTAGE;

		typeChartAdvantage[Types.FIRE][Types.FIRE] = DISADVANTAGE;
		typeChartAdvantage[Types.FIRE][Types.WATER] = DISADVANTAGE;
		typeChartAdvantage[Types.FIRE][Types.GRASS] = ADVANTAGE;
		typeChartAdvantage[Types.FIRE][Types.ICE] = ADVANTAGE;
		typeChartAdvantage[Types.FIRE][Types.BUG] = ADVANTAGE;
		typeChartAdvantage[Types.FIRE][Types.ROCK] = DISADVANTAGE;
		typeChartAdvantage[Types.FIRE][Types.DRAGON] = DISADVANTAGE;
		typeChartAdvantage[Types.FIRE][Types.STEEL] = ADVANTAGE;


		typeChartAdvantage[Types.WATER][Types.FIRE] = ADVANTAGE;
		typeChartAdvantage[Types.WATER][Types.WATER] = DISADVANTAGE;
		typeChartAdvantage[Types.WATER][Types.GRASS] = DISADVANTAGE;
		typeChartAdvantage[Types.WATER][Types.GROUND] = ADVANTAGE;
		typeChartAdvantage[Types.WATER][Types.ROCK] = ADVANTAGE;
		typeChartAdvantage[Types.WATER][Types.DRAGON] = ADVANTAGE;


		typeChartAdvantage[Types.GRASS][Types.FIRE] = DISADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.WATER] = ADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.GRASS] = DISADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.POISON] = DISADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.GROUND] = ADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.FLYING] = DISADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.BUG] = DISADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.DRAGON] = DISADVANTAGE;
		typeChartAdvantage[Types.GRASS][Types.STEEL] = DISADVANTAGE;


		typeChartAdvantage[Types.ELECTRIC][Types.WATER] = ADVANTAGE;
		typeChartAdvantage[Types.ELECTRIC][Types.GRASS] = DISADVANTAGE;
		typeChartAdvantage[Types.ELECTRIC][Types.ELECTRIC] = DISADVANTAGE;
		typeChartAdvantage[Types.ELECTRIC][Types.GROUND] = IMUNITY;
		typeChartAdvantage[Types.ELECTRIC][Types.FLYING] = ADVANTAGE;
		typeChartAdvantage[Types.ELECTRIC][Types.DRAGON] = DISADVANTAGE;


		typeChartAdvantage[Types.ICE][Types.FIRE] = DISADVANTAGE;
		typeChartAdvantage[Types.ICE][Types.WATER] = DISADVANTAGE;
		typeChartAdvantage[Types.ICE][Types.GRASS] = ADVANTAGE;
		typeChartAdvantage[Types.ICE][Types.ICE] = DISADVANTAGE;
		typeChartAdvantage[Types.ICE][Types.GROUND] = ADVANTAGE;
		typeChartAdvantage[Types.ICE][Types.FLYING] = ADVANTAGE;
		typeChartAdvantage[Types.ICE][Types.DRAGON] = ADVANTAGE;
		typeChartAdvantage[Types.ICE][Types.STEEL] = DISADVANTAGE;

		typeChartAdvantage[Types.FIGHTING][Types.NORMAL] = ADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.ICE] = ADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.POISON] = DISADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.FLYING] = DISADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.PSYCHIC] = DISADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.BUG] = DISADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.ROCK] = ADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.GHOST] = IMUNITY;
		typeChartAdvantage[Types.FIGHTING][Types.DARK] = ADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.STEEL] = ADVANTAGE;
		typeChartAdvantage[Types.FIGHTING][Types.FAIRY] = DISADVANTAGE;

		typeChartAdvantage[Types.POISON][Types.GRASS] = ADVANTAGE;
		typeChartAdvantage[Types.POISON][Types.POISON] = DISADVANTAGE;
		typeChartAdvantage[Types.POISON][Types.GROUND] = DISADVANTAGE;
		typeChartAdvantage[Types.POISON][Types.ROCK] = DISADVANTAGE;
		typeChartAdvantage[Types.POISON][Types.GHOST] = DISADVANTAGE;
		typeChartAdvantage[Types.POISON][Types.STEEL] = IMUNITY;
		typeChartAdvantage[Types.POISON][Types.FAIRY] = ADVANTAGE;

		typeChartAdvantage[Types.GROUND][Types.FIRE] = ADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.POISON] = DISADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.ELECTRIC] = ADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.POISON] = ADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.FLYING] = IMUNITY;
		typeChartAdvantage[Types.GROUND][Types.BUG] = DISADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.ROCK] = ADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.STEEL] = ADVANTAGE;

		typeChartAdvantage[Types.FLYING][Types.GRASS] = ADVANTAGE;
		typeChartAdvantage[Types.FLYING][Types.ELECTRIC] = DISADVANTAGE;
		typeChartAdvantage[Types.FLYING][Types.FIGHTING] = ADVANTAGE;
		typeChartAdvantage[Types.FLYING][Types.BUG] = ADVANTAGE;
		typeChartAdvantage[Types.FLYING][Types.ROCK] = DISADVANTAGE;
		typeChartAdvantage[Types.FLYING][Types.STEEL] = DISADVANTAGE;


		typeChartAdvantage[Types.PSYCHIC][Types.FIGHTING] = ADVANTAGE;
		typeChartAdvantage[Types.PSYCHIC][Types.POISON] = ADVANTAGE;
		typeChartAdvantage[Types.PSYCHIC][Types.PSYCHIC] = DISADVANTAGE;
		typeChartAdvantage[Types.PSYCHIC][Types.DARK] = IMUNITY;
		typeChartAdvantage[Types.PSYCHIC][Types.STEEL] = DISADVANTAGE;

		typeChartAdvantage[Types.BUG][Types.FIRE] = DISADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.GRASS] = ADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.FIGHTING] = DISADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.POISON] = DISADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.FLYING] = DISADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.PSYCHIC] = ADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.GHOST] = DISADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.DARK] = ADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.STEEL] = DISADVANTAGE;
		typeChartAdvantage[Types.BUG][Types.FAIRY] = DISADVANTAGE;

		typeChartAdvantage[Types.ROCK][Types.FIRE] = ADVANTAGE;
		typeChartAdvantage[Types.ROCK][Types.ICE] = ADVANTAGE;
		typeChartAdvantage[Types.ROCK][Types.FIGHTING] = DISADVANTAGE;
		typeChartAdvantage[Types.ROCK][Types.GROUND] = DISADVANTAGE;
		typeChartAdvantage[Types.ROCK][Types.FLYING] = ADVANTAGE;
		typeChartAdvantage[Types.ROCK][Types.BUG] = ADVANTAGE;
		typeChartAdvantage[Types.ROCK][Types.STEEL] = DISADVANTAGE;

		typeChartAdvantage[Types.GHOST][Types.NORMAL] = IMUNITY;
		typeChartAdvantage[Types.GHOST][Types.PSYCHIC] = ADVANTAGE;
		typeChartAdvantage[Types.GHOST][Types.GHOST] = ADVANTAGE;
		typeChartAdvantage[Types.GHOST][Types.DARK] = DISADVANTAGE;

		typeChartAdvantage[Types.DRAGON][Types.DRAGON] = ADVANTAGE;
		typeChartAdvantage[Types.DRAGON][Types.STEEL] = DISADVANTAGE;
		typeChartAdvantage[Types.DRAGON][Types.FAIRY] = IMUNITY;

		typeChartAdvantage[Types.DARK][Types.FIGHTING] = DISADVANTAGE;
		typeChartAdvantage[Types.DARK][Types.PSYCHIC] = ADVANTAGE;
		typeChartAdvantage[Types.DARK][Types.GHOST] = ADVANTAGE;
		typeChartAdvantage[Types.DARK][Types.DARK] = DISADVANTAGE;
		typeChartAdvantage[Types.DARK][Types.FAIRY] = DISADVANTAGE;


		typeChartAdvantage[Types.STEEL][Types.FIRE] = DISADVANTAGE;
		typeChartAdvantage[Types.STEEL][Types.WATER] = DISADVANTAGE;
		typeChartAdvantage[Types.STEEL][Types.ELECTRIC] = DISADVANTAGE;
		typeChartAdvantage[Types.STEEL][Types.ICE] = ADVANTAGE;
		typeChartAdvantage[Types.STEEL][Types.ROCK] = ADVANTAGE;
		typeChartAdvantage[Types.STEEL][Types.STEEL] = DISADVANTAGE;
		typeChartAdvantage[Types.STEEL][Types.FAIRY] = ADVANTAGE;

		typeChartAdvantage[Types.FAIRY][Types.FIRE] = DISADVANTAGE;
		typeChartAdvantage[Types.FAIRY][Types.FIGHTING] = ADVANTAGE;
		typeChartAdvantage[Types.FAIRY][Types.POISON] = DISADVANTAGE;
		typeChartAdvantage[Types.FAIRY][Types.DRAGON] = ADVANTAGE;
		typeChartAdvantage[Types.FAIRY][Types.DARK] = ADVANTAGE;
		typeChartAdvantage[Types.FAIRY][Types.STEEL] = ADVANTAGE;


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


	}


	public void simulateBatle() {

		double stab;
		double effective;

		int attackerQuickAttackDamage;


		if (attackerQm.getType() == attacker.getTypeA() || attackerQm.getType() == attacker.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeChartAdvantage[attackerQm.getType()][defender.getTypeA()];
		if (defender.getTypeB() != -1 && effective != IMUNITY)
			effective *= typeChartAdvantage[attackerQm.getType()][defender.getTypeB()];


		double damage = 1 / 2 * attackerQm.getPower() * (attacker.getAttack() / defender.getDefense()) * stab
				* effective;


		attackerQuickAttackDamage = ((int) (Math.floor(damage)) + 1) * numberOFAttackers;


		int attackerChargeAttackDamage;


		if (attackerCm.getType() == attacker.getTypeA() || attackerCm.getType() == attacker.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeChartAdvantage[attackerCm.getType()][defender.getTypeA()];
		if (defender.getTypeB() != -1 && effective != IMUNITY)
			effective *= typeChartAdvantage[attackerCm.getType()][defender.getTypeB()];


		damage = 1 / 2 * attackerCm.getPower() * (attacker.getAttack() / defender.getDefense()) * stab * effective;


		attackerChargeAttackDamage = ((int) (Math.floor(damage)) + 1) * numberOFAttackers;


		int defenderQuickAttackDamage;


		if (defenderQm.getType() == defender.getTypeA() || defenderQm.getType() == defender.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeChartAdvantage[defenderQm.getType()][attacker.getTypeA()];
		if (defender.getTypeB() != -1 && effective != IMUNITY)
			effective *= typeChartAdvantage[defenderQm.getType()][attacker.getTypeB()];


		damage = 1 / 2 * defenderQm.getPower() * (defender.getAttack() / attacker.getDefense()) * stab * effective;


		defenderQuickAttackDamage = (int) (Math.floor(damage)) + 1;


		int defenderChargeAttackDamage;


		if (defenderCm.getType() == defender.getTypeA() || defenderCm.getType() == defender.getTypeB())
			stab = 1.2;
		else
			stab = 1.0;

		effective = typeChartAdvantage[defenderCm.getType()][attacker.getTypeA()];
		if (defender.getTypeB() != -1 && effective != IMUNITY)
			effective *= typeChartAdvantage[defenderCm.getType()][attacker.getTypeB()];


		damage = 1 / 2 * defenderCm.getPower() * (defender.getAttack() / attacker.getDefense()) * stab * effective;


		defenderChargeAttackDamage = (int) (Math.floor(damage)) + 1;


		int timer = 180 * 100;

		int attackerLastQm = Integer.MAX_VALUE;
		int attackerLastCm = Integer.MAX_VALUE;
		int defenderLastQm = Integer.MAX_VALUE;
		int defenderLastCm = Integer.MAX_VALUE;
		boolean attackerDoingChargeAttack = false;
		boolean deffenderDoingChargeAttack = false;
		int attackerPokemonFainted = 0;

		Random rng = new Random();


		while (true) {
			if (timer < 0)
				break;


			if (attackerEnergy >= attackerCm.getEnergyLost()) {

				if (!attackerDoingChargeAttack) {
					attackerDoingChargeAttack = true;
					attackerLastCm = timer;


				} else if (attackerLastCm - timer >= attackerCm.getCooldown()) {

					defenderHealthPoints -= attackerChargeAttackDamage;

					if (defenderHealthPoints <= 0)
						break;

					attackerEnergy -= attackerCm.getEnergyLost();

					defenderEnergy = Math.min(defenderEnergy + attackerChargeAttackDamage / 2, 100);

					attackerDoingChargeAttack = false;
				}


			} else if (attackerLastQm - timer >= attackerQm.getCooldown()) {
				defenderHealthPoints -= attackerQuickAttackDamage;

				if (defenderHealthPoints <= 0)
					break;


				attackerLastQm = timer;

				attackerEnergy = Math.min(attackerEnergy + attackerQm.getEnergyGain(), 100);

				defenderEnergy = Math.min(defenderEnergy + attackerQuickAttackDamage / 2, 100);

			}


			if (defenderEnergy >= defenderCm.getEnergyLost()) {

				if (!deffenderDoingChargeAttack) {
					if (rng.nextBoolean()) {
						deffenderDoingChargeAttack = true;
						defenderLastCm = timer - (15 + rng.nextInt(25));
					}


				} else if (defenderLastCm - timer >= defenderCm.getCooldown()) {

					attackerHealthPoints -= defenderChargeAttackDamage;

					if (attackerHealthPoints <= 0) {
						attackerPokemonFainted++;
						if (attackerPokemonFainted == TEAM_SIZE)
							break;
					}

					defenderEnergy -= defenderCm.getEnergyLost();

					attackerEnergy = Math.min(attackerEnergy + defenderChargeAttackDamage / 2, 100);

					deffenderDoingChargeAttack = false;
					continue;
				}



			}

			if (defenderLastQm - timer >= defenderQm.getCooldown() && !deffenderDoingChargeAttack) {
				attackerHealthPoints -= defenderQuickAttackDamage;

				if (attackerHealthPoints <= 0) {
					attackerPokemonFainted++;
					if (attackerPokemonFainted == TEAM_SIZE)
						break;
				}


				defenderLastQm = timer - (15 + rng.nextInt(25));

				defenderEnergy = Math.min(attackerEnergy + defenderQm.getEnergyGain(), 100);

				attackerEnergy = Math.min(attackerEnergy + defenderQuickAttackDamage / 2, 100);

			}

			timer--;


		}


	}


	public boolean didAttackerWin() {

		return defenderHealthPoints <= 0;
	}


	public boolean wasItClose() {

		return defender.getHp() / 10 <= defenderHealthPoints;

	}


	public void resetBatle() {

		attackerEnergy = 0;
		defenderEnergy = 0;
		attackerHealthPoints = attacker.getHp();
		defenderHealthPoints = defender.getHp();

	}


}
