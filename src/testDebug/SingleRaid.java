package testDebug;
import java.util.List;

import battle.RaidSimulator;
import moves.ChargeMove;
import moves.QuickMove;
import pokemons.Pokedex;
import pokemons.Pokemon;
import pokemons.RaidBoss;
import pokemons.RaidDex;

/**
 * 
 */

/**
 * @author Ricardo Martinho
 *
 */
public class SingleRaid {

	/**
	 * @param args
	 */

	private static final int MAX_ITS = 1;
	private static final boolean PARALLEL = false;


	public static void main(String[] args) {


		Pokedex pd = new Pokedex();
		RaidDex rd = new RaidDex();
		RaidBoss rb = rd.findRaidBoss("Jolteon");
		Pokemon pkm = pd.getPokemon("Rhydon");


		List<QuickMove> attackerQuickmoves = pkm.getQuickMoves();
		List<ChargeMove> attackerChargeMoves = pkm.getChargeMoves();
		List<QuickMove> defenderQuickmoves = rb.getQuickMoves();
		List<ChargeMove> defenderChargeMoves = rb.getChargeMoves();


		for (int level = 0; level < 79; level++) {
			pkm.setLevel(level);
			for (QuickMove aqm : attackerQuickmoves) {
				for (ChargeMove acm : attackerChargeMoves) {
					for (QuickMove dqm : defenderQuickmoves) {
						for (ChargeMove dcm : defenderChargeMoves) {
							for (int numberOfAttackers = 2; numberOfAttackers <= 2; numberOfAttackers++) {
								int it = 0;
								RaidSimulator rs = new RaidSimulator(pkm, rb, aqm, dqm, acm, dcm, numberOfAttackers);
								while (it < MAX_ITS) {
									rs.simulateBatle();
									// System.out.println("Done Batling
									// " +
									// pkm.getName() + " Level: " +
									// level +
									// "Number Of attackers " +
									// numberOfAttackers);
									if (rs.didAttackerWin()) {
										synchronized (System.out) {
											System.out.println("-----------------");
											System.out.println("Victory!!!");
											System.out.println(numberOfAttackers + " " + pkm.getName()
													+ "'s won at level " + level + " Quick Attack: " + aqm.getName()
													+ " and Charge Move: " + acm.getName());
											System.out.println("Versus");
											System.out.println(rb.getName() + " with Quick Attack" + dqm.getName()
													+ " and Charge Move:" + dcm.getName());
											System.out.println("On try: " + it);
											System.out.println("-----------------");

										}
										numberOfAttackers = 21;
										break;
									} else if (!rs.wasItClose()) {
										break;
									}

									rs.resetBatle();
									it++;

								}
							}


						}
					}
				}
			}
		}
	}
}
