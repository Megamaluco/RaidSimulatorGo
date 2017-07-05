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


		typeChartAdvantage[Types.ELETRIC][Types.WATER] = ADVANTAGE;
		typeChartAdvantage[Types.ELETRIC][Types.GRASS] = DISADVANTAGE;
		typeChartAdvantage[Types.ELETRIC][Types.ELETRIC] = DISADVANTAGE;
		typeChartAdvantage[Types.ELETRIC][Types.GROUND] = IMUNITY;
		typeChartAdvantage[Types.ELETRIC][Types.FLYING] = ADVANTAGE;
		typeChartAdvantage[Types.ELETRIC][Types.DRAGON] = DISADVANTAGE;


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
		typeChartAdvantage[Types.GROUND][Types.ELETRIC] = ADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.POISON] = ADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.FLYING] = IMUNITY;
		typeChartAdvantage[Types.GROUND][Types.BUG] = DISADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.ROCK] = ADVANTAGE;
		typeChartAdvantage[Types.GROUND][Types.STEEL] = ADVANTAGE;

		typeChartAdvantage[Types.FLYING][Types.GRASS] = ADVANTAGE;
		typeChartAdvantage[Types.FLYING][Types.ELETRIC] = DISADVANTAGE;
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
		typeChartAdvantage[Types.STEEL][Types.ELETRIC] = DISADVANTAGE;
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
			ChargeMove attackerCm, ChargeMove defenderCm) {
		this.attacker = attacker;
		this.defender = defender;
		this.numberOFAttackers = 1;
		attackerEnergy = 0;
		defenderEnergy = 0;
		attackerHealthPoints = attacker.getHp();
		defenderHealthPoints = defender.getHp();


	}


	public boolean simulateBatle() {
		
		double stab;
		double effective;
			
		int attackerQuickAttackDamage;
		

		
		if(attackerQm.getType().equals(attacker.getTypeA()) || (attacker.getTypeB()!=null && attackerQm.getType().equals(attacker.getTypeB())))
			stab = 1.2;
		else
			stab = 1.0;
		
		effective = 1.0;
		
		//effective *= 
		
		double damage = 1/2 * attackerQm.getPower() * (attacker.getAttack()/defender.getDefense()) * stab * effective;
		
		
		
		
		
		
		
		
		int attackerChargeAttackDamage;
		int defenderQuickAttackDamage;
		int defenderChargeAttackDamage;
		
		
		
		
		
		
		
		
		
		
		
		
		




		return true;
	}




}
