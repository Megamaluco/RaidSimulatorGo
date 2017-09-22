
package battle;


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
public class RaidBattleBruteForce {
	private static final int MAX_ITS = 1000;
	private static final int MAX_PARTICIPANTS = 20;
	// private static final boolean PARALLEL = true;

	private Pokedex pokeDex;
	private RaidDex raidDex;
	private RaidBoss raidBoss;
	private int maxParticipants;
	private Pokemon pokemonToUse;


	public RaidBattleBruteForce(int index, int tier) {
		pokeDex = new Pokedex();
		raidDex = new RaidDex();
		//raidBoss = raidDex.findRaidBoss(index);~
		raidBoss = pokeDex.getPokemon(index).getRaidBoss(tier);
		maxParticipants = 1;
	}


	public RaidBattleBruteForce(String name, int tier) {
		pokeDex = new Pokedex();
		raidDex = new RaidDex();
		//raidBoss = raidDex.findRaidBoss(name);
		maxParticipants = 1;
	}


	/**
	 * @param maxParticipants
	 *            the maxParticipants to set
	 */
	public void setMaxParticipants(int maxParticipants) {

		this.maxParticipants = Math.min(maxParticipants, MAX_PARTICIPANTS);
	}


	public boolean setPokemonToUseId(int pokemonToUseId) {

		try {
			if (pokemonToUseId == 0)
				pokemonToUse = null;
			else
				pokemonToUse = pokeDex.getPokemon(pokemonToUseId);
			return true;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}

	}


	public boolean raidBossFound() {

		return raidBoss != null;
	}


	public String doBattle() {

		if (pokemonToUse == null)
			IntStream.rangeClosed(1, 251).parallel().forEach(attackerDexEntry -> {
				Pokemon pkm = pokeDex.getPokemon(attackerDexEntry).myClone();
				simulateBattle(pkm);

			});
		else
			simulateSingleBattle(pokemonToUse);

		return "";

	}


	public void simulateBattle(Pokemon pkm) {

		//System.out.println(pkm.getName());

		List<QuickMove> attackerQuickmoves = pkm.getQuickMoves();
		List<ChargeMove> attackerChargeMoves = pkm.getChargeMoves();
		List<QuickMove> defenderQuickmoves = raidBoss.getQuickMoves();
		List<ChargeMove> defenderChargeMoves = raidBoss.getChargeMoves();

		pkm.setAttackIV(0);
		pkm.setDefenseIV(0);
		pkm.setHpIV(0);
		
		
		for (int level = 0; level < 79; level++) {
			pkm.setLevel(level);
			for (QuickMove aqm : attackerQuickmoves) {
				for (ChargeMove acm : attackerChargeMoves) {
					for (QuickMove dqm : defenderQuickmoves) {
						for (ChargeMove dcm : defenderChargeMoves) {
							for (int numberOfAttackers = 1; numberOfAttackers <= maxParticipants; numberOfAttackers++) {
								int it = 0;
								RaidSimulatorStateMachine rs = new RaidSimulatorStateMachine(pkm, raidBoss.myClone(),
										aqm, dqm, acm, dcm, numberOfAttackers);

								while (it < MAX_ITS) {
									rs.simulateBatle();
									// System.out.println("Battle finished for "
									// + pkm.getName());
									if (rs.didAttackerWin()) {
										synchronized (System.out) {
											System.out.println("-----------------");
											System.out.println("Victory!!!");
											System.out.println(numberOfAttackers + " " + pkm.getName()
													+ "'s won at level " + level / 2.0 + " Quick Attack: "
													+ aqm.getName() + " and Charge Move: " + acm.getName());
											System.out.println("Versus");
											System.out.println(raidBoss.getName() + " with Quick Attack: "
													+ dqm.getName() + " and Charge Move: " + dcm.getName());
											System.out.println("On try: " + it);
											System.out.println("With time Remaning: " + rs.getTimeRemaming());
											System.out.println("-----------------");

										}
										numberOfAttackers = MAX_PARTICIPANTS + 1;
										
									break;

									} else if (rs.worthContinuing()) {
										// System.out.println("Not Worth it");
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


	public void simulateSingleBattle(Pokemon pkm) {

		IntStream.rangeClosed(0, 78).parallel().forEach(level -> {
			Pokemon testSubject = pkm.myClone();
			 testSubject.setAttackIV(0);
			 testSubject.setDefenseIV(0);
			 testSubject.setHpIV(0);
			List<QuickMove> attackerQuickmoves = testSubject.getQuickMoves();
			List<ChargeMove> attackerChargeMoves = testSubject.getChargeMoves();
			List<QuickMove> defenderQuickmoves = raidBoss.getQuickMoves();
			List<ChargeMove> defenderChargeMoves = raidBoss.getChargeMoves();
			testSubject.setLevel(level);
			for (QuickMove aqm : attackerQuickmoves) {
				for (ChargeMove acm : attackerChargeMoves) {
					for (QuickMove dqm : defenderQuickmoves) {
						for (ChargeMove dcm : defenderChargeMoves) {
							for (int numberOfAttackers = 1; numberOfAttackers <= maxParticipants; numberOfAttackers++) {
								int it = 0;
								RaidSimulatorStateMachine rs = new RaidSimulatorStateMachine(testSubject, raidBoss, aqm,
										dqm, acm, dcm, numberOfAttackers);

								while (it < MAX_ITS) {
									rs.simulateBatle();
									if (rs.didAttackerWin()) {
										synchronized (System.out) {
											System.out.println("-----------------");
											System.out.println("Victory!!!");
											System.out.println(numberOfAttackers + " " + testSubject.getName()
													+ "'s won at level " + level / 2.0 + " Quick Attack: "
													+ aqm.getName() + " and Charge Move: " + acm.getName());
											System.out.println("Versus");
											System.out.println(raidBoss.getName() + " with Quick Attack" + dqm.getName()
													+ " and Charge Move:" + dcm.getName());
											System.out.println("On try: " + it);
											System.out.println("With time Remaning: " + rs.getTimeRemaming());
											System.out.println("-----------------");

										}
										numberOfAttackers = MAX_PARTICIPANTS + 1;
										break;

									} else if (rs.worthContinuing()) {
										// System.out.println("Not Worth it");
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

		});

	}

}
