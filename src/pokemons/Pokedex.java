/**
 * 
 */

package pokemons;


import java.util.ArrayList;
import java.util.List;

import moves.AllMoves;
import moves.ChargeMove;
import moves.QuickMove;
import moves.Types;

/**
 * @author Ricardo Martinho
 *
 */
public class Pokedex {

	private static List<Pokemon> allPokemon = new ArrayList<>();
	private static AllMoves moves = new AllMoves();;

	static {
		addAllPokemon();
	}


	public Pokedex() {

	}


	private static void addAllPokemon() {
		
		Pokemon pokemon;
		QuickMove qm;
		ChargeMove cm;
		

		pokemon = new Pokemon(1, "Bulbasaur", Types.GRASS, Types.POISON, 118, 90, 118, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Vine Whip");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Power Whip");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(2, "Ivysaur", Types.GRASS, Types.POISON, 151, 120, 151, false);

		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Vine Whip");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Power Whip");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(3, "Venusaur", Types.GRASS, Types.POISON, 198, 160, 198, true);

		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Vine Whip");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Petal Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(4, "Charmander", Types.FIRE, -1, 116, 78, 96, false);

		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Flame Burst");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Charge");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(5, "Charmeleon", Types.FIRE, -1, 158, 116, 129, false);

		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fire Fang");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Flame Burst");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Punch");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(6, "Charizard", Types.FIRE, Types.FLYING, 223, 156, 176, true);

		qm = moves.getQuickMove("Fire Spin");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Air Slash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Dragon Claw");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Overheat");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(7, "Squirtle", Types.WATER, -1, 94, 88, 122, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aqua Jet");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(8, "Wartortle", Types.WATER, -1, 126, 118, 155, false);

		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aqua Jet");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(9, "Blastoise", Types.WATER, -1, 171, 158, 210, true);

		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Flash Cannon");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(10, "Caterpie", Types.BUG, -1, 55, 90, 62, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(11, "Metapod", Types.BUG, -1, 45, 100, 94, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(12, "Butterfree", Types.BUG, Types.FLYING, 167, 120, 151, true);

		qm = moves.getQuickMove("Struggle Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Bug Buzz");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Signal Beam");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(13, "Weedle", Types.BUG, Types.POISON, 63, 80, 55, false);

		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(14, "Kakuna", Types.BUG, Types.POISON, 46, 90, 86, false);

		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(15, "Beedrill", Types.BUG, Types.POISON, 169, 130, 150, true);

		qm = moves.getQuickMove("Poison Jab");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(16, "Pidgey", Types.FLYING, Types.NORMAL, 85, 80, 76, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Twister");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(17, "Pidgeotto", Types.FLYING, Types.NORMAL, 117, 126, 108, false);

		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Twister");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(18, "Pidgeot", Types.FLYING, Types.NORMAL, 166, 166, 157, true);


		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Air Slash");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brave Bird");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hurricane");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(19, "Rattata", Types.NORMAL, -1, 103, 60, 70, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Fang");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(20, "Raticate", Types.NORMAL, -1, 161, 110, 144, true);

		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Fang");

		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(21, "Spearow", Types.FLYING, Types.NORMAL, 112, 80, 61, false);


		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Drill Peck");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sky Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Twister");


		allPokemon.add(pokemon);


		pokemon = new Pokemon(22, "Fearow", Types.FLYING, Types.NORMAL, 182, 130, 135, true);


		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Drill Run");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sky Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Twister");


		allPokemon.add(pokemon);

		pokemon = new Pokemon(23, "Ekans", Types.POISON, -1, 110, 70, 102, false);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Poison Fang");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wrap");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Gunk Shot");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(24, "Arbok", Types.POISON, -1, 167, 120, 158, true);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Wave");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Gunk Shot");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(25, "Pikachu", Types.ELECTRIC, -1, 112, 70, 101, false);


		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wild Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(26, "Raichu", Types.ELECTRIC, -1, 193, 120, 165, true);

		qm = moves.getQuickMove("Spark");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Volt Switch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wild Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);


		pokemon = new Pokemon(27, "Sandshrew", Types.GROUND, -1, 126, 100, 145, false);


		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sand Tomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(28, "Sandslash", Types.GROUND, -1, 182, 150, 202, false);


		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Metal Claw");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Bulldoze");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(29, "Nidoran female", Types.POISON, -1, 86, 110, 94, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Poison Fang");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(30, "Nidorina", Types.POISON, -1, 117, 140, 126, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Poison Fang");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(31, "Nidoqueen", Types.GROUND, Types.POISON, 180, 180, 174, true);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Wave");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(32, "Nidoran male", Types.POISON, -1, 105, 92, 76, false);


		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Horn Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(33, "Nidorino", Types.POISON, -1, 137, 122, 112, false);


		qm = moves.getQuickMove("Poison Jab");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Horn Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(34, "Nidoking", Types.GROUND, Types.POISON, 204, 162, 157, true);


		qm = moves.getQuickMove("Poison Jab");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Iron Tail");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Horn Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(35, "Clefairy", Types.FAIRY, -1, 107, 140, 116, false);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Disarming Voice");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(36, "Clefable", Types.FAIRY, -1, 178, 190, 171, false);


		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Moonblast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(37, "Vulpix", Types.FIRE, -1, 96, 76, 122, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Charge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(38, "Ninetales", Types.FIRE, -1, 169, 146, 204, true);


		qm = moves.getQuickMove("Fire Spin");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Overheat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heat Wave");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(39, "Jigglypuff", Types.FAIRY, Types.NORMAL, 80, 230, 44, false);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Gyro Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Disarming Voice");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(40, "Wigglytuff", Types.FAIRY, Types.NORMAL, 156, 280, 93, true);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(41, "Zubat", Types.FLYING, Types.POISON, 83, 80, 76, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Poison Fang");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Swift");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(42, "Golbat", Types.FLYING, Types.POISON, 161, 150, 153, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Poison Fang");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ominous Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(43, "Oddish", Types.GRASS, Types.POISON, 131, 90, 116, false);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Moonblast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(44, "Gloom", Types.GRASS, Types.POISON, 153, 120, 139, false);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Moonblast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Petal Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(45, "Vileplume", Types.GRASS, Types.POISON, 202, 150, 170, true);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Moonblast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Petal Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(46, "Paras", Types.BUG, Types.GRASS, 121, 70, 99, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Cross Poison");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(47, "Parasect", Types.BUG, Types.GRASS, 165, 120, 146, true);


		qm = moves.getQuickMove("Struggle Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Cross Poison");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Cross Poison");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(48, "Venonat", Types.BUG, Types.POISON, 100, 120, 102, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Poison Fang");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Signal Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(49, "Venomoth", Types.BUG, Types.POISON, 179, 140, 150, true);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Poison Fang");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bug Buzz");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Silver Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(50, "Diglett", Types.GROUND, -1, 109, 20, 88, false);


		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Mud Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(51, "Dugtrio", Types.GROUND, -1, 167, 70, 147, true);


		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Sucker Punch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Mud Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(52, "Meowth", Types.NORMAL, -1, 92, 80, 81, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Foul Play");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Slash");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(53, "Persian", Types.NORMAL, -1, 150, 130, 139, true);


		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Foul Play");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Power Gem");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Slash");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(54, "Psyduck", Types.WATER, -1, 122, 100, 96, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Chop");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(55, "Golduck", Types.WATER, -1, 191, 160, 163, true);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(56, "Mankey", Types.FIGHTING, -1, 148, 80, 87, false);


		qm = moves.getQuickMove("Karate Chop");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Chop");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Low Sweep");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(57, "Primeape", Types.FIGHTING, -1, 207, 130, 144, true);


		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Karate Chop");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Chop");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Low Sweep");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Slash");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(58, "Growlithe", Types.FIRE, -1, 136, 110, 96, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Wheel");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(59, "Arcanine", Types.FIRE, -1, 227, 180, 166, true);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Snarl");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fire Fang");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wild Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bulldoze");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(60, "Poliwag", Types.WATER, -1, 101, 80, 82, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Mud Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(61, "Poliwhirl", Types.WATER, -1, 130, 130, 130, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Mud Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Scald");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(62, "Poliwrath", Types.WATER, Types.FIGHTING, 182, 180, 187, true);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dynamic Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Submission");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(63, "Abra", Types.PSYCHIC, -1, 195, 50, 103, false);


		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Signal Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(64, "Kadabra", Types.PSYCHIC, -1, 232, 80, 138, false);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Psycho Cut");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(65, "Alakazam", Types.PSYCHIC, -1, 271, 110, 194, true);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Psycho Cut");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Focus Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Future Sight");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(66, "Machop", Types.FIGHTING, -1, 137, 140, 88, false);


		qm = moves.getQuickMove("Karate Chop");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Chop");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Low Sweep");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(67, "Machoke", Types.FIGHTING, -1, 177, 160, 130, false);


		qm = moves.getQuickMove("Karate Chop");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dynamic Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Submission");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Chop");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(68, "Machamp", Types.FIGHTING, -1, 234, 180, 162, true);


		qm = moves.getQuickMove("Karate Chop");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bullet Punch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Heavy Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dynamic Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Chop");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Submission");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(69, "Bellsprout", Types.GRASS, Types.POISON, 139, 100, 64, false);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Vine Whip");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Power Whip");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wrap");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(70, "Weepinbell", Types.GRASS, Types.POISON, 172, 130, 95, false);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Power Whip");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(71, "Victreebel", Types.GRASS, Types.POISON, 207, 160, 138, true);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Leaf Blade");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(72, "Tentacool", Types.POISON, Types.WATER, 97, 80, 182, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wrap");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(73, "Tentacruel", Types.POISON, Types.WATER, 166, 160, 237, true);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Jab");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Wave");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(74, "Geodude", Types.GROUND, Types.ROCK, 132, 80, 163, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(75, "Graveler", Types.GROUND, Types.ROCK, 164, 110, 196, false);


		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(76, "Golem", Types.GROUND, Types.ROCK, 211, 160, 229, true);


		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Rock Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(77, "Ponyta", Types.FIRE, -1, 170, 100, 132, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Wheel");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Charge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(78, "Rapidash", Types.FIRE, -1, 207, 130, 167, false);


		qm = moves.getQuickMove("Fire Spin");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heat Wave");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Drill Run");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(79, "Slowpoke", Types.PSYCHIC, Types.WATER, 109, 180, 109, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(80, "Slowbro", Types.PSYCHIC, Types.WATER, 177, 190, 194, true);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(81, "Magnemite", Types.ELECTRIC, Types.STEEL, 165, 50, 128, false);

		qm = moves.getQuickMove("Spark");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Magnet Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(82, "Magneton", Types.ELECTRIC, Types.STEEL, 223, 100, 182, true);

		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Spark");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Zap Cannon");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Magnet Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flash Cannon");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(83, "Farfetch'd", Types.FLYING, Types.NORMAL, 124, 104, 118, true);
		qm = moves.getQuickMove("Cut");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Air Slash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Leaf Blade");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(84, "Doduo", Types.FLYING, Types.NORMAL, 158, 70, 88, false);


		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Drill Peck");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brave Bird");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Swift");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(85, "Dodrio", Types.FLYING, Types.NORMAL, 218, 120, 145, false);


		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Drill Peck");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brave Bird");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(86, "Seel", Types.WATER, -1, 85, 130, 128, false);


		qm = moves.getQuickMove("Lick");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aurora Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Jet");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(87, "Dewgong", Types.ICE, Types.WATER, 139, 180, 184, false);


		qm = moves.getQuickMove("Frost Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Iron Tail");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aurora Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Jet");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(88, "Grimer", Types.POISON, -1, 135, 160, 90, false);


		qm = moves.getQuickMove("Poison Jab");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sludge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Mud Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(89, "Muk", Types.POISON, -1, 190, 210, 184, false);


		qm = moves.getQuickMove("Poison Jab");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Lick");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Gunk Shot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Wave");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(90, "Shellder", Types.WATER, -1, 116, 60, 168, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(91, "Cloyster", Types.ICE, Types.WATER, 186, 100, 323, false);


		qm = moves.getQuickMove("Frost Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Avalanche");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aurora Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(92, "Gastly", Types.GHOST, Types.POISON, 186, 60, 70, false);


		qm = moves.getQuickMove("Lick");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Sucker Punch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Astonish");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Shade");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ominous Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(93, "Haunter", Types.GHOST, Types.POISON, 223, 90, 112, false);

		qm = moves.getQuickMove("Shadow Claw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Astonish");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Lick");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Punch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(94, "Gengar", Types.GHOST, Types.POISON, 261, 120, 156, false);


		qm = moves.getQuickMove("Shadow Claw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hex");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Sucker Punch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Wave");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Focus Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(95, "Onix", Types.GROUND, Types.ROCK, 85, 70, 288, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Iron Head");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heavy Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sand Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(96, "Drowzee", Types.PSYCHIC, -1, 89, 120, 158, false);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(97, "Hypno", Types.PSYCHIC, -1, 144, 170, 215, false);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Future Sight");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Focus Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(98, "Krabby", Types.WATER, -1, 181, 60, 156, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Vice Grip");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(99, "Kingler", Types.WATER, -1, 240, 110, 214, false);

		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Metal Claw");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Vice Grip");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(100, "Voltorb", Types.ELECTRIC, -1, 109, 80, 114, false);

		qm = moves.getQuickMove("Spark");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Gyro Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Signal Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(101, "Electrode", Types.ELECTRIC, -1, 173, 120, 179, false);


		qm = moves.getQuickMove("Spark");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Volt Switch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(102, "Exeggcute", Types.GRASS, Types.PSYCHIC, 107, 120, 140, false);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(103, "Exeggutor", Types.GRASS, Types.PSYCHIC, 233, 190, 158, false);


		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(104, "Cubone", Types.GROUND, -1, 90, 100, 165, false);


		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Bone Club");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bulldoze");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(105, "Marowak", Types.GROUND, -1, 144, 120, 200, false);


		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bone Club");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);


		pokemon = new Pokemon(106, "Hitmonlee", Types.FIGHTING, -1, 224, 100, 211, false);

		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Low Sweep");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(107, "Hitmonchan", Types.FIGHTING, -1, 193, 100, 212, false);


		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bullet Punch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(108, "Lickitung", Types.NORMAL, -1, 108, 180, 137, false);

		qm = moves.getQuickMove("Lick");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Power Whip");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(109, "Koffing", Types.POISON, -1, 119, 80, 164, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sludge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(110, "Weezing", Types.WATER, -1, 174, 130, 221, false);


		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(111, "Rhyhorn", Types.GROUND, Types.ROCK, 140, 160, 157, false);


		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bulldoze");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Horn Attack");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(112, "Rhydon", Types.GROUND, Types.ROCK, 222, 210, 206, true);

		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Megahorn");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(113, "Chansey", Types.NORMAL, -1, 60, 500, 176, false);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(114, "Tangela", Types.GRASS, -1, 183, 130, 205, false);


		qm = moves.getQuickMove("Vine Whip");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Power Whip");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(115, "Kangaskhan", Types.NORMAL, -1, 181, 210, 165, false);


		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Slap");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Outrage");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(116, "Horsea", Types.WATER, -1, 129, 60, 125, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dragon Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flash Cannon");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(117, "Seadra", Types.WATER, -1, 187, 110, 182, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Dragon Breath");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dragon Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aurora Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(118, "Goldeen", Types.WATER, -1, 123, 90, 115, false);


		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Horn Attack");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(119, "Seaking", Types.WATER, -1, 175, 160, 154, false);


		qm = moves.getQuickMove("Poison Jab");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Drill Run");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Megahorn");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(120, "Staryu", Types.WATER, -1, 137, 60, 112, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Power Gem");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Swift");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(121, "Starmie", Types.PSYCHIC, Types.WATER, 210, 120, 184, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fire");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Water");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Grass");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Electric");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ice");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fighting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Poison");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ground");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Flying");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Psychic");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Rock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ghost");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Dragon");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Steel");
		pokemon.learnQuickMove(qm);

		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Power Gem");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(122, "Mr. Mime", Types.FAIRY, Types.PSYCHIC, 192, 80, 233, false);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(123, "Scyther", Types.BUG, Types.FLYING, 218, 140, 170, false);


		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Air Slash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Bug Buzz");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Slash");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(124, "Jynx", Types.ICE, Types.PSYCHIC, 223, 130, 182, false);


		qm = moves.getQuickMove("Frost Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Avalanche");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Draining Kiss");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(125, "Electabuzz", Types.ELECTRIC, -1, 198, 130, 173, false);

		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder Punch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(126, "Magmar", Types.FIRE, -1, 206, 130, 169, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Karate Chop");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Punch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(127, "Pinsir", Types.BUG, -1, 238, 130, 197, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Submission");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Vice Grip");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(128, "Tauros", Types.NORMAL, -1, 198, 150, 197, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Iron Head");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Horn Attack");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(129, "Magikarp", Types.WATER, -1, 29, 40, 102, false);


		qm = moves.getQuickMove("Splash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(130, "Gyarados", Types.FLYING, Types.WATER, 237, 190, 197, false);


		qm = moves.getQuickMove("Dragon Tail");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Dragon Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Outrage");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dragon Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Twister");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(131, "Lapras", Types.ICE, Types.WATER, 165, 260, 180, true);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Frost Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dragon Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(132, "Ditto", Types.NORMAL, -1, 91, 96, 91, false);


		qm = moves.getQuickMove("Transform");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(133, "Eevee", Types.NORMAL, -1, 104, 110, 121, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Swift");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(134, "Vaporeon", Types.WATER, -1, 205, 260, 177, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(135, "Jolteon", Types.ELECTRIC, -1, 232, 130, 201, false);


		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Volt Switch");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(136, "Flareon", Types.FIRE, -1, 246, 130, 204, false);

		qm = moves.getQuickMove("Fire Spin");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Overheat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heat Wave");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(137, "Porygon", Types.NORMAL, -1, 153, 130, 139, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fire");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Water");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Grass");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Electric");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ice");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fighting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Poison");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ground");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Flying");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Psychic");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Rock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ghost");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Dragon");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Steel");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Signal Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Zap Cannon");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(138, "Omanyte", Types.ROCK, Types.WATER, 155, 70, 174, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Brine");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(139, "Omastar", Types.ROCK, Types.WATER, 207, 140, 227, false);


		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(140, "Kabuto", Types.ROCK, Types.WATER, 148, 60, 162, false);


		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aqua Jet");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(141, "Kabutops", Types.ROCK, Types.WATER, 220, 120, 203, false);


		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(142, "Aerodactyl", Types.FLYING, Types.ROCK, 221, 160, 164, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Iron Head");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(143, "Snorlax", Types.NORMAL, -1, 190, 320, 190, true);


		qm = moves.getQuickMove("Lick");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heavy Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(144, "Articuno", Types.FLYING, Types.ICE, 192, 180, 249, false);


		qm = moves.getQuickMove("Frost Breath");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(145, "Zapdos", Types.ELECTRIC, Types.FLYING, 253, 180, 188, false);


		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Zap Cannon");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(146, "Moltres", Types.FIRE, Types.FLYING, 251, 180, 184, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fire Spin");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Overheat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heat Wave");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(147, "Dratini", Types.DRAGON, -1, 119, 82, 94, false);

		qm = moves.getQuickMove("Dragon Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Iron Tail");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Twister");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wrap");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(148, "Dragonair", Types.DRAGON, -1, 163, 122, 138, false);


		qm = moves.getQuickMove("Dragon Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Iron Tail");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dragon Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wrap");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(149, "Dragonite", Types.DRAGON, Types.FLYING, 263, 182, 201, false);


		qm = moves.getQuickMove("Dragon Tail");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Dragon Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Outrage");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hurricane");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dragon Claw");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dragon Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(150, "Mewtwo", Types.PSYCHIC, -1, 300, 193, 182, true);

		qm = moves.getQuickMove("Psycho Cut");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Focus Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(151, "Mew", Types.PSYCHIC, -1, 210, 200, 209, false);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Focus Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hurricane");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dragon Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(152, "Chikorita", Types.GRASS, -1, 92, 90, 122, false);

		qm = moves.getQuickMove("Vine Whip");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Energy Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(153, "Bayleef", Types.GRASS, -1, 122, 120, 155, false);


		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Energy Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(154, "Meganium", Types.GRASS, -1, 168, 160, 202, false);


		qm = moves.getQuickMove("Vine Whip");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Petal Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(155, "Cyndaquil", Types.FIRE, -1, 116, 78, 96, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Swift");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(156, "Quilava", Types.FIRE, -1, 158, 116, 129, false);

		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(157, "Typhlosion", Types.FIRE, -1, 223, 156, 176, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Shadow Claw");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Overheat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(158, "Totodile", Types.WATER, -1, 117, 100, 116, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Jet");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(159, "Croconaw", Types.WATER, -1, 150, 130, 151, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Punch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(160, "Feraligatr", Types.WATER, -1, 205, 170, 197, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(161, "Sentret", Types.NORMAL, -1, 79, 70, 77, false);


		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(162, "Furret", Types.NORMAL, -1, 148, 170, 130, false);


		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Sucker Punch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(163, "Hoothoot", Types.FLYING, Types.NORMAL, 67, 120, 101, false);


		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sky Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Shade");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(164, "Noctowl", Types.FLYING, Types.NORMAL, 145, 200, 179, false);


		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sky Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Shade");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(165, "Ledyba", Types.BUG, Types.FLYING, 72, 80, 142, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Silver Wind");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Swift");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(166, "Ledian", Types.BUG, Types.FLYING, 107, 110, 209, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Struggle Bug");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Bug Buzz");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Silver Wind");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(167, "Spinarak", Types.BUG, Types.POISON, 105, 80, 73, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Signal Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Slash");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Poison");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(168, "Ariados", Types.BUG, Types.POISON, 161, 140, 128, false);


		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Megahorn");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Poison");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Sneak");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(169, "Crobat", Types.FLYING, Types.POISON, 194, 170, 178, false);


		qm = moves.getQuickMove("Air Slash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Air Cutter");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(170, "Chinchou", Types.ELECTRIC, Types.WATER, 106, 150, 106, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Spark");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(171, "Lanturn", Types.ELECTRIC, Types.WATER, 146, 250, 146, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(172, "Pichu", Types.ELECTRIC, -1, 77, 40, 63, false);


		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Disarming Voice");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder Punch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(173, "Cleffa", Types.FAIRY, -1, 75, 100, 91, false);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Signal Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(174, "Igglybuff", Types.FAIRY, Types.NORMAL, 69, 180, 34, false);

		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wild Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(175, "Togepi", Types.FAIRY, -1, 67, 70, 116, false);


		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fire");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Water");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Grass");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Electric");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ice");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fighting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Poison");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ground");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Flying");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Psychic");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Rock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ghost");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Dragon");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Steel");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fairy");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(176, "Togetic", Types.FAIRY, Types.FLYING, 139, 110, 191, false);


		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fire");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Water");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Grass");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Electric");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ice");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fighting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Poison");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ground");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Flying");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Psychic");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Rock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ghost");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Dragon");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Steel");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fairy");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(177, "Natu", Types.FLYING, Types.PSYCHIC, 134, 80, 89, false);


		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Drill Peck");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Shade");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(178, "Xatu", Types.FLYING, Types.PSYCHIC, 192, 130, 146, false);


		qm = moves.getQuickMove("Air Slash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Future Sight");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ominous Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(179, "Mareep", Types.ELECTRIC, -1, 114, 110, 82, false);


		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(180, "Flaaffy", Types.ELECTRIC, -1, 145, 140, 112, false);


		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Power Gem");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(181, "Ampharos", Types.ELECTRIC, -1, 211, 180, 172, false);


		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Volt Switch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Zap Cannon");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Focus Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(182, "Bellossom", Types.GRASS, -1, 169, 150, 189, false);


		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Acid");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Leaf Blade");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Petal Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(183, "Marill", Types.FAIRY, Types.WATER, 37, 140, 93, false);

		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(184, "Azumarill", Types.FAIRY, Types.WATER, 112, 200, 152, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(185, "Sudowoodo", Types.ROCK, -1, 167, 140, 198, false);


		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(186, "Politoed", Types.WATER, -1, 174, 180, 192, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(187, "Hoppip", Types.FLYING, Types.GRASS, 67, 70, 101, false);


		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(188, "Skiploom", Types.FLYING, Types.GRASS, 91, 110, 127, false);


		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Energy Ball");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(189, "Jumpluff", Types.FLYING, Types.GRASS, 118, 150, 197, false);


		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Infestation");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Energy Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(190, "Aipom", Types.NORMAL, -1, 136, 110, 112, false);


		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Astonish");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Swift");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Low Sweep");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(191, "Sunkern", Types.GRASS, -1, 55, 60, 55, false);


		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Cut");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Grass Knot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Energy Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Seed Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(192, "Sunflora", Types.GRASS, -1, 185, 150, 148, false);


		qm = moves.getQuickMove("Razor Leaf");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bullet Seed");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Petal Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(193, "Yanma", Types.BUG, Types.FLYING, 154, 130, 94, false);


		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Silver Wind");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(194, "Wooper", Types.GROUND, Types.WATER, 75, 110, 75, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Mud Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(195, "Quagsire", Types.GROUND, Types.WATER, 152, 190, 152, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Bomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(196, "Espeon", Types.PSYCHIC, -1, 261, 130, 194, false);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Future Sight");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psybeam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(197, "Umbreon", Types.DARK, -1, 126, 190, 250, false);


		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Snarl");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Foul Play");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(198, "Murkrow", Types.DARK, Types.FLYING, 175, 120, 87, false);


		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Foul Play");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Drill Peck");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(199, "Slowking", Types.PSYCHIC, Types.WATER, 177, 190, 194, false);

		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(200, "Misdreavus", Types.GHOST, -1, 167, 120, 167, false);


		qm = moves.getQuickMove("Hex");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Astonish");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Ominous Wind");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Shadow Sneak");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(201, "Unown", Types.PSYCHIC, -1, 136, 96, 91, false);


		qm = moves.getQuickMove("Hidden Power Fire");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Water");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Grass");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Electric");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ice");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fighting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Poison");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ground");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Flying");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Psychic");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Rock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ghost");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Dragon");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Steel");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(202, "Wobbuffet", Types.PSYCHIC, -1, 60, 380, 106, false);


		qm = moves.getQuickMove("Splash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Mirror Coat");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(203, "Girafarig", Types.NORMAL, Types.PSYCHIC, 182, 140, 133, false);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Mirror Coat");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(204, "Pineco", Types.BUG, -1, 108, 100, 146, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Gyro Ball");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sand Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(205, "Forretress", Types.BUG, Types.STEEL, 161, 150, 242, false);


		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Struggle Bug");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Heavy Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Tomb");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(206, "Dunsparce", Types.NORMAL, -1, 131, 200, 131, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Astonish");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Drill Run");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(207, "Gligar", Types.FLYING, Types.GROUND, 143, 130, 204, false);


		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Slash");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(208, "Steelix", Types.GROUND, Types.STEEL, 148, 150, 333, false);


		qm = moves.getQuickMove("Iron Tail");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Dragon Tail");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Heavy Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(209, "Snubbull", Types.FAIRY, -1, 137, 120, 89, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(210, "Granbull", Types.FAIRY, -1, 212, 180, 137, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Snarl");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(211, "Qwilfish", Types.POISON, Types.WATER, 184, 130, 148, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sludge Wave");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(212, "Scizor", Types.BUG, Types.STEEL, 236, 140, 191, false);


		qm = moves.getQuickMove("Bullet Punch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fury Cutter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Iron Head");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("X-Scissor");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Night Slash");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(213, "Shuckle", Types.BUG, Types.ROCK, 17, 40, 396, false);


		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Struggle Bug");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Gyro Ball");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(214, "Heracross", Types.BUG, Types.FIGHTING, 234, 160, 189, false);


		qm = moves.getQuickMove("Struggle Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Megahorn");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(215, "Sneasel", Types.DARK, Types.ICE, 189, 110, 157, false);


		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Foul Play");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Avalanche");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Punch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(216, "Teddiursa", Types.NORMAL, -1, 142, 120, 93, false);


		qm = moves.getQuickMove("Scratch");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Lick");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Cross Chop");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(217, "Ursaring", Types.NORMAL, -1, 236, 180, 144, false);


		qm = moves.getQuickMove("Metal Claw");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(218, "Slugma", Types.FIRE, -1, 118, 80, 71, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Flame Burst");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(219, "Magcargo", Types.FIRE, Types.ROCK, 139, 100, 209, false);

		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Throw");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Overheat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heat Wave");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(220, "Swinub", Types.GROUND, Types.ICE, 90, 100, 74, false);

		qm = moves.getQuickMove("Powder Snow");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(221, "Piloswine", Types.GROUND, Types.ICE, 181, 200, 147, false);


		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Powder Snow");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Avalanche");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bulldoze");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(222, "Corsola", Types.ROCK, Types.WATER, 118, 110, 156, false);


		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Power Gem");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(223, "Remoraid", Types.WATER, -1, 127, 70, 69, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aurora Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(224, "Octillery", Types.WATER, -1, 197, 150, 141, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Mud Shot");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Gunk Shot");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aurora Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(225, "Delibird", Types.FLYING, Types.ICE, 128, 90, 90, false);


		qm = moves.getQuickMove("Ice Shard");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Ice Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(226, "Mantine", Types.FLYING, Types.WATER, 148, 130, 260, false);


		qm = moves.getQuickMove("Wing Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bubble");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(227, "Skarmory", Types.FLYING, Types.STEEL, 148, 130, 260, false);


		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Air Slash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Flash Cannon");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Sky Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brave Bird");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(228, "Houndour", Types.DARK, Types.FIRE, 152, 90, 93, false);


		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(229, "Houndoom", Types.DARK, Types.FIRE, 224, 150, 159, false);


		qm = moves.getQuickMove("Snarl");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fire Fang");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Foul Play");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(230, "Kingdra", Types.DRAGON, Types.WATER, 194, 150, 194, false);


		qm = moves.getQuickMove("Dragon Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Outrage");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

		pokemon = new Pokemon(231, "Phanpy", Types.GROUND, -1, 107, 180, 107, false);


		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Bulldoze");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(232, "Donphan", Types.GROUND, -1, 214, 180, 214, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Earthquake");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Play Rough");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Heavy Slam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(233, "Porygon2", Types.NORMAL, -1, 198, 170, 183, false);

		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fire");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Water");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Grass");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Electric");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ice");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fighting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Poison");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ground");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Flying");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Psychic");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Rock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ghost");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Dragon");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Steel");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Zap Cannon");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(234, "Stantler", Types.NORMAL, -1, 192, 146, 132, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wild Charge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Megahorn");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(235, "Smeargle", Types.NORMAL, -1, 40, 110, 88, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(236, "Tyrogue", Types.FIGHTING, -1, 64, 70, 64, false);


		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Rock Slide");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Low Sweep");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(237, "Hitmontop", Types.FIGHTING, -1, 173, 100, 214, false);

		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Close Combat");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Gyro Ball");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(238, "Smoochum", Types.ICE, Types.PSYCHIC, 153, 90, 116, false);

		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Frost Breath");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Powder Snow");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(239, "Elekid", Types.ELECTRIC, -1, 135, 90, 110, false);


		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Low Kick");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunder Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Discharge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(240, "Magby", Types.FIRE, -1, 151, 90, 108, false);


		qm = moves.getQuickMove("Ember");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Karate Chop");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Brick Break");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Punch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Flame Burst");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(241, "Miltank", Types.NORMAL, -1, 157, 190, 211, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Body Slam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Gyro Ball");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(242, "Blissey", Types.NORMAL, -1, 129, 510, 229, false);


		qm = moves.getQuickMove("Pound");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(243, "Raikou", Types.ELECTRIC, -1, 241, 180, 210, false);


		qm = moves.getQuickMove("Thunder Shock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Volt Switch");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Thunder");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Thunderbolt");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Wild Charge");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(244, "Entei", Types.FIRE, -1, 235, 230, 176, false);

		qm = moves.getQuickMove("Fire Spin");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Fire Fang");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Flamethrower");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Overheat");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(245, "Suicune", Types.WATER, -1, 180, 200, 235, false);


		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Snarl");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fire");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Water");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Grass");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Electric");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ice");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Fighting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Poison");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ground");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Flying");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Psychic");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Bug");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Rock");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Ghost");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Dragon");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power Steel");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(246, "Larvitar", Types.GROUND, Types.ROCK, 115, 100, 93, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Stomp");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(247, "Pupitar", Types.GROUND, Types.ROCK, 155, 140, 133, false);


		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Rock Smash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dig");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(248, "Tyranitar", Types.DARK, Types.ROCK, 251, 200, 212, false);

		qm = moves.getQuickMove("Bite");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Iron Tail");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Crunch");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Stone Edge");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(249, "Lugia", Types.FLYING, Types.PSYCHIC, 193, 212, 323, false);


		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Dragon Tail");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Sky Attack");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Future Sight");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(250, "Ho-Oh", Types.FIRE, Types.FLYING, 263, 212, 301, false);


		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Brave Bird");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Fire Blast");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(251, "Celebi", Types.GRASS, Types.PSYCHIC, 210, 200, 210, false);


		qm = moves.getQuickMove("Confusion");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);

	}


	public Pokemon getPokemon(String name) {

		for (Pokemon poke : allPokemon) {
			if (name.equalsIgnoreCase(poke.getName()))
				return poke;
		}

		System.err.println("POKEMON NOT FOUND:" + name);
		return null;

	}


	public Pokemon getPokemon(int pokdexEntry) {

		if (pokdexEntry > 251) {
			System.err.println("POKEMON INDEX NOT FOUND:" + pokdexEntry);
		} else if (pokdexEntry < 1){
			System.err.println("POKEMON INDEX INVALID:" + pokdexEntry);
		}


		return allPokemon.get(pokdexEntry-1);
	}

}
