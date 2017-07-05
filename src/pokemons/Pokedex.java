/**
 * 
 */

package pokemons;


import java.util.ArrayList;
import java.util.List;

import moves.AllMoves;
import moves.ChargeMove;
import moves.QuickMove;

/**
 * @author Ricardo Martinho
 *
 */
public class Pokedex {

	private static List<Pokemon> allPokemon = new ArrayList<>();
	
	static {
		addAllPokemon();
	}


	public Pokedex() {

	}


	private static void addAllPokemon() {

		Pokemon pokemon;
		QuickMove qm;
		ChargeMove cm;
		AllMoves moves = new AllMoves();

		pokemon = new Pokemon(1, "Bulbasaur", "Grass", "Poison", 118, 90, 118, false);

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

		pokemon = new Pokemon(2, "Ivysaur", "Grass", "Poison", 151, 120, 151, false);

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

		pokemon = new Pokemon(3, "Venusaur", "Grass", "Poison", 198, 160, 198, true);

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

		pokemon = new Pokemon(4, "Charmander", "Fire", null, 116, 78, 96, false);

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

		pokemon = new Pokemon(5, "Charmeleon", "Fire", null, 158, 116, 129, false);

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

		pokemon = new Pokemon(6, "Charizard", "Fire", "Flying", 223, 156, 176, true);

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

		pokemon = new Pokemon(7, "Squirtle", "Water", null, 94, 88, 122, false);

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

		pokemon = new Pokemon(8, "Wartortle", "Water", null, 126, 118, 155, false);

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

		pokemon = new Pokemon(9, "Blastoise", "Water", null, 171, 158, 210, true);

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

		pokemon = new Pokemon(10, "Caterpie", "Bug", null, 55, 90, 62, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(11, "Metapod", "Bug", null, 45, 100, 94, false);

		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(12, "Butterfree", "Bug", "Flying", 167, 120, 151, true);

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

		pokemon = new Pokemon(13, "Weedle", "Bug", "Poison", 63, 80, 55, false);

		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(14, "Kakuna", "Bug", "Poison", 46, 90, 86, false);

		qm = moves.getQuickMove("Poison Sting");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Bug Bite");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);

		allPokemon.add(pokemon);

		pokemon = new Pokemon(15, "Beedrill", "Bug", "Poison", 169, 130, 150, true);

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

		pokemon = new Pokemon(16, "Pidgey", "Flying", "Normal", 85, 80, 76, false);

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

		pokemon = new Pokemon(17, "Pidgeotto", "Flying", "Normal", 117, 126, 108, false);

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

		pokemon = new Pokemon(18, "Pidgeot", "Flying", "Normal", 166, 166, 157, true);


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

		pokemon = new Pokemon(19, "Rattata", "Normal", null, 103, 60, 70, false);


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

		pokemon = new Pokemon(20, "Raticate", "Normal", null, 161, 110, 144, true);

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

		pokemon = new Pokemon(21, "Spearow", "Flying", "Normal", 112, 80, 61, false);


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


		pokemon = new Pokemon(22, "Fearow", "Flying", "Normal", 182, 130, 135, true);


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

		pokemon = new Pokemon(23, "Ekans", "Poison", null, 110, 70, 102, false);


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


		pokemon = new Pokemon(24, "Arbok", "Poison", null, 167, 120, 158, true);


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


		pokemon = new Pokemon(25, "Pikachu", "Electric", null, 112, 70, 101, false);


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

		pokemon = new Pokemon(26, "Raichu", "Electric", null, 193, 120, 165, true);

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


		pokemon = new Pokemon(27, "Sandshrew", "Ground", null, 126, 100, 145, false);


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


		pokemon = new Pokemon(28, "Sandslash", "Ground", null, 182, 150, 202, false);


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


		pokemon = new Pokemon(29, "Nidoran female", "Poison", null, 86, 110, 94, false);


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


		pokemon = new Pokemon(30, "Nidorina", "Poison", null, 117, 140, 126, false);


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


		pokemon = new Pokemon(31, "Nidoqueen", "Ground", "Poison", 180, 180, 174, true);


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


		pokemon = new Pokemon(32, "Nidoran male", "Poison", null, 105, 92, 76, false);


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


		pokemon = new Pokemon(33, "Nidorino", "Poison", null, 137, 122, 112, false);


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


		pokemon = new Pokemon(34, "Nidoking", "Ground", "Poison", 204, 162, 157, true);


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


		pokemon = new Pokemon(35, "Clefairy", "Fairy", null, 107, 140, 116, false);


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


		pokemon = new Pokemon(36, "Clefable", "Fairy", null, 178, 190, 171, false);


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

		pokemon = new Pokemon(37, "Vulpix", "Fire", null, 96, 76, 122, false);


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


		pokemon = new Pokemon(38, "Ninetales", "Fire", null, 169, 146, 204, true);


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


		pokemon = new Pokemon(39, "Jigglypuff", "Fairy", "Normal", 80, 230, 44, false);


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


		pokemon = new Pokemon(40, "Wigglytuff", "Fairy", "Normal", 156, 280, 93, true);


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


		pokemon = new Pokemon(41, "Zubat", "Flying", "Poison", 83, 80, 76, false);


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


		pokemon = new Pokemon(42, "Golbat", "Flying", "Poison", 161, 150, 153, false);


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


		pokemon = new Pokemon(43, "Oddish", "Grass", "Poison", 131, 90, 116, false);


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


		pokemon = new Pokemon(44, "Gloom", "Grass", "Poison", 153, 120, 139, false);


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


		pokemon = new Pokemon(45, "Vileplume", "Grass", "Poison", 202, 150, 170, true);


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


		pokemon = new Pokemon(46, "Paras", "Bug", "Grass", 121, 70, 99, false);


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


		pokemon = new Pokemon(47, "Parasect", "Bug", "Grass", 165, 120, 146, true);


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


		pokemon = new Pokemon(48, "Venonat", "Bug", "Poison", 100, 120, 102, false);


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


		pokemon = new Pokemon(49, "Venomoth", "Bug", "Poison", 179, 140, 150, true);


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


		pokemon = new Pokemon(50, "Diglett", "Ground", null, 109, 20, 88, false);


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


		pokemon = new Pokemon(51, "Dugtrio", "Ground", null, 167, 70, 147, true);


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


		pokemon = new Pokemon(52, "Meowth", "Normal", null, 92, 80, 81, false);


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


		pokemon = new Pokemon(53, "Persian", "Normal", null, 150, 130, 139, true);


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


		pokemon = new Pokemon(54, "Psyduck", "Water", null, 122, 100, 96, false);


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


		pokemon = new Pokemon(55, "Golduck", "Water", null, 191, 160, 163, true);


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


		pokemon = new Pokemon(56, "Mankey", "Fight", null, 148, 80, 87, false);


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


		pokemon = new Pokemon(57, "Primeape", "Fight", null, 207, 130, 144, true);


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


		pokemon = new Pokemon(58, "Growlithe", "Fire", null, 136, 110, 96, false);


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


		pokemon = new Pokemon(59, "Arcanine", "Fire", null, 227, 180, 166, true);


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


		pokemon = new Pokemon(60, "Poliwag", "Water", null, 101, 80, 82, false);


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


		pokemon = new Pokemon(61, "Poliwhirl", "Water", null, 130, 130, 130, false);


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


		pokemon = new Pokemon(62, "Poliwrath", "Water", "Fight", 182, 180, 187, true);


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


		pokemon = new Pokemon(63, "Abra", "Psychic", null, 195, 50, 103, false);


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


		pokemon = new Pokemon(64, "Kadabra", "Psychic", null, 232, 80, 138, false);


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

		pokemon = new Pokemon(65, "Alakazam", "Psychic", null, 271, 110, 194, true);


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


		pokemon = new Pokemon(66, "Machop", "Fight", null, 137, 140, 88, false);


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


		pokemon = new Pokemon(67, "Machoke", "Fight", null, 177, 160, 130, false);


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


		pokemon = new Pokemon(68, "Machamp", "Fight", null, 234, 180, 162, true);


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


		pokemon = new Pokemon(69, "Bellsprout", "Grass", "Poison", 139, 100, 64, false);


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


		pokemon = new Pokemon(70, "Weepinbell", "Grass", "Poison", 172, 130, 95, false);


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


		pokemon = new Pokemon(71, "Victreebel", "Grass", "Poison", 207, 160, 138, true);


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


		pokemon = new Pokemon(72, "Tentacool", "Poison", "Water", 97, 80, 182, false);


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


		pokemon = new Pokemon(73, "Tentacruel", "Poison", "Water", 166, 160, 237, true);


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


		pokemon = new Pokemon(74, "Geodude", "Ground", "Rock", 132, 80, 163, false);


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


		pokemon = new Pokemon(75, "Graveler", "Ground", "Rock", 164, 110, 196, false);


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


		pokemon = new Pokemon(76, "Golem", "Ground", "Rock", 211, 160, 229, true);


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


		pokemon = new Pokemon(77, "Ponyta", "Fire", null, 170, 100, 132, false);


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


		pokemon = new Pokemon(78, "Rapidash", "Fire", null, 207, 130, 167, false);


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


		pokemon = new Pokemon(79, "Slowpoke", "Psychic", "Water", 109, 180, 109, false);


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


		pokemon = new Pokemon(80, "Slowbro", "Psychic", "Water", 177, 190, 194, true);


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


		pokemon = new Pokemon(81, "Magnemite", "Electric", "Steel", 165, 50, 128, false);

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


		pokemon = new Pokemon(82, "Magneton", "Electric", "Steel", 223, 100, 182, true);

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


		pokemon = new Pokemon(83, "Farfetch'd", "Flying", "Normal", 124, 104, 118, true);
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
		pokemon = new Pokemon(84, "Doduo", "Flying", "Normal", 158, 70, 88, false);


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
		pokemon = new Pokemon(85, "Dodrio", "Flying", "Normal", 218, 120, 145, false);


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
		pokemon = new Pokemon(86, "Seel", "Water", null, 85, 130, 128, false);


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
		pokemon = new Pokemon(87, "Dewgong", "Ice", "Water", 139, 180, 184, false);


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
		pokemon = new Pokemon(88, "Grimer", "Poison", null, 135, 160, 90, false);


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
		pokemon = new Pokemon(89, "Muk", "Poison", null, 190, 210, 184, false);


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
		pokemon = new Pokemon(90, "Shellder", "Water", null, 116, 60, 168, false);


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
		pokemon = new Pokemon(91, "Cloyster", "Ice", "Water", 186, 100, 323, false);


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
		pokemon = new Pokemon(92, "Gastly", "Ghost", "Poison", 186, 60, 70, false);


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
		pokemon = new Pokemon(93, "Haunter", "Ghost", "Poison", 223, 90, 112, false);

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
		pokemon = new Pokemon(94, "Gengar", "Ghost", "Poison", 261, 120, 156, false);


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
		pokemon = new Pokemon(95, "Onix", "Ground", "Rock", 85, 70, 288, false);


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
		pokemon = new Pokemon(96, "Drowzee", "Psychic", null, 89, 120, 158, false);


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
		pokemon = new Pokemon(97, "Hypno", "Psychic", null, 144, 170, 215, false);


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
		pokemon = new Pokemon(98, "Krabby", "Water", null, 181, 60, 156, false);


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
		pokemon = new Pokemon(99, "Kingler", "Water", null, 240, 110, 214, false);

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
		pokemon = new Pokemon(100, "Voltorb", "Electric", null, 109, 80, 114, false);

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
		pokemon = new Pokemon(101, "Electrode", "Electric", null, 173, 120, 179, false);


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
		pokemon = new Pokemon(102, "Exeggcute", "Grass", "Psychic", 107, 120, 140, false);


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
		pokemon = new Pokemon(103, "Exeggutor", "Grass", "Psychic", 233, 190, 158, false);


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
		pokemon = new Pokemon(104, "Cubone", "Ground", null, 90, 100, 165, false);


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
		pokemon = new Pokemon(105, "Marowak", "Ground", null, 144, 120, 200, false);


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


		pokemon = new Pokemon(106, "Hitmonlee", "Fight", null, 224, 100, 211, false);

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
		pokemon = new Pokemon(107, "Hitmonchan", "Fight", null, 193, 100, 212, false);


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
		pokemon = new Pokemon(108, "Lickitung", "Normal", null, 108, 180, 137, false);

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
		pokemon = new Pokemon(109, "Koffing", "Poison", null, 119, 80, 164, false);


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
		pokemon = new Pokemon(110, "Weezing", "Water", null, 174, 130, 221, false);


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
		pokemon = new Pokemon(111, "Rhyhorn", "Ground", "Rock", 140, 160, 157, false);


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
		pokemon = new Pokemon(112, "Rhydon", "Ground", "Rock", 222, 210, 206, true);

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
		pokemon = new Pokemon(113, "Chansey", "Normal", null, 60, 500, 176, false);


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
		pokemon = new Pokemon(114, "Tangela", "Grass", null, 183, 130, 205, false);


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
		pokemon = new Pokemon(115, "Kangaskhan", "Normal", null, 181, 210, 165, false);


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
		pokemon = new Pokemon(116, "Horsea", "Water", null, 129, 60, 125, false);


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
		pokemon = new Pokemon(117, "Seadra", "Water", null, 187, 110, 182, false);


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
		pokemon = new Pokemon(118, "Goldeen", "Water", null, 123, 90, 115, false);


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
		pokemon = new Pokemon(119, "Seaking", "Water", null, 175, 160, 154, false);


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
		pokemon = new Pokemon(120, "Staryu", "Water", null, 137, 60, 112, false);


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
		pokemon = new Pokemon(121, "Starmie", "Psychic", "Water", 210, 120, 184, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("HIDDEN POWER TO DO");
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
		pokemon = new Pokemon(122, "Mr. Mime", "Fairy", "Psychic", 192, 80, 233, false);


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
		pokemon = new Pokemon(123, "Scyther", "Bug", "Flying", 218, 140, 170, false);


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
		pokemon = new Pokemon(124, "Jynx", "Ice", "Psychic", 223, 130, 182, false);


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
		pokemon = new Pokemon(125, "Electabuzz", "Electric", null, 198, 130, 173, false);

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
		pokemon = new Pokemon(126, "Magmar", "Fire", null, 206, 130, 169, false);


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
		pokemon = new Pokemon(127, "Pinsir", "Bug", null, 238, 130, 197, false);


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
		pokemon = new Pokemon(128, "Tauros", "Normal", null, 198, 150, 197, false);


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
		pokemon = new Pokemon(129, "Magikarp", "Water", null, 29, 40, 102, false);


		qm = moves.getQuickMove("Splash");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(130, "Gyarados", "Flying", "Water", 237, 190, 197, false);


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
		pokemon = new Pokemon(131, "Lapras", "Ice", "Water", 165, 260, 180, true);


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
		pokemon = new Pokemon(132, "Ditto", "Normal", null, 91, 96, 91, false);


		qm = moves.getQuickMove("Transform");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(133, "Eevee", "Normal", null, 104, 110, 121, false);


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
		pokemon = new Pokemon(134, "Vaporeon", "Water", null, 205, 260, 177, false);


		qm = moves.getQuickMove("Water Gun");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aqua Tail");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(135, "Jolteon", "Electric", null, 232, 130, 201, false);


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
		pokemon = new Pokemon(136, "Flareon", "Fire", null, 246, 130, 204, false);

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
		pokemon = new Pokemon(137, "Porygon", "Normal", null, 153, 130, 139, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Quick Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("HIDDEN POWER TODO");
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
		pokemon = new Pokemon(138, "Omanyte", "Rock", "Water", 155, 70, 174, false);


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
		pokemon = new Pokemon(139, "Omastar", "Rock", "Water", 207, 140, 227, false);


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
		pokemon = new Pokemon(140, "Kabuto", "Rock", "Water", 148, 60, 162, false);


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
		pokemon = new Pokemon(141, "Kabutops", "Rock", "Water", 220, 120, 203, false);


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
		pokemon = new Pokemon(142, "Aerodactyl", "Flying", "Rock", 221, 160, 164, false);


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
		pokemon = new Pokemon(143, "Snorlax", "Normal", null, 190, 320, 190, true);


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
		pokemon = new Pokemon(144, "Articuno", "Flying", "Ice", 192, 180, 249, false);


		qm = moves.getQuickMove("Frost Breath");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Blizzard");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ice Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Icy Wind");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(145, "Zapdos", "Electric", "Flying", 253, 180, 188, false);


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
		pokemon = new Pokemon(146, "Moltres", "Fire", "Flying", 251, 180, 184, false);


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
		pokemon = new Pokemon(147, "Dratini", "Dragon", null, 119, 82, 94, false);

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
		pokemon = new Pokemon(148, "Dragonair", "Dragon", null, 163, 122, 138, false);


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
		pokemon = new Pokemon(149, "Dragonite", "Dragon", "Flying", 263, 182, 201, false);


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
		pokemon = new Pokemon(150, "Mewtwo", "Psychic", null, 330, 212, 200, false);

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
		pokemon = new Pokemon(151, "Mew", "Psychic", null, 210, 200, 209, false);


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
		pokemon = new Pokemon(152, "Chikorita", "Grass", null, 92, 90, 122, false);

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
		pokemon = new Pokemon(153, "Bayleef", "Grass", null, 122, 120, 155, false);


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
		pokemon = new Pokemon(154, "Meganium", "Grass", null, 168, 160, 202, false);


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
		pokemon = new Pokemon(155, "Cyndaquil", "Fire", null, 116, 78, 96, false);


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
		pokemon = new Pokemon(156, "Quilava", "Fire", null, 158, 116, 129, false);

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
		pokemon = new Pokemon(157, "Typhlosion", "Fire", null, 223, 156, 176, false);


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
		pokemon = new Pokemon(158, "Totodile", "Water", null, 117, 100, 116, false);


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
		pokemon = new Pokemon(159, "Croconaw", "Water", null, 150, 130, 151, false);


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
		pokemon = new Pokemon(160, "Feraligatr", "Water", null, 205, 170, 197, false);


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
		pokemon = new Pokemon(161, "Sentret", "Normal", null, 79, 70, 77, false);


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
		pokemon = new Pokemon(162, "Furret", "Normal", null, 148, 170, 130, false);


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
		pokemon = new Pokemon(163, "Hoothoot", "Flying", "Normal", 67, 120, 101, false);


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
		pokemon = new Pokemon(164, "Noctowl", "Flying", "Normal", 145, 200, 179, false);


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
		pokemon = new Pokemon(165, "Ledyba", "Bug", "Flying", 72, 80, 142, false);


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
		pokemon = new Pokemon(166, "Ledian", "Bug", "Flying", 107, 110, 209, false);


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
		pokemon = new Pokemon(167, "Spinarak", "Bug", "Poison", 105, 80, 73, false);


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
		pokemon = new Pokemon(168, "Ariados", "Bug", "Poison", 161, 140, 128, false);


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
		pokemon = new Pokemon(169, "Crobat", "Flying", "Poison", 194, 170, 178, false);


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
		pokemon = new Pokemon(170, "Chinchou", "Electric", "Water", 106, 150, 106, false);


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
		pokemon = new Pokemon(171, "Lanturn", "Electric", "Water", 146, 250, 146, false);


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
		pokemon = new Pokemon(172, "Pichu", "Electric", null, 77, 40, 63, false);


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
		pokemon = new Pokemon(173, "Cleffa", "Fairy", null, 75, 100, 91, false);


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
		pokemon = new Pokemon(174, "Igglybuff", "Fairy", "Normal", 69, 180, 34, false);

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
		pokemon = new Pokemon(175, "Togepi", "Fairy", null, 67, 70, 116, false);


		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Peck");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power TODO");
		pokemon.learnQuickMove(qm);

		cm = moves.getChargeMove("Psyshock");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(176, "Togetic", "Fairy", "Flying", 139, 110, 191, false);


		qm = moves.getQuickMove("Steel Wing");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Zen Headbutt");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power TODO");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Dazzling Gleam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Aerial Ace");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Ancient Power");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(177, "Natu", "Flying", "Psychic", 134, 80, 89, false);


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
		pokemon = new Pokemon(178, "Xatu", "Flying", "Psychic", 192, 130, 146, false);


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
		pokemon = new Pokemon(179, "Mareep", "Electric", null, 114, 110, 82, false);


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
		pokemon = new Pokemon(180, "Flaaffy", "Electric", null, 145, 140, 112, false);


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
		pokemon = new Pokemon(181, "Ampharos", "Electric", null, 211, 180, 172, false);


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
		pokemon = new Pokemon(182, "Bellossom", "Grass", null, 169, 150, 189, false);


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
		pokemon = new Pokemon(183, "Marill", "Fairy", "Water", 37, 140, 93, false);

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
		pokemon = new Pokemon(184, "Azumarill", "Fairy", "Water", 112, 200, 152, false);


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
		pokemon = new Pokemon(185, "Sudowoodo", "Rock", null, 167, 140, 198, false);


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
		pokemon = new Pokemon(186, "Politoed", "Water", null, 174, 180, 192, false);


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
		pokemon = new Pokemon(187, "Hoppip", "Flying", "Grass", 67, 70, 101, false);


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
		pokemon = new Pokemon(188, "Skiploom", "Flying", "Grass", 91, 110, 127, false);


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
		pokemon = new Pokemon(189, "Jumpluff", "Flying", "Grass", 118, 150, 197, false);


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
		pokemon = new Pokemon(190, "Aipom", "Normal", null, 136, 110, 112, false);


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
		pokemon = new Pokemon(191, "Sunkern", "Grass", null, 55, 60, 55, false);


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
		pokemon = new Pokemon(192, "Sunflora", "Grass", null, 185, 150, 148, false);


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

		pokemon = new Pokemon(193, "Yanma", "Bug", "Flying", 154, 130, 94, false);


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
		pokemon = new Pokemon(194, "Wooper", "Ground", "Water", 75, 110, 75, false);


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
		pokemon = new Pokemon(195, "Quagsire", "Ground", "Water", 152, 190, 152, false);


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
		pokemon = new Pokemon(196, "Espeon", "Psychic", null, 261, 130, 194, false);


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
		pokemon = new Pokemon(197, "Umbreon", "Dark", null, 126, 190, 250, false);


		qm = moves.getQuickMove("Feint Attack");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Snarl");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Foul Play");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Dark Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(198, "Murkrow", "Dark", "Flying", 175, 120, 87, false);


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
		pokemon = new Pokemon(199, "Slowking", "Psychic", "Water", 177, 190, 194, false);

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
		pokemon = new Pokemon(200, "Misdreavus", "Ghost", null, 167, 120, 167, false);


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
		pokemon = new Pokemon(201, "Unown", "Psychic", null, 136, 96, 91, false);


		qm = moves.getQuickMove("HIDEN POWER TODO");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Psychic");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(202, "Wobbuffet", "Psychic", null, 60, 380, 106, false);


		qm = moves.getQuickMove("Splash");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Counter");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Mirror Coat");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(203, "Girafarig", "Normal", "Psychic", 182, 140, 133, false);


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
		pokemon = new Pokemon(204, "Pineco", "Bug", null, 108, 100, 146, false);


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
		pokemon = new Pokemon(205, "Forretress", "Bug", "Steel", 161, 150, 242, false);


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
		pokemon = new Pokemon(206, "Dunsparce", "Normal", null, 131, 200, 131, false);


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
		pokemon = new Pokemon(207, "Gligar", "Flying", "Ground", 143, 130, 204, false);


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
		pokemon = new Pokemon(208, "Steelix", "Ground", "Steel", 148, 150, 333, false);


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
		pokemon = new Pokemon(209, "Snubbull", "Fairy", null, 137, 120, 89, false);


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
		pokemon = new Pokemon(210, "Granbull", "Fairy", null, 212, 180, 137, false);


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
		pokemon = new Pokemon(211, "Qwilfish", "Poison", "Water", 184, 130, 148, false);


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
		pokemon = new Pokemon(212, "Scizor", "Bug", "Steel", 236, 140, 191, false);


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
		pokemon = new Pokemon(213, "Shuckle", "Bug", "Rock", 17, 40, 396, false);


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
		pokemon = new Pokemon(214, "Heracross", "Bug", "Fight", 234, 160, 189, false);


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
		pokemon = new Pokemon(215, "Sneasel", "Dark", "Ice", 189, 110, 157, false);


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
		pokemon = new Pokemon(216, "Teddiursa", "Normal", null, 142, 120, 93, false);


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
		pokemon = new Pokemon(217, "Ursaring", "Normal", null, 236, 180, 144, false);


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
		pokemon = new Pokemon(218, "Slugma", "Fire", null, 118, 80, 71, false);


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
		pokemon = new Pokemon(219, "Magcargo", "Fire", "Rock", 139, 100, 209, false);

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
		pokemon = new Pokemon(220, "Swinub", "Ground", "Ice", 90, 100, 74, false);

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
		pokemon = new Pokemon(221, "Piloswine", "Ground", "Ice", 181, 200, 147, false);


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
		pokemon = new Pokemon(222, "Corsola", "Rock", "Water", 118, 110, 156, false);


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
		pokemon = new Pokemon(223, "Remoraid", "Water", null, 127, 70, 69, false);


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
		pokemon = new Pokemon(224, "Octillery", "Water", null, 197, 150, 141, false);


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
		pokemon = new Pokemon(225, "Delibird", "Flying", "Ice", 128, 90, 90, false);


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
		pokemon = new Pokemon(226, "Mantine", "Flying", "Water", 148, 130, 260, false);


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
		pokemon = new Pokemon(227, "Skarmory", "Flying", "Steel", 148, 130, 260, false);


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
		pokemon = new Pokemon(228, "Houndour", "Dark", "Fire", 152, 90, 93, false);


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

		pokemon = new Pokemon(229, "Houndoom", "Dark", "Fire", 224, 150, 159, false);


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
		pokemon = new Pokemon(230, "Kingdra", "Dragon", "Water", 194, 150, 194, false);


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

		pokemon = new Pokemon(231, "Phanpy", "Ground", null, 107, 180, 107, false);


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
		pokemon = new Pokemon(232, "Donphan", "Ground", null, 214, 180, 214, false);

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
		pokemon = new Pokemon(233, "Porygon2", "Normal", null, 198, 170, 183, false);

		qm = moves.getQuickMove("Charge Beam");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Hidden Power TODO");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Solar Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Hyper Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Zap Cannon");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(234, "Stantler", "Normal", null, 192, 146, 132, false);

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
		pokemon = new Pokemon(235, "Smeargle", "Normal", null, 40, 110, 88, false);


		qm = moves.getQuickMove("Tackle");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Struggle");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(236, "Tyrogue", "Fight", null, 64, 70, 64, false);


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
		pokemon = new Pokemon(237, "Hitmontop", "Fight", null, 173, 100, 214, false);

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
		pokemon = new Pokemon(238, "Smoochum", "Ice", "Psychic", 153, 90, 116, false);

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
		pokemon = new Pokemon(239, "Elekid", "Electric", null, 135, 90, 110, false);


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
		pokemon = new Pokemon(240, "Magby", "Fire", null, 151, 90, 108, false);


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
		pokemon = new Pokemon(241, "Miltank", "Normal", null, 157, 190, 211, false);


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
		pokemon = new Pokemon(242, "Blissey", "Normal", null, 129, 510, 229, false);


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
		pokemon = new Pokemon(243, "Raikou", "Electric", null, 241, 180, 210, false);


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
		pokemon = new Pokemon(244, "Entei", "Fire", null, 235, 230, 180, false);

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
		pokemon = new Pokemon(245, "Suicune", "Water", null, 180, 200, 235, false);


		qm = moves.getQuickMove("Extrasensory");
		pokemon.learnQuickMove(qm);
		qm = moves.getQuickMove("Snarl");
		pokemon.learnQuickMove(qm);


		cm = moves.getChargeMove("Hydro Pump");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Bubble Beam");
		pokemon.learnChargeMove(cm);
		cm = moves.getChargeMove("Water Pulse");
		pokemon.learnChargeMove(cm);


		allPokemon.add(pokemon);
		pokemon = new Pokemon(246, "Larvitar", "Ground", "Rock", 115, 100, 93, false);


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
		pokemon = new Pokemon(247, "Pupitar", "Ground", "Rock", 155, 140, 133, false);


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
		pokemon = new Pokemon(248, "Tyranitar", "Dark", "Rock", 251, 200, 212, false);

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
		pokemon = new Pokemon(249, "Lugia", "Flying", "Psychic", 193, 212, 323, false);


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
		pokemon = new Pokemon(250, "Ho-Oh", "Fire", "Flying", 263, 212, 301, false);


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
		pokemon = new Pokemon(251, "Celebi", "Grass", "Psychic", 210, 200, 210, false);


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
			if (name.equalsIgnoreCase(name))
				return poke;
		}

		System.err.println("POKEMON NOT FOUND:" + name);
		return null;

	}


	public Pokemon getPokemon(int pokdexEntry) {

		if (pokdexEntry > 251) {
			System.err.println("POKEMON INDEX NOT FOUND:" + pokdexEntry);
		}


		return allPokemon.get(pokdexEntry);
	}

}
