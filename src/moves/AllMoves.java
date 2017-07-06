/**
 * 
 */

package moves;


import java.util.LinkedList;
import java.util.List;

/**
 * @author Ricardo Martinho
 *
 */
public class AllMoves {

	private static List<QuickMove> allQuickMoves;

	private static List<ChargeMove> allChargeMoves;


	public AllMoves() {
		synchronized (this) {
			if (allQuickMoves == null || allChargeMoves == null) {
				allQuickMoves = new LinkedList<>();
				addAllQuickMoves();
				allChargeMoves = new LinkedList<>();
				addAllChargeMoves();
			}

		}
	}


	private void addAllQuickMoves() {

		allQuickMoves.add(new QuickMove("Acid", 9, 80, 8, Types.POISON));
		allQuickMoves.add(new QuickMove("Air Slash", 14, 120, 10, Types.FLYING));
		allQuickMoves.add(new QuickMove("Astonish", 8, 110, 14, Types.GHOST));
		allQuickMoves.add(new QuickMove("Bite", 6, 50, 4, Types.DARK));
		allQuickMoves.add(new QuickMove("Bubble", 12, 120, 14, Types.WATER));
		allQuickMoves.add(new QuickMove("Bug Bite", 5, 50, 6, Types.BUG));
		allQuickMoves.add(new QuickMove("Bullet Punch", 9, 90, 10, Types.STEEL));
		allQuickMoves.add(new QuickMove("Bullet Seed", 8, 110, 14, Types.GRASS));
		allQuickMoves.add(new QuickMove("Charge Beam", 8, 110, 15, Types.ELECTRIC));
		allQuickMoves.add(new QuickMove("Confusion", 20, 160, 15, Types.PSYCHIC));
		allQuickMoves.add(new QuickMove("Counter", 12, 90, 8, Types.FIGHTING));
		allQuickMoves.add(new QuickMove("Cut", 5, 50, 5, Types.NORMAL));
		allQuickMoves.add(new QuickMove("Dragon Breath", 6, 50, 4, Types.DRAGON));
		allQuickMoves.add(new QuickMove("Dragon Tail", 15, 110, 9, Types.DRAGON));
		allQuickMoves.add(new QuickMove("Ember", 10, 100, 10, Types.FIRE));
		allQuickMoves.add(new QuickMove("Extrasensory", 12, 110, 12, Types.PSYCHIC));
		allQuickMoves.add(new QuickMove("Feint Attack", 10, 90, 9, Types.DARK));
		allQuickMoves.add(new QuickMove("Fire Fang", 11, 90, 8, Types.FIRE));
		allQuickMoves.add(new QuickMove("Fire Spin", 14, 110, 10, Types.FIRE));
		allQuickMoves.add(new QuickMove("Frost Breath", 10, 90, 8, Types.ICE));
		allQuickMoves.add(new QuickMove("Fury Cutter", 3, 40, 6, Types.BUG));
		allQuickMoves.add(new QuickMove("Hex", 10, 120, 15, Types.GHOST));
		allQuickMoves.add(new QuickMove("Hidden Power", 15, 150, 15, Types.NORMAL));
		allQuickMoves.add(new QuickMove("Ice Shard", 12, 120, 12, Types.ICE));
		allQuickMoves.add(new QuickMove("Infestation", 10, 110, 14, Types.BUG));
		allQuickMoves.add(new QuickMove("Iron Tail", 15, 110, 7, Types.STEEL));
		allQuickMoves.add(new QuickMove("Karate Chop", 8, 80, 10, Types.FIGHTING));
		allQuickMoves.add(new QuickMove("Lick", 5, 50, 6, Types.GHOST));
		allQuickMoves.add(new QuickMove("Low Kick", 6, 60, 6, Types.FIGHTING));
		allQuickMoves.add(new QuickMove("Metal Claw", 8, 70, 7, Types.STEEL));
		allQuickMoves.add(new QuickMove("Mud Shot", 5, 60, 7, Types.GROUND));
		allQuickMoves.add(new QuickMove("Mud Slap", 15, 140, 12, Types.GROUND));
		allQuickMoves.add(new QuickMove("Peck", 10, 100, 10, Types.FLYING));
		allQuickMoves.add(new QuickMove("Poison Jab", 10, 80, 7, Types.POISON));
		allQuickMoves.add(new QuickMove("Poison Sting", 5, 60, 7, Types.POISON));
		allQuickMoves.add(new QuickMove("Pound", 7, 60, 6, Types.NORMAL));
		allQuickMoves.add(new QuickMove("Powder Snow", 6, 100, 15, Types.ICE));
		allQuickMoves.add(new QuickMove("Psycho Cut", 5, 60, 8, Types.PSYCHIC));
		allQuickMoves.add(new QuickMove("Quick Attack", 8, 80, 10, Types.NORMAL));
		allQuickMoves.add(new QuickMove("Razor Leaf", 13, 100, 7, Types.GRASS));
		allQuickMoves.add(new QuickMove("Rock Smash", 15, 130, 10, Types.FIGHTING));
		allQuickMoves.add(new QuickMove("Rock Throw", 12, 90, 7, Types.ROCK));
		allQuickMoves.add(new QuickMove("Scratch", 6, 50, 4, Types.NORMAL));
		allQuickMoves.add(new QuickMove("Shadow Claw", 9, 70, 6, Types.GHOST));
		allQuickMoves.add(new QuickMove("Snarl", 12, 110, 12, Types.DARK));
		allQuickMoves.add(new QuickMove("Spark", 6, 70, 9, Types.ELECTRIC));
		allQuickMoves.add(new QuickMove("Splash", 0, 173, 20, Types.WATER));
		allQuickMoves.add(new QuickMove("Steel Wing", 11, 80, 6, Types.STEEL));
		allQuickMoves.add(new QuickMove("Struggle Bug", 15, 150, 15, Types.BUG));
		allQuickMoves.add(new QuickMove("Sucker Punch", 7, 70, 8, Types.DARK));
		allQuickMoves.add(new QuickMove("Tackle", 5, 50, 5, Types.NORMAL));
		allQuickMoves.add(new QuickMove("Thunder Shock", 5, 60, 8, Types.ELECTRIC));
		allQuickMoves.add(new QuickMove("Transform", 0, 223, 0, Types.NORMAL));
		allQuickMoves.add(new QuickMove("Vine Whip", 7, 60, 6, Types.GRASS));
		allQuickMoves.add(new QuickMove("Volt Switch", 20, 230, 25, Types.ELECTRIC));
		allQuickMoves.add(new QuickMove("Water Gun", 5, 50, 5, Types.WATER));
		allQuickMoves.add(new QuickMove("Water Gun (Blastoise)", 10, 100, 6, Types.WATER));
		allQuickMoves.add(new QuickMove("Wing Attack", 8, 80, 9, Types.FLYING));
		allQuickMoves.add(new QuickMove("Zen Headbutt", 12, 110, 10, Types.PSYCHIC));
	}


	private void addAllChargeMoves() {

		allChargeMoves.add(new ChargeMove("Aerial Ace", 55, 240, 33, Types.FLYING, 190));
		allChargeMoves.add(new ChargeMove("Air Cutter", 60, 270, 50, Types.FLYING, 180));
		allChargeMoves.add(new ChargeMove("Ancient Power", 70, 350, 33, Types.ROCK, 285));
		allChargeMoves.add(new ChargeMove("Aqua Jet", 45, 260, 33, Types.WATER, 170));
		allChargeMoves.add(new ChargeMove("Aqua Tail", 50, 190, 33, Types.WATER, 120));
		allChargeMoves.add(new ChargeMove("Aurora Beam", 80, 355, 50, Types.ICE, 335));
		allChargeMoves.add(new ChargeMove("Avalanche", 90, 270, 50, Types.ICE, 170));
		allChargeMoves.add(new ChargeMove("Blizzard", 130, 310, 100, Types.ICE, 150));
		allChargeMoves.add(new ChargeMove("Body Slam", 50, 190, 33, Types.NORMAL, 120));
		allChargeMoves.add(new ChargeMove("Bone Club", 40, 160, 33, Types.GROUND, 100));
		allChargeMoves.add(new ChargeMove("Brave Bird", 90, 200, 100, Types.FLYING, 100));
		allChargeMoves.add(new ChargeMove("Brick Break", 40, 160, 33, Types.FIGHTING, 80));
		allChargeMoves.add(new ChargeMove("Brine", 60, 230, 50, Types.WATER, 150));
		allChargeMoves.add(new ChargeMove("Bubble Beam", 45, 190, 33, Types.WATER, 145));
		allChargeMoves.add(new ChargeMove("Bug Buzz", 90, 370, 50, Types.BUG, 200));
		allChargeMoves.add(new ChargeMove("Bulldoze", 80, 350, 50, Types.GROUND, 260));
		allChargeMoves.add(new ChargeMove("Close Combat", 100, 230, 100, Types.FIGHTING, 100));
		allChargeMoves.add(new ChargeMove("Cross Chop", 50, 150, 50, Types.FIGHTING, 80));
		allChargeMoves.add(new ChargeMove("Cross Poison", 40, 150, 33, Types.POISON, 90));
		allChargeMoves.add(new ChargeMove("Crunch", 70, 320, 33, Types.DARK, 130));
		allChargeMoves.add(new ChargeMove("Dark Pulse", 80, 300, 50, Types.DARK, 140));
		allChargeMoves.add(new ChargeMove("Dazzling Gleam", 100, 350, 50, Types.FAIRY, 210));
		allChargeMoves.add(new ChargeMove("Dig", 100, 470, 50, Types.GROUND, 280));
		allChargeMoves.add(new ChargeMove("Disarming Voice", 70, 390, 33, Types.FAIRY, 320));
		allChargeMoves.add(new ChargeMove("Discharge", 65, 250, 33, Types.ELECTRIC, 170));
		allChargeMoves.add(new ChargeMove("Dragon Claw", 50, 170, 33, Types.DRAGON, 110));
		allChargeMoves.add(new ChargeMove("Dragon Pulse", 90, 360, 50, Types.DRAGON, 215));
		allChargeMoves.add(new ChargeMove("Draining Kiss", 60, 260, 50, Types.FAIRY, 100));
		allChargeMoves.add(new ChargeMove("Drill Peck", 60, 230, 33, Types.FLYING, 170));
		allChargeMoves.add(new ChargeMove("Drill Run", 80, 280, 50, Types.GROUND, 170));
		allChargeMoves.add(new ChargeMove("Dynamic Punch", 90, 270, 50, Types.FIGHTING, 120));
		allChargeMoves.add(new ChargeMove("Earthquake", 120, 360, 100, Types.GROUND, 270));
		allChargeMoves.add(new ChargeMove("Energy Ball", 90, 390, 50, Types.GRASS, 300));
		allChargeMoves.add(new ChargeMove("Fire Blast", 140, 420, 100, Types.FIRE, 310));
		allChargeMoves.add(new ChargeMove("Fire Punch", 55, 220, 33, Types.FIRE, 150));
		allChargeMoves.add(new ChargeMove("Flame Burst", 70, 260, 50, Types.FIRE, 100));
		allChargeMoves.add(new ChargeMove("Flame Charge", 70, 380, 33, Types.FIRE, 290));
		allChargeMoves.add(new ChargeMove("Flame Wheel", 60, 270, 50, Types.FIRE, 210));
		allChargeMoves.add(new ChargeMove("Flamethrower", 70, 220, 50, Types.FIRE, 150));
		allChargeMoves.add(new ChargeMove("Flash Cannon", 100, 270, 100, Types.STEEL, 160));
		allChargeMoves.add(new ChargeMove("Focus Blast", 140, 350, 100, Types.FIGHTING, 300));
		allChargeMoves.add(new ChargeMove("Foul Play", 70, 200, 50, Types.DARK, 170));
		allChargeMoves.add(new ChargeMove("Future Sight", 120, 270, 100, Types.FAIRY, 140));
		allChargeMoves.add(new ChargeMove("Grass Knot", 90, 260, 50, Types.GRASS, 170));
		allChargeMoves.add(new ChargeMove("Gunk Shot", 130, 310, 100, Types.POISON, 170));
		allChargeMoves.add(new ChargeMove("Gyro Ball", 80, 330, 50, Types.STEEL, 300));
		allChargeMoves.add(new ChargeMove("Heart Stamp", 40, 190, 33, Types.PSYCHIC, 110));
		allChargeMoves.add(new ChargeMove("Heat Wave", 95, 300, 100, Types.FIRE, 170));
		allChargeMoves.add(new ChargeMove("Heavy Slam", 70, 210, 52, Types.STEEL, 150));
		allChargeMoves.add(new ChargeMove("Horn Attack", 40, 185, 33, Types.NORMAL, 80));
		allChargeMoves.add(new ChargeMove("Hurricane", 110, 270, 100, Types.FLYING, 120));
		allChargeMoves.add(new ChargeMove("Hydro Pump", 130, 330, 100, Types.WATER, 90));
		allChargeMoves.add(new ChargeMove("Hydro Pump (Blastoise)", 90, 450, 100, Types.WATER, 220));
		allChargeMoves.add(new ChargeMove("Hyper Beam", 150, 380, 100, Types.NORMAL, 330));
		allChargeMoves.add(new ChargeMove("Hyper Fang", 80, 250, 50, Types.NORMAL, 150));
		allChargeMoves.add(new ChargeMove("Ice Beam", 90, 330, 50, Types.ICE, 130));
		allChargeMoves.add(new ChargeMove("Ice Punch", 50, 190, 33, Types.ICE, 130));
		allChargeMoves.add(new ChargeMove("Icy Wind", 60, 330, 33, Types.ICE, 200));
		allChargeMoves.add(new ChargeMove("Iron Head", 60, 190, 50, Types.STEEL, 130));
		allChargeMoves.add(new ChargeMove("Leaf Blade", 70, 240, 33, Types.GRASS, 125));
		allChargeMoves.add(new ChargeMove("Low Sweep", 40, 190, 33, Types.FIGHTING, 130));
		allChargeMoves.add(new ChargeMove("Magnet Bomb", 70, 280, 33, Types.STEEL, 220));
		allChargeMoves.add(new ChargeMove("Mega Drain", 25, 260, 50, Types.GRASS, 95));
		allChargeMoves.add(new ChargeMove("Megahorn", 90, 220, 100, Types.BUG, 170));
		allChargeMoves.add(new ChargeMove("Mirror Coat", 60, 260, 50, Types.PSYCHIC, 230));
		allChargeMoves.add(new ChargeMove("Moonblast", 130, 390, 100, Types.FAIRY, 220));
		allChargeMoves.add(new ChargeMove("Mud Bomb", 55, 230, 33, Types.GROUND, 170));
		allChargeMoves.add(new ChargeMove("Night Shade", 60, 260, 50, Types.GHOST, 210));
		allChargeMoves.add(new ChargeMove("Night Slash", 50, 220, 33, Types.DARK, 130));
		allChargeMoves.add(new ChargeMove("Ominous Wind", 50, 230, 33, Types.GHOST, 185));
		allChargeMoves.add(new ChargeMove("Outrage", 110, 390, 50, Types.DRAGON, 250));
		allChargeMoves.add(new ChargeMove("Overheat", 160, 400, 100, Types.FIRE, 260));
		allChargeMoves.add(new ChargeMove("Parabolic Charge", 25, 280, 50, Types.ELECTRIC, 120));
		allChargeMoves.add(new ChargeMove("Petal Blizzard", 110, 260, 100, Types.GRASS, 170));
		allChargeMoves.add(new ChargeMove("Play Rough", 90, 290, 50, Types.FAIRY, 130));
		allChargeMoves.add(new ChargeMove("Poison Fang", 35, 170, 33, Types.POISON, 90));
		allChargeMoves.add(new ChargeMove("Power Gem", 80, 290, 50, Types.ROCK, 195));
		allChargeMoves.add(new ChargeMove("Power Whip", 90, 260, 50, Types.GRASS, 125));
		allChargeMoves.add(new ChargeMove("Psybeam", 70, 320, 50, Types.PSYCHIC, 130));
		allChargeMoves.add(new ChargeMove("Psychic", 100, 280, 100, Types.PSYCHIC, 130));
		allChargeMoves.add(new ChargeMove("Psyshock", 65, 270, 33, Types.PSYCHIC, 200));
		allChargeMoves.add(new ChargeMove("Psystrike", 100, 440, 50, Types.PSYCHIC, 300));
		allChargeMoves.add(new ChargeMove("Rest", 50, 190, 33, Types.NORMAL, 150));
		allChargeMoves.add(new ChargeMove("Rock Blast", 50, 210, 33, Types.ROCK, 160));
		allChargeMoves.add(new ChargeMove("Rock Slide", 80, 270, 50, Types.ROCK, 150));
		allChargeMoves.add(new ChargeMove("Rock Tomb", 70, 320, 50, Types.ROCK, 225));
		allChargeMoves.add(new ChargeMove("Sand Tomb", 80, 400, 50, Types.ROCK, 170));
		allChargeMoves.add(new ChargeMove("Scald", 80, 370, 50, Types.WATER, 130));
		allChargeMoves.add(new ChargeMove("Scald (Blastoise)", 50, 470, 100, Types.WATER, 250));
		allChargeMoves.add(new ChargeMove("Seed Bomb", 55, 210, 33, Types.GRASS, 120));
		allChargeMoves.add(new ChargeMove("Shadow Ball", 100, 300, 50, Types.GHOST, 240));
		allChargeMoves.add(new ChargeMove("Shadow Punch", 40, 170, 33, Types.GHOST, 130));
		allChargeMoves.add(new ChargeMove("Shadow Sneak", 50, 290, 33, Types.GHOST, 220));
		allChargeMoves.add(new ChargeMove("Signal Beam", 75, 290, 50, Types.BUG, 180));
		allChargeMoves.add(new ChargeMove("Silver Wind", 70, 370, 33, Types.BUG, 170));
		allChargeMoves.add(new ChargeMove("Sky Attack", 70, 200, 50, Types.FLYING, 150));
		allChargeMoves.add(new ChargeMove("Sludge", 50, 210, 33, Types.POISON, 120));
		allChargeMoves.add(new ChargeMove("Sludge Bomb", 80, 230, 50, Types.POISON, 110));
		allChargeMoves.add(new ChargeMove("Sludge Wave", 110, 320, 100, Types.POISON, 200));
		allChargeMoves.add(new ChargeMove("Solar Beam", 180, 490, 100, Types.GRASS, 270));
		allChargeMoves.add(new ChargeMove("Stomp", 55, 170, 50, Types.NORMAL, 110));
		allChargeMoves.add(new ChargeMove("Stone Edge", 100, 230, 100, Types.ROCK, 70));
		allChargeMoves.add(new ChargeMove("Struggle", 35, 220, 33, Types.NORMAL, 120));
		allChargeMoves.add(new ChargeMove("Submission", 60, 220, 50, Types.FIGHTING, 180));
		allChargeMoves.add(new ChargeMove("Swift", 60, 280, 50, Types.NORMAL, 200));
		allChargeMoves.add(new ChargeMove("Thunder", 100, 240, 100, Types.ELECTRIC, 120));
		allChargeMoves.add(new ChargeMove("Thunder Punch", 45, 180, 33, Types.ELECTRIC, 170));
		allChargeMoves.add(new ChargeMove("Thunderbolt", 80, 250, 50, Types.ELECTRIC, 180));
		allChargeMoves.add(new ChargeMove("Twister", 45, 280, 33, Types.DRAGON, 95));
		allChargeMoves.add(new ChargeMove("Vice Grip", 35, 190, 33, Types.NORMAL, 110));
		allChargeMoves.add(new ChargeMove("Water Pulse", 70, 320, 50, Types.WATER, 220));
		allChargeMoves.add(new ChargeMove("Wild Charge", 90, 260, 50, Types.ELECTRIC, 170));
		allChargeMoves.add(new ChargeMove("Wrap", 60, 290, 33, Types.NORMAL, 205));
		allChargeMoves.add(new ChargeMove("Wrap (Green/Pink)", 25, 290, 33, Types.NORMAL, 205));
		allChargeMoves.add(new ChargeMove("X-Scissor", 45, 160, 33, Types.BUG, 120));
		allChargeMoves.add(new ChargeMove("Zap Cannon", 140, 370, 100, Types.ELECTRIC, 300));


	}


	/**
	 * @return the allQuickMoves
	 */
	public QuickMove getQuickMove(String attackName) {

		for (QuickMove qc : allQuickMoves)
			if (attackName.equalsIgnoreCase(qc.getName()))
				return qc;
		System.err.println("Quick Move Not found: " + attackName);
		return null;
	}


	/**
	 * @return the allChargeMoves
	 */
	public ChargeMove getChargeMove(String attackName) {

		for (ChargeMove cm : allChargeMoves)
			if (attackName.equalsIgnoreCase(cm.getName()))
				return cm;

		System.err.println("Charge Move Not found " + attackName);
		;
		return null;
	}


	/**
	 * @return the allQuickMoves
	 */
	protected List<QuickMove> getAllQuickMoves() {

		return allQuickMoves;
	}


	/**
	 * @return the allChargeMoves
	 */
	protected List<ChargeMove> getAllChargeMoves() {

		return allChargeMoves;
	}


}
