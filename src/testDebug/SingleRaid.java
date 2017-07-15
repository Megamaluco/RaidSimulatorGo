package testDebug;
import java.util.List;

import battle.RaidSimulatorStateMachine;
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

	private static final int MAX_ITS = 5;


	public static void main(String[] args) {


		Pokedex pd = new Pokedex();
		RaidDex rd = new RaidDex();
		RaidBoss rb = rd.findRaidBoss("Flareon");
		Pokemon pkm = pd.getPokemon("Golem");


		List<QuickMove> attackerQuickmoves = pkm.getQuickMoves();
		List<ChargeMove> attackerChargeMoves = pkm.getChargeMoves();
		List<QuickMove> defenderQuickmoves = rb.getQuickMoves();
		List<ChargeMove> defenderChargeMoves = rb.getChargeMoves();


		for (int level = 0; level < 79; level++) {
			pkm.setLevel(level);
			System.out.println(level);
			for (QuickMove aqm : attackerQuickmoves) {
				for (ChargeMove acm : attackerChargeMoves) {
					for (QuickMove dqm : defenderQuickmoves) {
						for (ChargeMove dcm : defenderChargeMoves) {
							for (int numberOfAttackers = 1; numberOfAttackers <= 20; numberOfAttackers++) {
								int it = 0;
								RaidSimulatorStateMachine rs = new RaidSimulatorStateMachine(pkm, rb, aqm, dqm, acm, dcm, numberOfAttackers);
								while (it < MAX_ITS) {
									rs.simulateBatle();
									if (rs.didAttackerWin()) {
										synchronized (System.out) {
											System.out.println("-----------------");
											System.out.println("Victory!!!");
											System.out.println(numberOfAttackers + " " + pkm.getName()
													+ "'s won at level " + level / 2.0 + " Quick Attack: "
													+ aqm.getName() + " and Charge Move: " + acm.getName());
											System.out.println("Versus");
											System.out.println(rb.getName() + " with Quick Attack" + dqm.getName()
													+ " and Charge Move:" + dcm.getName());
											System.out.println("On try: " + it);
											System.out.println("With time Remaning: " + rs.getTimeRemaming());
											System.out.println("-----------------");
										}
										numberOfAttackers = 21;
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
