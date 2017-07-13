
package testDebug;


import java.util.stream.IntStream;

import pokemons.Pokedex;
import pokemons.Pokemon;

public class BruteForceCPForRaidBosses {
	public static final int CP_TO_FIND = 34707;
	public static final int MAX_IV_TRIES_ATTACK = 500;
	public static final int MAX_IV_TRIES_DEFENSE = 500;
	public static final int MAX_IV_TRIES_HP = 8000;
	private static final boolean DEBUG = true;


	public static void main(String[] args) {

		// BruterFoce attempt
		Pokedex pd = new Pokedex();
		Pokemon monToClone = pd.getPokemon("Tyranitar");

		IntStream.range(0, 79).parallel().forEach(level -> {
			if (DEBUG)
				System.out.println("Working on level:" + level);

			boolean exit = false;

			Pokemon mon = (Pokemon) monToClone.mYclone();


			mon.setLevel(level);

			if (mon.getCp() > CP_TO_FIND) {
				if (DEBUG)
					System.out.println("Not worth it, level too high: Level will quit: " + level);
				exit = true;
			}

			mon.setAttackIV(MAX_IV_TRIES_ATTACK);
			mon.setDefenseIV(MAX_IV_TRIES_DEFENSE);
			mon.setHpIV(MAX_IV_TRIES_HP);

			if (CP_TO_FIND > mon.getCp()) {
				if (DEBUG)
					System.out.println("Not worth it, level too low: Level will quit: " + level);
				exit = true;
			}

			if (!exit)
				for (int attack = 0; attack <= MAX_IV_TRIES_ATTACK; attack++) {
					mon.setAttackIV(attack);
					for (int defense = 0; defense <= MAX_IV_TRIES_DEFENSE; defense++) {
						mon.setDefenseIV(defense);
						for (int hp = 0; hp <= MAX_IV_TRIES_DEFENSE; hp++) {
							mon.setHpIV(hp);
							if (CP_TO_FIND == mon.getCp()) {
								int chp = (int) mon.getHp();
								if (chp == 7500) {
									synchronized (pd) {
										System.out.println("JackPot");
										System.out.println("Attack:" + mon.getAttack());
										System.out.println("Defense:" + mon.getDefense());
										System.out.println("HP:" + 7500);
										System.out.println("Level: " + level);
										System.out.println("CP" + mon.getCp());
									}
								}

							} else if (CP_TO_FIND < mon.getCp()) {
								// System.out.println("Gone to far");
								break;
							}

						}
					}
				}

		});

	}

}
