
package pokemons;


import java.util.ArrayList;
import java.util.List;

import moves.AllMoves;
import moves.ChargeMove;
import moves.QuickMove;

public class RaidDex {


	private static List<RaidBoss> raidBossList = new ArrayList<>();
	
	static {
		fillRaidBosses();
	}


	public RaidDex() {

	}


	private static void fillRaidBosses() {

		RaidBoss boss = null;
		QuickMove qm;
		ChargeMove cm;
		AllMoves moves = new AllMoves();

		int tier = 1;
		boss = new RaidBoss(129, "Magikarp", "Water", null, 29, 40, 102, false, tier);

		qm = moves.getQuickMove("Splash");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Struggle");
		boss.learnChargeMove(cm);

		raidBossList.add(boss);


		boss = new RaidBoss(153, "Bayleef", "Grass", null, 122, 120, 155, false, tier);

		qm = moves.getQuickMove("Razor Leaf");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Grass Knot");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Energy Ball");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(156, "Quilava", "Fire", null, 158, 116, 129, false, tier);


		qm = moves.getQuickMove("Ember");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Flamethrower");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Charge");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(159, "Croconaw", "Water", null, 150, 130, 151, false, tier);


		qm = moves.getQuickMove("Water Gun");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Punch");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		tier = 2;

		boss = new RaidBoss(89, "Muk", "Poison", null, 190, 210, 184, false, tier);


		qm = moves.getQuickMove("Poison Jab");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Gunk Shot");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Wave");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(103, "Exeggutor", "Grass", "Psychic", 233, 190, 158, false, tier);


		qm = moves.getQuickMove("Extrasensory");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Psychic");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(110, "Weezing", "Water", null, 174, 130, 221, false, tier);

		qm = moves.getQuickMove("Infestation");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Sludge Bomb");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);

		boss = new RaidBoss(125, "Electabuzz", "Electric", null, 198, 130, 173, false, tier);


		qm = moves.getQuickMove("Thunder Shock");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Thunder");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder Punch");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(126, "Magmar", "Fire", null, 206, 130, 169, false, tier);

		qm = moves.getQuickMove("Ember");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Karate Chop");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Flamethrower");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Punch");
		boss.learnChargeMove(cm);

		raidBossList.add(boss);


		tier = 3;


		boss = new RaidBoss(59, "Arcanine", "Fire", null, 227, 180, 166, true, tier);


		qm = moves.getQuickMove("Snarl");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Fire Fang");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Crunch");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Wild Charge");
		boss.learnChargeMove(cm);

		raidBossList.add(boss);


		boss = new RaidBoss(65, "Alakazam", "Psychic", null, 271, 110, 194, true, tier);


		qm = moves.getQuickMove("Confusion");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Psycho Cut");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Focus Blast");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Future Sight");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(68, "Machamp", "Fight", null, 234, 180, 162, true, tier);

		qm = moves.getQuickMove("Bullet Punch");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Heavy Slam");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Dynamic Punch");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Close Combat");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);

		boss = new RaidBoss(94, "Gengar", "Ghost", "Poison", 261, 120, 156, false, tier);


		qm = moves.getQuickMove("Hex");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Sucker Punch");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Shadow Ball");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Focus Blast");
		boss.learnChargeMove(cm);

		raidBossList.add(boss);

		boss = new RaidBoss(134, "Vaporeon", "Water", null, 205, 260, 177, false, tier);

		qm = moves.getQuickMove("Water Gun");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Hydro Pump");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Tail");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		boss.learnChargeMove(cm);

		raidBossList.add(boss);


		boss = new RaidBoss(135, "Jolteon", "Electric", null, 232, 130, 201, false, tier);


		qm = moves.getQuickMove("Thunder Shock");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Volt Switch");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Thunder");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);

		boss = new RaidBoss(136, "Flareon", "Fire", null, 246, 130, 204, false, tier);


		qm = moves.getQuickMove("Fire Spin");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Ember");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Overheat");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		tier = 4;


		boss = new RaidBoss(3, "Venusaur", "Grass", "Poison", 198, 160, 198, true, tier);


		qm = moves.getQuickMove("Razor Leaf");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Vine Whip");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Petal Blizzard");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);
		boss = new RaidBoss(6, "Charizard", "Fire", "Flying", 223, 156, 176, true, tier);


		qm = moves.getQuickMove("Fire Spin");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Air Slash");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Dragon Claw");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Overheat");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(9, "Blastoise", "Water", null, 171, 158, 210, true, tier);


		qm = moves.getQuickMove("Bite");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Flash Cannon");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);
		boss = new RaidBoss(112, "Rhydon", "Ground", "Rock", 222, 210, 206, true, tier);


		qm = moves.getQuickMove("Mud Slap");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Stone Edge");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Megahorn");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);

		boss = new RaidBoss(131, "Lapras", "Ice", "Water", 165, 260, 180, false, tier);


		qm = moves.getQuickMove("Water Gun");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Frost Breath");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Hydro Pump");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


		boss = new RaidBoss(143, "Snorlax", "Normal", null, 190, 320, 190, false, tier);


		qm = moves.getQuickMove("Lick");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		boss.learnQuickMove(qm);

		cm = moves.getChargeMove("Hyper Beam");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Heavy Slam");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);

		boss = new RaidBoss(248, "Tyranitar", "Dark", "Rock", 251, 200, 212, false, tier);


		qm = moves.getQuickMove("Bite");
		boss.learnQuickMove(qm);
		qm = moves.getQuickMove("Iron Tail");
		boss.learnQuickMove(qm);


		cm = moves.getChargeMove("Crunch");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		boss.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		boss.learnChargeMove(cm);


		raidBossList.add(boss);


	}

}
