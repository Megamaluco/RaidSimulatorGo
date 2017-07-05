
package moves;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import pokemons.Pokedex;

public class HelperGamepressMoveReader {


	public static void main(String[] args) throws IOException {

		System.setProperty("http.agent", "Chrome");
		AllMoves am = new AllMoves();
		Pokedex pkd = new Pokedex();
		List<QuickMove> allQuickMoves = am.getAllQuickMoves();
		List<ChargeMove> allChargeMoves = am.getAllChargeMoves();

		for (int i = 1; i <= 76; i++) {
			URL gamepresspoke = new URL("https://pokemongo.gamepress.gg/pokemon/" + i);
			BufferedReader in = new BufferedReader(new InputStreamReader(gamepresspoke.openStream()));

			String inputLine;


			String name = pkd.getPokemon(i).getName();
			System.out.println("----------------------------------------");
			System.out.println(name);

			List<String> quickMovesFound = new LinkedList<>();
			List<String> chargeMovesFound = new LinkedList<>();

			while ((inputLine = in.readLine()) != null) {
				for (QuickMove qm : allQuickMoves)
					if (inputLine.contains(qm.getName()) && !quickMovesFound.contains(qm.getName())) {
						//System.out.println("qm = moves.getQuickMove(\"" + qm.getName() + "\");");
						//System.out.println("pokemon.learnQuickMove(qm);");
						quickMovesFound.add(qm.getName());
					}

				
				for (ChargeMove cm : allChargeMoves)
					if (inputLine.contains(cm.getName()) && !chargeMovesFound.contains(cm.getName())) {
						//System.out.println("cm = moves.getChargeMove(\"" + cm.getName() + "\");");
						//System.out.println("pokemon.learnChargeMove(cm);");
						chargeMovesFound.add(cm.getName());
					}


			}
			
			for(String qm: quickMovesFound){
				System.out.println("qm = moves.getQuickMove(\"" + qm + "\");");
				System.out.println("pokemon.learnQuickMove(qm);");
			}
			
			System.out.println("\n");
			
			for(String cm: chargeMovesFound){
				System.out.println("cm = moves.getChargeMove(\"" + cm + "\");");
				System.out.println("pokemon.learnChargeMove(cm);");
			}
		
					

			System.out.println("----------------------------------------");

			System.out.println("\n");



			in.close();

		}


	}


}
