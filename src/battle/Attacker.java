
package battle;


import moves.ChargeMove;
import moves.QuickMove;
import pokemons.Pokemon;

public class Attacker extends BattleMon{

	private Pokemon attacker;

	public Attacker(Pokemon attacker, QuickMove quickMove, ChargeMove chargeMove) {
		super(quickMove, chargeMove);
		this.attacker = attacker;
		setHp(attacker.getHp());

	}

	
	public void resetHp(){
		setHp(attacker.getHp());
	}



}
