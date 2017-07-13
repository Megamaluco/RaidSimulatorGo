import java.util.List;
import java.util.stream.IntStream;

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
public class RaidBattleBruteForceForInterface {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */


	private static final int MAX_ITS = 1000;
	private static final boolean PARALLEL = true;


	public static String Simulate(int idRaidBoss) throws CloneNotSupportedException {


		Pokedex pd = new Pokedex();
		RaidDex rd = new RaidDex();
		RaidBoss rb = rd.findeRaidBoss(idRaidBoss);
		if(rb == null)
			return null;
		
		String mensage = "";

		
		if (PARALLEL)
			IntStream.range(1, 251).parallel().forEach(i -> {
				Pokemon pkm = null;
				try {
					pkm = (Pokemon) pd.getPokemon(i).clone();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


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
									for (int numberOfAttackers = 1; numberOfAttackers <= 1; numberOfAttackers++) {
										int it = 0;
										RaidSimulator rs = new RaidSimulator(pkm, rb, aqm, dqm, acm, dcm,
												numberOfAttackers);
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
															+ "'s won at level " + level/2.0 + " Quick Attack: "
															+ aqm.getName() + " and Charge Move: " + acm.getName());
													System.out.println("Versus");
													System.out.println(rb.getName() + " with Quick Attack"
															+ dqm.getName() + " and Charge Move:" + dcm.getName());
													System.out.println("On try: " + it);
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


			});
		else {
			for (int i = 1; i <= 251; i++) {
				Pokemon pkm = null;
				try {
					pkm = (Pokemon) pd.getPokemon(i).clone();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


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
									for (int numberOfAttackers = 1; numberOfAttackers <= 20; numberOfAttackers++) {
										int it = 0;
										RaidSimulator rs = new RaidSimulator(pkm, rb, aqm, dqm, acm, dcm,
												numberOfAttackers);
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
															+ "'s won at level " + level + " Quick Attack: "
															+ aqm.getName() + " and Charge Move: " + acm.getName());
													System.out.println("Versus");
													System.out.println(rb.getName() + " with Quick Attack"
															+ dqm.getName() + " and Charge Move:" + dcm.getName());
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
		return mensage;

	}


}

