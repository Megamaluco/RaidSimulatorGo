
package battle;


import moves.ChargeMove;
import moves.QuickMove;
import pokemons.RaidBoss;

public class Defender extends BattleMon {
	private RaidBoss def;


	public Defender(RaidBoss defender, QuickMove quickMove, ChargeMove chargeMove) {
		super(quickMove, chargeMove);
		this.def = defender;
		resetHp();


	}
	
	
	
	
	public void resetHp(){
		setHp(def.getHp());
	}



}